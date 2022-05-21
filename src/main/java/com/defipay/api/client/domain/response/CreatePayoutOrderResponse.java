package com.defipay.api.client.domain.response;


import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/8 11:06 AM
 * @description
 */

public class CreatePayoutOrderResponse implements Serializable {
    private static final long serialVersionUID = -7822300827895914522L;
    private String transNo;
    private String memberTransNo;
    private String currency;
    private String amount;
    private Long tokenId;
    private String tokenAmount;

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
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

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenAmount() {
        return tokenAmount;
    }

    public void setTokenAmount(String tokenAmount) {
        this.tokenAmount = tokenAmount;
    }

    @Override
    public String toString() {
        return "CreatePayoutOrderResponse{" +
                "transNo='" + transNo + '\'' +
                ", memberTransNo='" + memberTransNo + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", tokenId=" + tokenId +
                ", tokenAmount='" + tokenAmount + '\'' +
                '}';
    }
}
