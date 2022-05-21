package com.defipay.api.client.impl;

import com.defipay.api.client.ApiSigner;
import com.defipay.api.client.DefipayApiRestClient;
import com.defipay.api.client.config.Env;
import com.defipay.api.client.domain.ApiResponse;
import com.defipay.api.client.domain.request.*;
import com.defipay.api.client.domain.response.*;
import com.defipay.api.client.domain.response.external.ChainTokenInfoDTO;
import com.defipay.api.client.domain.response.external.CoinApiAssetInfoDTO;

import java.util.List;

import static com.defipay.api.client.impl.DefipayApiServiceGenerator.createService;
import static com.defipay.api.client.impl.DefipayApiServiceGenerator.executeSync;

public class DefipayApiRestClientImpl implements DefipayApiRestClient {
    private final DefipayApiService defipayApiService;

    public DefipayApiRestClientImpl(ApiSigner signer, Env env, boolean debug) {
        defipayApiService = createService(DefipayApiService.class, signer, env, debug);
    }

    @Override
    public ApiResponse<CreateOrderResponse> createOrder(CreateOrderRequest request) {
        return executeSync(defipayApiService.createOrder(request.getNotifyUrl() ,request.getNotifyUrl(), request.getMemberTransNo(), request.getAmount()
                                                            ,request.getCurrency(), request.getTokenIds(), request.getMakingUp()));
    }

    @Override
    public ApiResponse<OrderQueryResponse> queryOrder(String transNo) {
        return executeSync(defipayApiService.queryOrder(transNo));
    }

    @Override
    public ApiResponse<CreatePayoutOrderResponse> createPayoutOrder(CreatePayoutOrderRequest request) {
        return executeSync(defipayApiService.createPayoutOrder(request.getNotifyUrl(), request.getMemberTransNo(), request.getAmount(), request.getCurrency(),
                            request.getToAddress(), request.getTokenId(), request.getPayAmount()));
    }

    @Override
    public ApiResponse<PayoutOrderQueryResponse> queryPayoutOrder(String transNo) {
        return executeSync(defipayApiService.queryPayoutOrder(transNo));
    }

    @Override
    public ApiResponse<List<CoinApiAssetInfoDTO>> queryBillCurrency(Integer offset, Integer limit) {
        return executeSync(defipayApiService.queryBillCurrency(offset, limit));
    }

    @Override
    public ApiResponse<List<ChainTokenInfoDTO>> queryPayCurrency(Integer offset, Integer limit) {
        return executeSync(defipayApiService.queryPayCurrency(offset, limit));
    }

    @Override
    public ApiResponse<List<MemberUserVirtualAccountInfoResponse>> queryCryptoAmount() {
        return executeSync(defipayApiService.queryCryptoAmount());
    }

    @Override
    public ApiResponse<List<OrderQueryResponse>> queryOrderList(Integer offset, Integer limit) {
        return executeSync(defipayApiService.queryOrderList(offset, limit));
    }

    @Override
    public ApiResponse<OrderQueryResponse> getOrderDetail(String transNo) {
        return executeSync(defipayApiService.getOrderDetail(transNo));
    }

    @Override
    public ApiResponse<RateDTO> queryRate(String base, String quote) {
        return executeSync(defipayApiService.queryRate(base, quote));
    }

}
