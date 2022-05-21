package com.defipay.api.client.domain.request;


import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/8 11:07 AM
 * @description
 */
public class PayoutOrderQueryRequest implements Serializable {
    private static final long serialVersionUID = -8627970975819974294L;
    private String memberTransNo;

    private String transNo;

    @Override
    public String toString() {
        return "PayoutOrderQueryRequest{" +
                "memberTransNo='" + memberTransNo + '\'' +
                ", transNo='" + transNo + '\'' +
                '}';
    }

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
}
