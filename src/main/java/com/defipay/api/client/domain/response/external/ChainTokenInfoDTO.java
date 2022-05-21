package com.defipay.api.client.domain.response.external;


import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/3/28 3:25 PM
 * @description
 */

public class ChainTokenInfoDTO implements Serializable {

    private static final long serialVersionUID = -451701785988969558L;
    private Long id;
    private String name;
    private String displayName;
    private String shortName;
    private String logoUrl;
    private String chainAssertId;
    private String chainAssertDecimal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getChainAssertId() {
        return chainAssertId;
    }

    public void setChainAssertId(String chainAssertId) {
        this.chainAssertId = chainAssertId;
    }

    public String getChainAssertDecimal() {
        return chainAssertDecimal;
    }

    public void setChainAssertDecimal(String chainAssertDecimal) {
        this.chainAssertDecimal = chainAssertDecimal;
    }

    @Override
    public String toString() {
        return "ChainTokenInfoDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", chainAssertId='" + chainAssertId + '\'' +
                ", chainAssertDecimal='" + chainAssertDecimal + '\'' +
                '}';
    }
}
