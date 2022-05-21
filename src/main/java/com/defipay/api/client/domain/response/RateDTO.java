package com.defipay.api.client.domain.response;

import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/3/4 11:31 AM
 * @description
 */
public class RateDTO implements Serializable {
    public RateDTO() {
    }
    private static final long serialVersionUID = -5386305188426845312L;
    // 汇率
    private String rate;
    // 汇率时间
    private Long rateTime;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Long getRateTime() {
        return rateTime;
    }

    public void setRateTime(Long rateTime) {
        this.rateTime = rateTime;
    }

    @Override
    public String toString() {
        return "RateDTO{" +
                "rate='" + rate + '\'' +
                ", rateTime=" + rateTime +
                '}';
    }
}
