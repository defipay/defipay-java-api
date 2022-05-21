package com.defipay.api.client.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

import java.io.IOException;
import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/7 7:52 PM
 * @description
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateOrderRequest implements Serializable {
    private static final long serialVersionUID = -2750405653294423087L;
    private String notifyUrl;
    private String returnUrl;
    private String memberTransNo;
    private String amount;
    private String currency;
    private String tokenIds;

    private Boolean makingUp;



    @Override
    public String toString() {
        return "CreateOrderRequest{" +
                "notifyUrl='" + notifyUrl + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                ", memberTransNo='" + memberTransNo + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", tokenIds='" + tokenIds + '\'' +
                ", makingUp=" + makingUp +
                '}';
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
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

    public String getTokenIds() {
        return tokenIds;
    }

    public void setTokenIds(String tokenIds) {
        this.tokenIds = tokenIds;
    }

    public Boolean getMakingUp() {
        return makingUp;
    }

    public void setMakingUp(Boolean makingUp) {
        this.makingUp = makingUp;
    }
}
