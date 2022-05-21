package com.defipay.api.client.domain.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/3/28 9:17 PM
 * @description
 */
public class MemberUserVirtualAccountInfoResponse implements Serializable {

    private static final long serialVersionUID = -3371565919412194835L;
    private BigDecimal totalAmount;
    private BigDecimal frozenAmount;
    private BigDecimal availableAmount;
    private Long tokenId;
    private String shortName;
    private String name;
    private String displayName;
    private String logoUrl;

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "MemberUserVirtualAccountInfoResponse{" +
                "totalAmount=" + totalAmount +
                ", frozenAmount=" + frozenAmount +
                ", availableAmount=" + availableAmount +
                ", tokenId=" + tokenId +
                ", shortName='" + shortName + '\'' +
                ", name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                '}';
    }
}
