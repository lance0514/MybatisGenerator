package com.generator.mybatis.po;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentBillGroup {
    private String billGroupId;

    private String buyerPartyId;

    private String buyerName;

    private String sellerPartyId;

    private String sellerName;

    private String invoiceType;

    private String type;

    private BigDecimal dealAmount;

    private BigDecimal dealQuantity;

    private String buyerCheck;

    private String sellerCheck;

    private String checkStatus;

    private String invoiceStatus;

    private Integer settleStatus;

    private Date lastUpdatedStamp;

    private Date lastUpdatedTxStamp;

    private Date createdStamp;

    private Date createdTxStamp;

    private String paymentId;

    private BigDecimal repaymentAmount;

    private BigDecimal discountAmount;

    private BigDecimal invoiceAmount;

    private BigDecimal financingLastAmount;

    private BigDecimal financingFee;

    private BigDecimal dealQuantityExcludesCassLoan;

    private String isCassLoan;

    private BigDecimal cassDiscountAmount;

    private Date updateDate;

    private String paymentMethodId;

    private String tradeNo;

    private String punishRate;

    private Date invoiceDate;

    private BigDecimal punishAmount;

    private String isOverdue;

    private Integer repaireOverdueDay;

    private Integer supplierOverdueDay;

    private Integer platformOverdueDay;

    private Date maxDeadlineDate;

    public String getBillGroupId() {
        return billGroupId;
    }

    public void setBillGroupId(String billGroupId) {
        this.billGroupId = billGroupId == null ? null : billGroupId.trim();
    }

    public String getBuyerPartyId() {
        return buyerPartyId;
    }

    public void setBuyerPartyId(String buyerPartyId) {
        this.buyerPartyId = buyerPartyId == null ? null : buyerPartyId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getSellerPartyId() {
        return sellerPartyId;
    }

    public void setSellerPartyId(String sellerPartyId) {
        this.sellerPartyId = sellerPartyId == null ? null : sellerPartyId.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public BigDecimal getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(BigDecimal dealAmount) {
        this.dealAmount = dealAmount;
    }

    public BigDecimal getDealQuantity() {
        return dealQuantity;
    }

    public void setDealQuantity(BigDecimal dealQuantity) {
        this.dealQuantity = dealQuantity;
    }

    public String getBuyerCheck() {
        return buyerCheck;
    }

    public void setBuyerCheck(String buyerCheck) {
        this.buyerCheck = buyerCheck == null ? null : buyerCheck.trim();
    }

    public String getSellerCheck() {
        return sellerCheck;
    }

    public void setSellerCheck(String sellerCheck) {
        this.sellerCheck = sellerCheck == null ? null : sellerCheck.trim();
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus == null ? null : checkStatus.trim();
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus == null ? null : invoiceStatus.trim();
    }

    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public BigDecimal getFinancingLastAmount() {
        return financingLastAmount;
    }

    public void setFinancingLastAmount(BigDecimal financingLastAmount) {
        this.financingLastAmount = financingLastAmount;
    }

    public BigDecimal getFinancingFee() {
        return financingFee;
    }

    public void setFinancingFee(BigDecimal financingFee) {
        this.financingFee = financingFee;
    }

    public BigDecimal getDealQuantityExcludesCassLoan() {
        return dealQuantityExcludesCassLoan;
    }

    public void setDealQuantityExcludesCassLoan(BigDecimal dealQuantityExcludesCassLoan) {
        this.dealQuantityExcludesCassLoan = dealQuantityExcludesCassLoan;
    }

    public String getIsCassLoan() {
        return isCassLoan;
    }

    public void setIsCassLoan(String isCassLoan) {
        this.isCassLoan = isCassLoan == null ? null : isCassLoan.trim();
    }

    public BigDecimal getCassDiscountAmount() {
        return cassDiscountAmount;
    }

    public void setCassDiscountAmount(BigDecimal cassDiscountAmount) {
        this.cassDiscountAmount = cassDiscountAmount;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId == null ? null : paymentMethodId.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getPunishRate() {
        return punishRate;
    }

    public void setPunishRate(String punishRate) {
        this.punishRate = punishRate == null ? null : punishRate.trim();
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getPunishAmount() {
        return punishAmount;
    }

    public void setPunishAmount(BigDecimal punishAmount) {
        this.punishAmount = punishAmount;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue == null ? null : isOverdue.trim();
    }

    public Integer getRepaireOverdueDay() {
        return repaireOverdueDay;
    }

    public void setRepaireOverdueDay(Integer repaireOverdueDay) {
        this.repaireOverdueDay = repaireOverdueDay;
    }

    public Integer getSupplierOverdueDay() {
        return supplierOverdueDay;
    }

    public void setSupplierOverdueDay(Integer supplierOverdueDay) {
        this.supplierOverdueDay = supplierOverdueDay;
    }

    public Integer getPlatformOverdueDay() {
        return platformOverdueDay;
    }

    public void setPlatformOverdueDay(Integer platformOverdueDay) {
        this.platformOverdueDay = platformOverdueDay;
    }

    public Date getMaxDeadlineDate() {
        return maxDeadlineDate;
    }

    public void setMaxDeadlineDate(Date maxDeadlineDate) {
        this.maxDeadlineDate = maxDeadlineDate;
    }
}