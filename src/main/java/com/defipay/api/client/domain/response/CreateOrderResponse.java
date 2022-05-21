package com.defipay.api.client.domain.response;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/7 8:23 PM
 * @description
 */
public class CreateOrderResponse implements Serializable {
    private static final long serialVersionUID = -7385396292265077189L;

    private String cashierUrl;
    private List<PayOrderAddressInfoDTO> tokenInfo;
    private String memberTransNo;
    private String currency;
    private String amount;
    private String transNo;


    public String getCashierUrl() {
        return cashierUrl;
    }

    public void setCashierUrl(String cashierUrl) {
        this.cashierUrl = cashierUrl;
    }

    public List<PayOrderAddressInfoDTO> getTokenInfo() {
        return tokenInfo;
    }

    public void setTokenInfo(List<PayOrderAddressInfoDTO> tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public String getMemberTransNo() {
        return memberTransNo;
    }

    public void setMemberTransNo(String memberTransNo) {
        this.memberTransNo = memberTransNo;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    @Override
    public String toString() {
        return "CreateOrderResponse{" +
                "cashierUrl='" + cashierUrl + '\'' +
                ", tokenInfo=" + tokenInfo +
                ", memberTransNo='" + memberTransNo + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", transNo='" + transNo + '\'' +
                '}';
    }
}
