package com.defipay.api.client.domain.response.external;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/3/28 3:22 PM
 * @description
 */
public class CoinApiAssetInfoDTO implements Serializable {

    private String assertId;

    private Integer typeIsCrypto;

    public String getAssertId() {
        return assertId;
    }

    public void setAssertId(String assertId) {
        this.assertId = assertId;
    }

    public Integer getTypeIsCrypto() {
        return typeIsCrypto;
    }

    public void setTypeIsCrypto(Integer typeIsCrypto) {
        this.typeIsCrypto = typeIsCrypto;
    }

    @Override
    public String toString() {
        return "CoinApiAssetInfoDTO{" +
                "assertId='" + assertId + '\'' +
                ", typeIsCrypto=" + typeIsCrypto +
                '}';
    }
}
