package com.defipay.api.client.domain.response;


import java.io.Serializable;

/**
 * @version 1.0.0
 * @Author howard howard@defipay.biz
 * @Date 2022/2/8 11:08 AM
 * @description
 */
public class PayoutOrderQueryResponse implements Serializable {

    private static final long serialVersionUID = 6002483445295753327L;
    private Long id;

    private String transNo;

    private String memberTransNo;

    private Long tokenId;

    private String shortName;

    private String billAmount;

    private String billCurrency;

    private String txHash;

    private Long blockNumber;

    private String fromAddress;

    private String toAddress;

    private String memo;

    private String comment;

    private Long confirmNum;

    private Integer state;

    private String scanUrl;

    private Long expiredTime;

    private Long settleTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillCurrency() {
        return billCurrency;
    }

    public void setBillCurrency(String billCurrency) {
        this.billCurrency = billCurrency;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public Long getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getConfirmNum() {
        return confirmNum;
    }

    public void setConfirmNum(Long confirmNum) {
        this.confirmNum = confirmNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getScanUrl() {
        return scanUrl;
    }

    public void setScanUrl(String scanUrl) {
        this.scanUrl = scanUrl;
    }

    public Long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Long getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Long settleTime) {
        this.settleTime = settleTime;
    }

    @Override
    public String toString() {
        return "PayoutOrderQueryResponse{" +
                "id=" + id +
                ", transNo='" + transNo + '\'' +
                ", memberTransNo='" + memberTransNo + '\'' +
                ", tokenId=" + tokenId +
                ", shortName='" + shortName + '\'' +
                ", billAmount='" + billAmount + '\'' +
                ", billCurrency='" + billCurrency + '\'' +
                ", txHash='" + txHash + '\'' +
                ", blockNumber=" + blockNumber +
                ", fromAddress='" + fromAddress + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", memo='" + memo + '\'' +
                ", comment='" + comment + '\'' +
                ", confirmNum=" + confirmNum +
                ", state=" + state +
                ", scanUrl='" + scanUrl + '\'' +
                ", expiredTime=" + expiredTime +
                ", settleTime=" + settleTime +
                '}';
    }
}
