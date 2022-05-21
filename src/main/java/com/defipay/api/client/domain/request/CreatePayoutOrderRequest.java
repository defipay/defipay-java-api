package com.defipay.api.client.domain.request;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/8 11:05 AM
 * @description
 */
public class CreatePayoutOrderRequest implements Serializable {
    private static final long serialVersionUID = -2750405653294423087L;
    private String notifyUrl;
    private String memberTransNo;
    private String amount;
    private String currency;
    private String toAddress;
    private Long tokenId;
    private String payAmount;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMemberTransNo() {
        return memberTransNo;
    }

    public void setMemberTransNo(String memberTransNo) {
        this.memberTransNo = memberTransNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    @Override
    public String toString() {
        return "CreatePayoutOrderRequest{" +
                "notifyUrl='" + notifyUrl + '\'' +
                ", memberTransNo='" + memberTransNo + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", tokenId=" + tokenId +
                ", payAmount='" + payAmount + '\'' +
                '}';
    }
}
