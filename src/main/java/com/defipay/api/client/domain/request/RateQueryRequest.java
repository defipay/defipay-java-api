package com.defipay.api.client.domain.request;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/28 11:24 AM
 * @description
 */
public class RateQueryRequest implements Serializable {
    private String base;
    private String quote;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "RateQueryRequest{" +
                "base='" + base + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
