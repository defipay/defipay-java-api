package com.defipay.api.client.impl;


import com.defipay.api.client.domain.ApiResponse;
import com.defipay.api.client.domain.response.*;
import com.defipay.api.client.domain.response.external.ChainTokenInfoDTO;
import com.defipay.api.client.domain.response.external.CoinApiAssetInfoDTO;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface DefipayApiService {

    @FormUrlEncoded
    @POST("/api-service/v1/external/pay/create")
    Call<ApiResponse<CreateOrderResponse>> createOrder(@Field("notifyUrl") String notifyUrl, @Field("returnUrl") String returnUrl
                            , @Field("memberTransNo") String memberTransNo, @Field("amount") String amount
                            , @Field("currency") String currency, @Field("tokenIds") String tokenIds
                            , @Field("makingUp") Boolean makingUp, @Field("redirectUrl") String redirectUrl);
    

    @FormUrlEncoded
    @POST("/api-service/v1/external/pay/query")
    Call<ApiResponse<OrderQueryResponse>> queryOrder(@Field("transNo") String transNo);

    @FormUrlEncoded
    @POST("/api-service/v1/external/payout/create")
    Call<ApiResponse<CreatePayoutOrderResponse>> createPayoutOrder(@Field("notifyUrl") String notifyUrl, @Field("memberTransNo") String memberTransNo
            , @Field("amount") String amount , @Field("currency") String currency
            , @Field("toAddress") String toAddress
            , @Field("tokenId") Long tokenId
            , @Field("payAmount") String payAmount);

    @FormUrlEncoded
    @POST("/api-service/v1/external/payout/query")
    Call<ApiResponse<PayoutOrderQueryResponse>> queryPayoutOrder(@Field("transNo") String transNo);

    @FormUrlEncoded
    @POST("/api-service/v1/external/billCurrency/query")
    Call<ApiResponse<List<CoinApiAssetInfoDTO>>> queryBillCurrency(@Field("offset") Integer offset , @Field("limit") Integer limit);

    @FormUrlEncoded
    @POST("/api-service/v1/external/token/query")
    Call<ApiResponse<List<ChainTokenInfoDTO>>> queryPayCurrency(@Field("offset") Integer offset , @Field("limit") Integer limit);

    @GET("/api-service/v1/external/account/query")
    Call<ApiResponse<List<MemberUserVirtualAccountInfoResponse>>> queryCryptoAmount();

    @FormUrlEncoded
    @POST("/api-service/v1/external/order/list")
    Call<ApiResponse<List<OrderQueryResponse>>> queryOrderList(@Field("offset") Integer offset , @Field("limit") Integer limit);

    @GET("/api-service/v1/external/order/getDetail")
    Call<ApiResponse<OrderQueryResponse>> getOrderDetail(@Query("transNo") String transNo);

    @FormUrlEncoded
    @POST("/api-service/v1/external/rate/query")
    Call<ApiResponse<RateDTO>> queryRate(@Field("base") String base , @Field("quote") String quote);

    @FormUrlEncoded
    @POST("/api-service/v1/external/rate/batchQuery")
    Call<ApiResponse<List<RateDTO>>> queryRates(@Field("bases") String bases , @Field("quotes") String quotes);

}
