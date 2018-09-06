package com.thumbor.example.aouth.server.db.entity;

import java.util.ArrayList;
import java.util.List;

public class ClientRedirectExample {
    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public ClientRedirectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClient_idIsNull() {
            addCriterion("client_id is null");
            return (Criteria) this;
        }

        public Criteria andClient_idIsNotNull() {
            addCriterion("client_id is not null");
            return (Criteria) this;
        }

        public Criteria andClient_idEqualTo(String value) {
            addCriterion("client_id =", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotEqualTo(String value) {
            addCriterion("client_id <>", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idGreaterThan(String value) {
            addCriterion("client_id >", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idGreaterThanOrEqualTo(String value) {
            addCriterion("client_id >=", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idLessThan(String value) {
            addCriterion("client_id <", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idLessThanOrEqualTo(String value) {
            addCriterion("client_id <=", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idLike(String value) {
            addCriterion("client_id like", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotLike(String value) {
            addCriterion("client_id not like", value, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idIn(List<String> values) {
            addCriterion("client_id in", values, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotIn(List<String> values) {
            addCriterion("client_id not in", values, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idBetween(String value1, String value2) {
            addCriterion("client_id between", value1, value2, "client_id");
            return (Criteria) this;
        }

        public Criteria andClient_idNotBetween(String value1, String value2) {
            addCriterion("client_id not between", value1, value2, "client_id");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriIsNull() {
            addCriterion("redirect_uri is null");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriIsNotNull() {
            addCriterion("redirect_uri is not null");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriEqualTo(String value) {
            addCriterion("redirect_uri =", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriNotEqualTo(String value) {
            addCriterion("redirect_uri <>", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriGreaterThan(String value) {
            addCriterion("redirect_uri >", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriGreaterThanOrEqualTo(String value) {
            addCriterion("redirect_uri >=", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriLessThan(String value) {
            addCriterion("redirect_uri <", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriLessThanOrEqualTo(String value) {
            addCriterion("redirect_uri <=", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriLike(String value) {
            addCriterion("redirect_uri like", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriNotLike(String value) {
            addCriterion("redirect_uri not like", value, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriIn(List<String> values) {
            addCriterion("redirect_uri in", values, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriNotIn(List<String> values) {
            addCriterion("redirect_uri not in", values, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriBetween(String value1, String value2) {
            addCriterion("redirect_uri between", value1, value2, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriNotBetween(String value1, String value2) {
            addCriterion("redirect_uri not between", value1, value2, "redirect_uri");
            return (Criteria) this;
        }

        public Criteria andClient_idLikeInsensitive(String value) {
            addCriterion("upper(client_id) like", value.toUpperCase(), "client_id");
            return (Criteria) this;
        }

        public Criteria andRedirect_uriLikeInsensitive(String value) {
            addCriterion("upper(redirect_uri) like", value.toUpperCase(), "redirect_uri");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 06 11:43:53 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
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