package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.List;

public class RefundWayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundWayExample() {
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

        public Criteria andRefundNameIsNull() {
            addCriterion("refund_name is null");
            return (Criteria) this;
        }

        public Criteria andRefundNameIsNotNull() {
            addCriterion("refund_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNameEqualTo(String value) {
            addCriterion("refund_name =", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameNotEqualTo(String value) {
            addCriterion("refund_name <>", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameGreaterThan(String value) {
            addCriterion("refund_name >", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameGreaterThanOrEqualTo(String value) {
            addCriterion("refund_name >=", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameLessThan(String value) {
            addCriterion("refund_name <", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameLessThanOrEqualTo(String value) {
            addCriterion("refund_name <=", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameLike(String value) {
            addCriterion("refund_name like", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameNotLike(String value) {
            addCriterion("refund_name not like", value, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameIn(List<String> values) {
            addCriterion("refund_name in", values, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameNotIn(List<String> values) {
            addCriterion("refund_name not in", values, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameBetween(String value1, String value2) {
            addCriterion("refund_name between", value1, value2, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundNameNotBetween(String value1, String value2) {
            addCriterion("refund_name not between", value1, value2, "refundName");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeIsNull() {
            addCriterion("refund_describe is null");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeIsNotNull() {
            addCriterion("refund_describe is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeEqualTo(String value) {
            addCriterion("refund_describe =", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeNotEqualTo(String value) {
            addCriterion("refund_describe <>", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeGreaterThan(String value) {
            addCriterion("refund_describe >", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("refund_describe >=", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeLessThan(String value) {
            addCriterion("refund_describe <", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeLessThanOrEqualTo(String value) {
            addCriterion("refund_describe <=", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeLike(String value) {
            addCriterion("refund_describe like", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeNotLike(String value) {
            addCriterion("refund_describe not like", value, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeIn(List<String> values) {
            addCriterion("refund_describe in", values, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeNotIn(List<String> values) {
            addCriterion("refund_describe not in", values, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeBetween(String value1, String value2) {
            addCriterion("refund_describe between", value1, value2, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundDescribeNotBetween(String value1, String value2) {
            addCriterion("refund_describe not between", value1, value2, "refundDescribe");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Byte value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Byte value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Byte value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Byte value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Byte value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Byte> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Byte> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Byte value1, Byte value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Byte value1, Byte value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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