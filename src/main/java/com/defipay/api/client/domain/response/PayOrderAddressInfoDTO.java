package com.defipay.api.client.domain.response;

import java.io.Serializable;

public class PayOrderAddressInfoDTO implements Serializable {

    private String address;

    private String amount;

    private String shortName;

    private String displayName;

    private String logoUrl;

    private String coinType;

    private Integer chainId;

    private Long chainAssertDecimal;

    private String chainAssertId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public Long getChainAssertDecimal() {
        return chainAssertDecimal;
    }

    public void setChainAssertDecimal(Long chainAssertDecimal) {
        this.chainAssertDecimal = chainAssertDecimal;
    }

    public String getChainAssertId() {
        return chainAssertId;
    }

    public void setChainAssertId(String chainAssertId) {
        this.chainAssertId = chainAssertId;
    }

    @Override
    public String toString() {
        return "PayOrderAddressInfoDTO{" +
                "address='" + address + '\'' +
                ", amount='" + amount + '\'' +
                ", shortName='" + shortName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", coinType='" + coinType + '\'' +
                ", chainId=" + chainId +
                ", chainAssertDecimal=" + chainAssertDecimal +
                ", chainAssertId='" + chainAssertId + '\'' +
                '}';
    }
}
