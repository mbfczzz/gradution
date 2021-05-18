package jz.cdgy.mbg.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyExample() {
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

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(Integer value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(Integer value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(Integer value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(Integer value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<Integer> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<Integer> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyIsNull() {
            addCriterion("emp_money is null");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyIsNotNull() {
            addCriterion("emp_money is not null");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyEqualTo(BigDecimal value) {
            addCriterion("emp_money =", value, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyNotEqualTo(BigDecimal value) {
            addCriterion("emp_money <>", value, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyGreaterThan(BigDecimal value) {
            addCriterion("emp_money >", value, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_money >=", value, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyLessThan(BigDecimal value) {
            addCriterion("emp_money <", value, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_money <=", value, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyIn(List<BigDecimal> values) {
            addCriterion("emp_money in", values, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyNotIn(List<BigDecimal> values) {
            addCriterion("emp_money not in", values, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_money between", value1, value2, "empMoney");
            return (Criteria) this;
        }

        public Criteria andEmpMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_money not between", value1, value2, "empMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeIsNull() {
            addCriterion("money_describe is null");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeIsNotNull() {
            addCriterion("money_describe is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeEqualTo(String value) {
            addCriterion("money_describe =", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeNotEqualTo(String value) {
            addCriterion("money_describe <>", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeGreaterThan(String value) {
            addCriterion("money_describe >", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("money_describe >=", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeLessThan(String value) {
            addCriterion("money_describe <", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeLessThanOrEqualTo(String value) {
            addCriterion("money_describe <=", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeLike(String value) {
            addCriterion("money_describe like", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeNotLike(String value) {
            addCriterion("money_describe not like", value, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeIn(List<String> values) {
            addCriterion("money_describe in", values, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeNotIn(List<String> values) {
            addCriterion("money_describe not in", values, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeBetween(String value1, String value2) {
            addCriterion("money_describe between", value1, value2, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andMoneyDescribeNotBetween(String value1, String value2) {
            addCriterion("money_describe not between", value1, value2, "moneyDescribe");
            return (Criteria) this;
        }

        public Criteria andRefundWayIsNull() {
            addCriterion("refund_way is null");
            return (Criteria) this;
        }

        public Criteria andRefundWayIsNotNull() {
            addCriterion("refund_way is not null");
            return (Criteria) this;
        }

        public Criteria andRefundWayEqualTo(Integer value) {
            addCriterion("refund_way =", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotEqualTo(Integer value) {
            addCriterion("refund_way <>", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayGreaterThan(Integer value) {
            addCriterion("refund_way >", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_way >=", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayLessThan(Integer value) {
            addCriterion("refund_way <", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayLessThanOrEqualTo(Integer value) {
            addCriterion("refund_way <=", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayIn(List<Integer> values) {
            addCriterion("refund_way in", values, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotIn(List<Integer> values) {
            addCriterion("refund_way not in", values, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayBetween(Integer value1, Integer value2) {
            addCriterion("refund_way between", value1, value2, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_way not between", value1, value2, "refundWay");
            return (Criteria) this;
        }

        public Criteria andMoneyItemIsNull() {
            addCriterion("money_item is null");
            return (Criteria) this;
        }

        public Criteria andMoneyItemIsNotNull() {
            addCriterion("money_item is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyItemEqualTo(Integer value) {
            addCriterion("money_item =", value, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemNotEqualTo(Integer value) {
            addCriterion("money_item <>", value, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemGreaterThan(Integer value) {
            addCriterion("money_item >", value, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_item >=", value, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemLessThan(Integer value) {
            addCriterion("money_item <", value, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemLessThanOrEqualTo(Integer value) {
            addCriterion("money_item <=", value, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemIn(List<Integer> values) {
            addCriterion("money_item in", values, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemNotIn(List<Integer> values) {
            addCriterion("money_item not in", values, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemBetween(Integer value1, Integer value2) {
            addCriterion("money_item between", value1, value2, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andMoneyItemNotBetween(Integer value1, Integer value2) {
            addCriterion("money_item not between", value1, value2, "moneyItem");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
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