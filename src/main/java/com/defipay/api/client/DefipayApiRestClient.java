package com.defipay.api.client;

import com.defipay.api.client.domain.ApiResponse;
import com.defipay.api.client.domain.request.*;
import com.defipay.api.client.domain.response.*;
import com.defipay.api.client.domain.response.external.ChainTokenInfoDTO;
import com.defipay.api.client.domain.response.external.CoinApiAssetInfoDTO;

import java.util.List;

public interface DefipayApiRestClient {


     ApiResponse<CreateOrderResponse> createOrder(CreateOrderRequest request);

     ApiResponse<OrderQueryResponse> queryOrder(String transNo);

     ApiResponse<CreatePayoutOrderResponse> createPayoutOrder(CreatePayoutOrderRequest request);

     ApiResponse<PayoutOrderQueryResponse> queryPayoutOrder(String transNo);

     ApiResponse<List<CoinApiAssetInfoDTO>> queryBillCurrency(Integer offset, Integer limit);

     ApiResponse<List<ChainTokenInfoDTO>> queryPayCurrency(Integer offset, Integer limit);

     ApiResponse<List<MemberUserVirtualAccountInfoResponse>> queryCryptoAmount();

     ApiResponse<List<OrderQueryResponse>> queryOrderList(Integer offset, Integer limit);

     ApiResponse<OrderQueryResponse> getOrderDetail(String transNo);

     ApiResponse<RateDTO> queryRate(String base , String quote);

     ApiResponse<List<RateDTO>> queryRates(String bases, String quotes);
}
