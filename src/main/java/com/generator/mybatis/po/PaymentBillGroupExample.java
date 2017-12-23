package com.generator.mybatis.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentBillGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentBillGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBillGroupIdIsNull() {
            addCriterion("BILL_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdIsNotNull() {
            addCriterion("BILL_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdEqualTo(String value) {
            addCriterion("BILL_GROUP_ID =", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdNotEqualTo(String value) {
            addCriterion("BILL_GROUP_ID <>", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdGreaterThan(String value) {
            addCriterion("BILL_GROUP_ID >", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_GROUP_ID >=", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdLessThan(String value) {
            addCriterion("BILL_GROUP_ID <", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdLessThanOrEqualTo(String value) {
            addCriterion("BILL_GROUP_ID <=", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdLike(String value) {
            addCriterion("BILL_GROUP_ID like", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdNotLike(String value) {
            addCriterion("BILL_GROUP_ID not like", value, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdIn(List<String> values) {
            addCriterion("BILL_GROUP_ID in", values, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdNotIn(List<String> values) {
            addCriterion("BILL_GROUP_ID not in", values, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdBetween(String value1, String value2) {
            addCriterion("BILL_GROUP_ID between", value1, value2, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBillGroupIdNotBetween(String value1, String value2) {
            addCriterion("BILL_GROUP_ID not between", value1, value2, "billGroupId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdIsNull() {
            addCriterion("BUYER_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdIsNotNull() {
            addCriterion("BUYER_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdEqualTo(String value) {
            addCriterion("BUYER_PARTY_ID =", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdNotEqualTo(String value) {
            addCriterion("BUYER_PARTY_ID <>", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdGreaterThan(String value) {
            addCriterion("BUYER_PARTY_ID >", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_PARTY_ID >=", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdLessThan(String value) {
            addCriterion("BUYER_PARTY_ID <", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_PARTY_ID <=", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdLike(String value) {
            addCriterion("BUYER_PARTY_ID like", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdNotLike(String value) {
            addCriterion("BUYER_PARTY_ID not like", value, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdIn(List<String> values) {
            addCriterion("BUYER_PARTY_ID in", values, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdNotIn(List<String> values) {
            addCriterion("BUYER_PARTY_ID not in", values, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdBetween(String value1, String value2) {
            addCriterion("BUYER_PARTY_ID between", value1, value2, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerPartyIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_PARTY_ID not between", value1, value2, "buyerPartyId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdIsNull() {
            addCriterion("SELLER_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdIsNotNull() {
            addCriterion("SELLER_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdEqualTo(String value) {
            addCriterion("SELLER_PARTY_ID =", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdNotEqualTo(String value) {
            addCriterion("SELLER_PARTY_ID <>", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdGreaterThan(String value) {
            addCriterion("SELLER_PARTY_ID >", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_PARTY_ID >=", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdLessThan(String value) {
            addCriterion("SELLER_PARTY_ID <", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdLessThanOrEqualTo(String value) {
            addCriterion("SELLER_PARTY_ID <=", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdLike(String value) {
            addCriterion("SELLER_PARTY_ID like", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdNotLike(String value) {
            addCriterion("SELLER_PARTY_ID not like", value, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdIn(List<String> values) {
            addCriterion("SELLER_PARTY_ID in", values, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdNotIn(List<String> values) {
            addCriterion("SELLER_PARTY_ID not in", values, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdBetween(String value1, String value2) {
            addCriterion("SELLER_PARTY_ID between", value1, value2, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerPartyIdNotBetween(String value1, String value2) {
            addCriterion("SELLER_PARTY_ID not between", value1, value2, "sellerPartyId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("SELLER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("SELLER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("SELLER_NAME =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("SELLER_NAME <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("SELLER_NAME >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("SELLER_NAME <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("SELLER_NAME <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("SELLER_NAME like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("SELLER_NAME not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("SELLER_NAME in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("SELLER_NAME not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("SELLER_NAME between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("SELLER_NAME not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("INVOICE_TYPE like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("INVOICE_TYPE not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNull() {
            addCriterion("DEAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNotNull() {
            addCriterion("DEAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDealAmountEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT =", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT <>", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThan(BigDecimal value) {
            addCriterion("DEAL_AMOUNT >", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT >=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThan(BigDecimal value) {
            addCriterion("DEAL_AMOUNT <", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_AMOUNT <=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountIn(List<BigDecimal> values) {
            addCriterion("DEAL_AMOUNT in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEAL_AMOUNT not in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_AMOUNT between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_AMOUNT not between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealQuantityIsNull() {
            addCriterion("DEAL_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andDealQuantityIsNotNull() {
            addCriterion("DEAL_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andDealQuantityEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY =", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityNotEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY <>", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityGreaterThan(BigDecimal value) {
            addCriterion("DEAL_QUANTITY >", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY >=", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityLessThan(BigDecimal value) {
            addCriterion("DEAL_QUANTITY <", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY <=", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityIn(List<BigDecimal> values) {
            addCriterion("DEAL_QUANTITY in", values, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityNotIn(List<BigDecimal> values) {
            addCriterion("DEAL_QUANTITY not in", values, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_QUANTITY between", value1, value2, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_QUANTITY not between", value1, value2, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckIsNull() {
            addCriterion("BUYER_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckIsNotNull() {
            addCriterion("BUYER_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckEqualTo(String value) {
            addCriterion("BUYER_CHECK =", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckNotEqualTo(String value) {
            addCriterion("BUYER_CHECK <>", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckGreaterThan(String value) {
            addCriterion("BUYER_CHECK >", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_CHECK >=", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckLessThan(String value) {
            addCriterion("BUYER_CHECK <", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckLessThanOrEqualTo(String value) {
            addCriterion("BUYER_CHECK <=", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckLike(String value) {
            addCriterion("BUYER_CHECK like", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckNotLike(String value) {
            addCriterion("BUYER_CHECK not like", value, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckIn(List<String> values) {
            addCriterion("BUYER_CHECK in", values, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckNotIn(List<String> values) {
            addCriterion("BUYER_CHECK not in", values, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckBetween(String value1, String value2) {
            addCriterion("BUYER_CHECK between", value1, value2, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andBuyerCheckNotBetween(String value1, String value2) {
            addCriterion("BUYER_CHECK not between", value1, value2, "buyerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckIsNull() {
            addCriterion("SELLER_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andSellerCheckIsNotNull() {
            addCriterion("SELLER_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andSellerCheckEqualTo(String value) {
            addCriterion("SELLER_CHECK =", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckNotEqualTo(String value) {
            addCriterion("SELLER_CHECK <>", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckGreaterThan(String value) {
            addCriterion("SELLER_CHECK >", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER_CHECK >=", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckLessThan(String value) {
            addCriterion("SELLER_CHECK <", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckLessThanOrEqualTo(String value) {
            addCriterion("SELLER_CHECK <=", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckLike(String value) {
            addCriterion("SELLER_CHECK like", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckNotLike(String value) {
            addCriterion("SELLER_CHECK not like", value, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckIn(List<String> values) {
            addCriterion("SELLER_CHECK in", values, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckNotIn(List<String> values) {
            addCriterion("SELLER_CHECK not in", values, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckBetween(String value1, String value2) {
            addCriterion("SELLER_CHECK between", value1, value2, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andSellerCheckNotBetween(String value1, String value2) {
            addCriterion("SELLER_CHECK not between", value1, value2, "sellerCheck");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(String value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(String value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(String value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(String value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(String value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLike(String value) {
            addCriterion("CHECK_STATUS like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotLike(String value) {
            addCriterion("CHECK_STATUS not like", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<String> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<String> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(String value1, String value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("INVOICE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("INVOICE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("INVOICE_STATUS =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("INVOICE_STATUS <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("INVOICE_STATUS >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_STATUS >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("INVOICE_STATUS <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_STATUS <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLike(String value) {
            addCriterion("INVOICE_STATUS like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("INVOICE_STATUS not like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("INVOICE_STATUS in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("INVOICE_STATUS not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("INVOICE_STATUS between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("INVOICE_STATUS not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("settle_status is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(Integer value) {
            addCriterion("settle_status =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(Integer value) {
            addCriterion("settle_status <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(Integer value) {
            addCriterion("settle_status >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_status >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(Integer value) {
            addCriterion("settle_status <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("settle_status <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<Integer> values) {
            addCriterion("settle_status in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<Integer> values) {
            addCriterion("settle_status not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(Integer value1, Integer value2) {
            addCriterion("settle_status between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_status not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNull() {
            addCriterion("LAST_UPDATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIsNotNull() {
            addCriterion("LAST_UPDATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP =", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <>", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP >", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP >=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_STAMP <", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_STAMP <=", value, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_STAMP not in", values, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_STAMP not between", value1, value2, "lastUpdatedStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIsNotNull() {
            addCriterion("LAST_UPDATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP =", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <>", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP >=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThan(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATED_TX_STAMP <=", value, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotIn(List<Date> values) {
            addCriterion("LAST_UPDATED_TX_STAMP not in", values, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATED_TX_STAMP not between", value1, value2, "lastUpdatedTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNull() {
            addCriterion("CREATED_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIsNotNull() {
            addCriterion("CREATED_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedStampEqualTo(Date value) {
            addCriterion("CREATED_STAMP =", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotEqualTo(Date value) {
            addCriterion("CREATED_STAMP <>", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThan(Date value) {
            addCriterion("CREATED_STAMP >", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP >=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThan(Date value) {
            addCriterion("CREATED_STAMP <", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_STAMP <=", value, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampIn(List<Date> values) {
            addCriterion("CREATED_STAMP in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotIn(List<Date> values) {
            addCriterion("CREATED_STAMP not in", values, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_STAMP not between", value1, value2, "createdStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNull() {
            addCriterion("CREATED_TX_STAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIsNotNull() {
            addCriterion("CREATED_TX_STAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP =", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <>", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThan(Date value) {
            addCriterion("CREATED_TX_STAMP >", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP >=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThan(Date value) {
            addCriterion("CREATED_TX_STAMP <", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TX_STAMP <=", value, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotIn(List<Date> values) {
            addCriterion("CREATED_TX_STAMP not in", values, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andCreatedTxStampNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TX_STAMP not between", value1, value2, "createdTxStamp");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("PAYMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("PAYMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(String value) {
            addCriterion("PAYMENT_ID =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(String value) {
            addCriterion("PAYMENT_ID <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(String value) {
            addCriterion("PAYMENT_ID >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ID >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(String value) {
            addCriterion("PAYMENT_ID <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_ID <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLike(String value) {
            addCriterion("PAYMENT_ID like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotLike(String value) {
            addCriterion("PAYMENT_ID not like", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<String> values) {
            addCriterion("PAYMENT_ID in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<String> values) {
            addCriterion("PAYMENT_ID not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_ID between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_ID not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNull() {
            addCriterion("REPAYMENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIsNotNull() {
            addCriterion("REPAYMENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_AMOUNT =", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_AMOUNT <>", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("REPAYMENT_AMOUNT >", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_AMOUNT >=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThan(BigDecimal value) {
            addCriterion("REPAYMENT_AMOUNT <", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENT_AMOUNT <=", value, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountIn(List<BigDecimal> values) {
            addCriterion("REPAYMENT_AMOUNT in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("REPAYMENT_AMOUNT not in", values, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENT_AMOUNT between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENT_AMOUNT not between", value1, value2, "repaymentAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_AMOUNT <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_AMOUNT not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_AMOUNT not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNull() {
            addCriterion("INVOICE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNotNull() {
            addCriterion("INVOICE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountEqualTo(BigDecimal value) {
            addCriterion("INVOICE_AMOUNT =", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotEqualTo(BigDecimal value) {
            addCriterion("INVOICE_AMOUNT <>", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThan(BigDecimal value) {
            addCriterion("INVOICE_AMOUNT >", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_AMOUNT >=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThan(BigDecimal value) {
            addCriterion("INVOICE_AMOUNT <", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVOICE_AMOUNT <=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIn(List<BigDecimal> values) {
            addCriterion("INVOICE_AMOUNT in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotIn(List<BigDecimal> values) {
            addCriterion("INVOICE_AMOUNT not in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_AMOUNT between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVOICE_AMOUNT not between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountIsNull() {
            addCriterion("FINANCING_LAST_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountIsNotNull() {
            addCriterion("FINANCING_LAST_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountEqualTo(BigDecimal value) {
            addCriterion("FINANCING_LAST_AMOUNT =", value, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountNotEqualTo(BigDecimal value) {
            addCriterion("FINANCING_LAST_AMOUNT <>", value, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountGreaterThan(BigDecimal value) {
            addCriterion("FINANCING_LAST_AMOUNT >", value, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCING_LAST_AMOUNT >=", value, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountLessThan(BigDecimal value) {
            addCriterion("FINANCING_LAST_AMOUNT <", value, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCING_LAST_AMOUNT <=", value, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountIn(List<BigDecimal> values) {
            addCriterion("FINANCING_LAST_AMOUNT in", values, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountNotIn(List<BigDecimal> values) {
            addCriterion("FINANCING_LAST_AMOUNT not in", values, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCING_LAST_AMOUNT between", value1, value2, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingLastAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCING_LAST_AMOUNT not between", value1, value2, "financingLastAmount");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeIsNull() {
            addCriterion("FINANCING_FEE is null");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeIsNotNull() {
            addCriterion("FINANCING_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeEqualTo(BigDecimal value) {
            addCriterion("FINANCING_FEE =", value, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeNotEqualTo(BigDecimal value) {
            addCriterion("FINANCING_FEE <>", value, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeGreaterThan(BigDecimal value) {
            addCriterion("FINANCING_FEE >", value, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCING_FEE >=", value, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeLessThan(BigDecimal value) {
            addCriterion("FINANCING_FEE <", value, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCING_FEE <=", value, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeIn(List<BigDecimal> values) {
            addCriterion("FINANCING_FEE in", values, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeNotIn(List<BigDecimal> values) {
            addCriterion("FINANCING_FEE not in", values, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCING_FEE between", value1, value2, "financingFee");
            return (Criteria) this;
        }

        public Criteria andFinancingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCING_FEE not between", value1, value2, "financingFee");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanIsNull() {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN is null");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanIsNotNull() {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN is not null");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN =", value, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanNotEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN <>", value, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanGreaterThan(BigDecimal value) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN >", value, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN >=", value, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanLessThan(BigDecimal value) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN <", value, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN <=", value, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanIn(List<BigDecimal> values) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN in", values, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanNotIn(List<BigDecimal> values) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN not in", values, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN between", value1, value2, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andDealQuantityExcludesCassLoanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEAL_QUANTITY_EXCLUDES_CASS_LOAN not between", value1, value2, "dealQuantityExcludesCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanIsNull() {
            addCriterion("IS_CASS_LOAN is null");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanIsNotNull() {
            addCriterion("IS_CASS_LOAN is not null");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanEqualTo(String value) {
            addCriterion("IS_CASS_LOAN =", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanNotEqualTo(String value) {
            addCriterion("IS_CASS_LOAN <>", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanGreaterThan(String value) {
            addCriterion("IS_CASS_LOAN >", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CASS_LOAN >=", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanLessThan(String value) {
            addCriterion("IS_CASS_LOAN <", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanLessThanOrEqualTo(String value) {
            addCriterion("IS_CASS_LOAN <=", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanLike(String value) {
            addCriterion("IS_CASS_LOAN like", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanNotLike(String value) {
            addCriterion("IS_CASS_LOAN not like", value, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanIn(List<String> values) {
            addCriterion("IS_CASS_LOAN in", values, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanNotIn(List<String> values) {
            addCriterion("IS_CASS_LOAN not in", values, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanBetween(String value1, String value2) {
            addCriterion("IS_CASS_LOAN between", value1, value2, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andIsCassLoanNotBetween(String value1, String value2) {
            addCriterion("IS_CASS_LOAN not between", value1, value2, "isCassLoan");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountIsNull() {
            addCriterion("CASS_DISCOUNT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountIsNotNull() {
            addCriterion("CASS_DISCOUNT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("CASS_DISCOUNT_AMOUNT =", value, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("CASS_DISCOUNT_AMOUNT <>", value, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("CASS_DISCOUNT_AMOUNT >", value, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASS_DISCOUNT_AMOUNT >=", value, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountLessThan(BigDecimal value) {
            addCriterion("CASS_DISCOUNT_AMOUNT <", value, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASS_DISCOUNT_AMOUNT <=", value, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("CASS_DISCOUNT_AMOUNT in", values, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("CASS_DISCOUNT_AMOUNT not in", values, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASS_DISCOUNT_AMOUNT between", value1, value2, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andCassDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASS_DISCOUNT_AMOUNT not between", value1, value2, "cassDiscountAmount");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIsNull() {
            addCriterion("PAYMENT_METHOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIsNotNull() {
            addCriterion("PAYMENT_METHOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_ID =", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_ID <>", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdGreaterThan(String value) {
            addCriterion("PAYMENT_METHOD_ID >", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_ID >=", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLessThan(String value) {
            addCriterion("PAYMENT_METHOD_ID <", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_METHOD_ID <=", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLike(String value) {
            addCriterion("PAYMENT_METHOD_ID like", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotLike(String value) {
            addCriterion("PAYMENT_METHOD_ID not like", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_ID in", values, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotIn(List<String> values) {
            addCriterion("PAYMENT_METHOD_ID not in", values, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_ID between", value1, value2, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_METHOD_ID not between", value1, value2, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("TRADE_NO =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("TRADE_NO <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("TRADE_NO >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_NO >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("TRADE_NO <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("TRADE_NO <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("TRADE_NO like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("TRADE_NO not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("TRADE_NO in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("TRADE_NO not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("TRADE_NO between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("TRADE_NO not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andPunishRateIsNull() {
            addCriterion("PUNISH_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPunishRateIsNotNull() {
            addCriterion("PUNISH_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPunishRateEqualTo(String value) {
            addCriterion("PUNISH_RATE =", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateNotEqualTo(String value) {
            addCriterion("PUNISH_RATE <>", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateGreaterThan(String value) {
            addCriterion("PUNISH_RATE >", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISH_RATE >=", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateLessThan(String value) {
            addCriterion("PUNISH_RATE <", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateLessThanOrEqualTo(String value) {
            addCriterion("PUNISH_RATE <=", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateLike(String value) {
            addCriterion("PUNISH_RATE like", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateNotLike(String value) {
            addCriterion("PUNISH_RATE not like", value, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateIn(List<String> values) {
            addCriterion("PUNISH_RATE in", values, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateNotIn(List<String> values) {
            addCriterion("PUNISH_RATE not in", values, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateBetween(String value1, String value2) {
            addCriterion("PUNISH_RATE between", value1, value2, "punishRate");
            return (Criteria) this;
        }

        public Criteria andPunishRateNotBetween(String value1, String value2) {
            addCriterion("PUNISH_RATE not between", value1, value2, "punishRate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNull() {
            addCriterion("INVOICE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIsNotNull() {
            addCriterion("INVOICE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateEqualTo(Date value) {
            addCriterion("INVOICE_DATE =", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotEqualTo(Date value) {
            addCriterion("INVOICE_DATE <>", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThan(Date value) {
            addCriterion("INVOICE_DATE >", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVOICE_DATE >=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThan(Date value) {
            addCriterion("INVOICE_DATE <", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateLessThanOrEqualTo(Date value) {
            addCriterion("INVOICE_DATE <=", value, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateIn(List<Date> values) {
            addCriterion("INVOICE_DATE in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotIn(List<Date> values) {
            addCriterion("INVOICE_DATE not in", values, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateBetween(Date value1, Date value2) {
            addCriterion("INVOICE_DATE between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceDateNotBetween(Date value1, Date value2) {
            addCriterion("INVOICE_DATE not between", value1, value2, "invoiceDate");
            return (Criteria) this;
        }

        public Criteria andPunishAmountIsNull() {
            addCriterion("PUNISH_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPunishAmountIsNotNull() {
            addCriterion("PUNISH_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPunishAmountEqualTo(BigDecimal value) {
            addCriterion("PUNISH_AMOUNT =", value, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountNotEqualTo(BigDecimal value) {
            addCriterion("PUNISH_AMOUNT <>", value, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountGreaterThan(BigDecimal value) {
            addCriterion("PUNISH_AMOUNT >", value, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PUNISH_AMOUNT >=", value, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountLessThan(BigDecimal value) {
            addCriterion("PUNISH_AMOUNT <", value, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PUNISH_AMOUNT <=", value, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountIn(List<BigDecimal> values) {
            addCriterion("PUNISH_AMOUNT in", values, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountNotIn(List<BigDecimal> values) {
            addCriterion("PUNISH_AMOUNT not in", values, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUNISH_AMOUNT between", value1, value2, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andPunishAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUNISH_AMOUNT not between", value1, value2, "punishAmount");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNull() {
            addCriterion("IS_OVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIsNotNull() {
            addCriterion("IS_OVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOverdueEqualTo(String value) {
            addCriterion("IS_OVERDUE =", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotEqualTo(String value) {
            addCriterion("IS_OVERDUE <>", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThan(String value) {
            addCriterion("IS_OVERDUE >", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OVERDUE >=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThan(String value) {
            addCriterion("IS_OVERDUE <", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("IS_OVERDUE <=", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueLike(String value) {
            addCriterion("IS_OVERDUE like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotLike(String value) {
            addCriterion("IS_OVERDUE not like", value, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueIn(List<String> values) {
            addCriterion("IS_OVERDUE in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotIn(List<String> values) {
            addCriterion("IS_OVERDUE not in", values, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueBetween(String value1, String value2) {
            addCriterion("IS_OVERDUE between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andIsOverdueNotBetween(String value1, String value2) {
            addCriterion("IS_OVERDUE not between", value1, value2, "isOverdue");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayIsNull() {
            addCriterion("REPAIRE_OVERDUE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayIsNotNull() {
            addCriterion("REPAIRE_OVERDUE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayEqualTo(Integer value) {
            addCriterion("REPAIRE_OVERDUE_DAY =", value, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayNotEqualTo(Integer value) {
            addCriterion("REPAIRE_OVERDUE_DAY <>", value, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayGreaterThan(Integer value) {
            addCriterion("REPAIRE_OVERDUE_DAY >", value, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAIRE_OVERDUE_DAY >=", value, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayLessThan(Integer value) {
            addCriterion("REPAIRE_OVERDUE_DAY <", value, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("REPAIRE_OVERDUE_DAY <=", value, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayIn(List<Integer> values) {
            addCriterion("REPAIRE_OVERDUE_DAY in", values, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayNotIn(List<Integer> values) {
            addCriterion("REPAIRE_OVERDUE_DAY not in", values, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("REPAIRE_OVERDUE_DAY between", value1, value2, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andRepaireOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAIRE_OVERDUE_DAY not between", value1, value2, "repaireOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayIsNull() {
            addCriterion("SUPPLIER_OVERDUE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayIsNotNull() {
            addCriterion("SUPPLIER_OVERDUE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayEqualTo(Integer value) {
            addCriterion("SUPPLIER_OVERDUE_DAY =", value, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayNotEqualTo(Integer value) {
            addCriterion("SUPPLIER_OVERDUE_DAY <>", value, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayGreaterThan(Integer value) {
            addCriterion("SUPPLIER_OVERDUE_DAY >", value, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPPLIER_OVERDUE_DAY >=", value, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayLessThan(Integer value) {
            addCriterion("SUPPLIER_OVERDUE_DAY <", value, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("SUPPLIER_OVERDUE_DAY <=", value, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayIn(List<Integer> values) {
            addCriterion("SUPPLIER_OVERDUE_DAY in", values, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayNotIn(List<Integer> values) {
            addCriterion("SUPPLIER_OVERDUE_DAY not in", values, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("SUPPLIER_OVERDUE_DAY between", value1, value2, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andSupplierOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPPLIER_OVERDUE_DAY not between", value1, value2, "supplierOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayIsNull() {
            addCriterion("PLATFORM_OVERDUE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayIsNotNull() {
            addCriterion("PLATFORM_OVERDUE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayEqualTo(Integer value) {
            addCriterion("PLATFORM_OVERDUE_DAY =", value, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayNotEqualTo(Integer value) {
            addCriterion("PLATFORM_OVERDUE_DAY <>", value, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayGreaterThan(Integer value) {
            addCriterion("PLATFORM_OVERDUE_DAY >", value, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLATFORM_OVERDUE_DAY >=", value, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayLessThan(Integer value) {
            addCriterion("PLATFORM_OVERDUE_DAY <", value, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("PLATFORM_OVERDUE_DAY <=", value, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayIn(List<Integer> values) {
            addCriterion("PLATFORM_OVERDUE_DAY in", values, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayNotIn(List<Integer> values) {
            addCriterion("PLATFORM_OVERDUE_DAY not in", values, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("PLATFORM_OVERDUE_DAY between", value1, value2, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andPlatformOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("PLATFORM_OVERDUE_DAY not between", value1, value2, "platformOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateIsNull() {
            addCriterion("MAX_DEADLINE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateIsNotNull() {
            addCriterion("MAX_DEADLINE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateEqualTo(Date value) {
            addCriterion("MAX_DEADLINE_DATE =", value, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateNotEqualTo(Date value) {
            addCriterion("MAX_DEADLINE_DATE <>", value, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateGreaterThan(Date value) {
            addCriterion("MAX_DEADLINE_DATE >", value, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MAX_DEADLINE_DATE >=", value, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateLessThan(Date value) {
            addCriterion("MAX_DEADLINE_DATE <", value, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateLessThanOrEqualTo(Date value) {
            addCriterion("MAX_DEADLINE_DATE <=", value, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateIn(List<Date> values) {
            addCriterion("MAX_DEADLINE_DATE in", values, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateNotIn(List<Date> values) {
            addCriterion("MAX_DEADLINE_DATE not in", values, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateBetween(Date value1, Date value2) {
            addCriterion("MAX_DEADLINE_DATE between", value1, value2, "maxDeadlineDate");
            return (Criteria) this;
        }

        public Criteria andMaxDeadlineDateNotBetween(Date value1, Date value2) {
            addCriterion("MAX_DEADLINE_DATE not between", value1, value2, "maxDeadlineDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}