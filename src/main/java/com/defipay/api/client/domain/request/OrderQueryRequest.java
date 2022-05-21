package com.defipay.api.client.domain.request;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/8 11:03 AM
 * @description
 */
public class OrderQueryRequest implements Serializable {

    private String memberTransNo;

    private String transNo;

    public String getMemberTransNo() {
        return memberTransNo;
    }

    public void setMemberTransNo(String memberTransNo) {
        this.memberTransNo = memberTransNo;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    @Override
    public String toString() {
        return "OrderQueryRequest{" +
                "memberTransNo='" + memberTransNo + '\'' +
                ", transNo='" + transNo + '\'' +
                '}';
    }
}
