package com.defipay.api.client.impl;

import com.defipay.api.client.ApiSigner;
import com.defipay.api.client.DefipayApiError;
import com.defipay.api.client.config.Env;
import com.defipay.api.client.domain.ApiResponse;
import com.defipay.api.client.exception.DefipayApiException;
import com.defipay.api.client.jackson.JacksonConverterFactory;
import com.defipay.api.client.security.AuthenticationInterceptor;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

/**
 */
public class DefipayApiServiceGenerator {

    private static final OkHttpClient sharedClient;
    private static final Converter.Factory converterFactory = JacksonConverterFactory.create();
    @SuppressWarnings("unchecked")
    private static final Converter<ResponseBody, DefipayApiError> errorBodyConverter =
            (Converter<ResponseBody, DefipayApiError>) converterFactory.responseBodyConverter(
                    DefipayApiError.class, new Annotation[0], null);

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        sharedClient = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .pingInterval(20, TimeUnit.SECONDS)
                .build();
    }

    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, null, null, false);
    }

    public static <S> S createService(Class<S> serviceClass, ApiSigner signer, Env env, boolean debug) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(env.host)
                .addConverterFactory(converterFactory);

        AuthenticationInterceptor interceptor = new AuthenticationInterceptor(signer, env.defipayPub, debug);
        OkHttpClient adaptedClient = sharedClient.newBuilder().addInterceptor(interceptor).build();
        retrofitBuilder.client(adaptedClient);

        Retrofit retrofit = retrofitBuilder.build();
        return retrofit.create(serviceClass);
    }

    /**
     * Execute a REST call and block until the response is received.
     */
    public static <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                DefipayApiError apiError = getCoboApiError(response);
                return (T) new ApiResponse<>(
                        null, false, apiError.getErrorCode(),
                        apiError.getErrorMessage()
                );
            }
        } catch (IOException e) {
            throw new DefipayApiException(e);
        }
    }

    /**
     * Extracts and converts the response error body into an object.
     */
    public static DefipayApiError getCoboApiError(Response<?> response) throws IOException, DefipayApiException {
        //System.out.println(response.errorBody().string());
        ResponseBody errorBody = response.errorBody();
        //System.out.println(errorBody.string());
        ObjectMapper mapper = new ObjectMapper();
        String s = errorBody.string();
        return mapper.readValue(s, DefipayApiError.class);
    }

    /**
     * Returns the shared OkHttpClient instance.
     */
    public static OkHttpClient getSharedClient() {
        return sharedClient;
    }
}
