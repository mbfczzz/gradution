package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpendExample() {
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

        public Criteria andSpendPeopleIsNull() {
            addCriterion("spend_people is null");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleIsNotNull() {
            addCriterion("spend_people is not null");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleEqualTo(String value) {
            addCriterion("spend_people =", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotEqualTo(String value) {
            addCriterion("spend_people <>", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleGreaterThan(String value) {
            addCriterion("spend_people >", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("spend_people >=", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleLessThan(String value) {
            addCriterion("spend_people <", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleLessThanOrEqualTo(String value) {
            addCriterion("spend_people <=", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleLike(String value) {
            addCriterion("spend_people like", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotLike(String value) {
            addCriterion("spend_people not like", value, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleIn(List<String> values) {
            addCriterion("spend_people in", values, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotIn(List<String> values) {
            addCriterion("spend_people not in", values, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleBetween(String value1, String value2) {
            addCriterion("spend_people between", value1, value2, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendPeopleNotBetween(String value1, String value2) {
            addCriterion("spend_people not between", value1, value2, "spendPeople");
            return (Criteria) this;
        }

        public Criteria andSpendItemIsNull() {
            addCriterion("spend_item is null");
            return (Criteria) this;
        }

        public Criteria andSpendItemIsNotNull() {
            addCriterion("spend_item is not null");
            return (Criteria) this;
        }

        public Criteria andSpendItemEqualTo(String value) {
            addCriterion("spend_item =", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemNotEqualTo(String value) {
            addCriterion("spend_item <>", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemGreaterThan(String value) {
            addCriterion("spend_item >", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemGreaterThanOrEqualTo(String value) {
            addCriterion("spend_item >=", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemLessThan(String value) {
            addCriterion("spend_item <", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemLessThanOrEqualTo(String value) {
            addCriterion("spend_item <=", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemLike(String value) {
            addCriterion("spend_item like", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemNotLike(String value) {
            addCriterion("spend_item not like", value, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemIn(List<String> values) {
            addCriterion("spend_item in", values, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemNotIn(List<String> values) {
            addCriterion("spend_item not in", values, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemBetween(String value1, String value2) {
            addCriterion("spend_item between", value1, value2, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendItemNotBetween(String value1, String value2) {
            addCriterion("spend_item not between", value1, value2, "spendItem");
            return (Criteria) this;
        }

        public Criteria andSpendWayIsNull() {
            addCriterion("spend_way is null");
            return (Criteria) this;
        }

        public Criteria andSpendWayIsNotNull() {
            addCriterion("spend_way is not null");
            return (Criteria) this;
        }

        public Criteria andSpendWayEqualTo(Integer value) {
            addCriterion("spend_way =", value, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayNotEqualTo(Integer value) {
            addCriterion("spend_way <>", value, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayGreaterThan(Integer value) {
            addCriterion("spend_way >", value, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("spend_way >=", value, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayLessThan(Integer value) {
            addCriterion("spend_way <", value, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayLessThanOrEqualTo(Integer value) {
            addCriterion("spend_way <=", value, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayIn(List<Integer> values) {
            addCriterion("spend_way in", values, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayNotIn(List<Integer> values) {
            addCriterion("spend_way not in", values, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayBetween(Integer value1, Integer value2) {
            addCriterion("spend_way between", value1, value2, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendWayNotBetween(Integer value1, Integer value2) {
            addCriterion("spend_way not between", value1, value2, "spendWay");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIsNull() {
            addCriterion("spend_time is null");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIsNotNull() {
            addCriterion("spend_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpendTimeEqualTo(Date value) {
            addCriterion("spend_time =", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotEqualTo(Date value) {
            addCriterion("spend_time <>", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeGreaterThan(Date value) {
            addCriterion("spend_time >", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spend_time >=", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeLessThan(Date value) {
            addCriterion("spend_time <", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeLessThanOrEqualTo(Date value) {
            addCriterion("spend_time <=", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIn(List<Date> values) {
            addCriterion("spend_time in", values, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotIn(List<Date> values) {
            addCriterion("spend_time not in", values, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeBetween(Date value1, Date value2) {
            addCriterion("spend_time between", value1, value2, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotBetween(Date value1, Date value2) {
            addCriterion("spend_time not between", value1, value2, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendMarkIsNull() {
            addCriterion("spend_mark is null");
            return (Criteria) this;
        }

        public Criteria andSpendMarkIsNotNull() {
            addCriterion("spend_mark is not null");
            return (Criteria) this;
        }

        public Criteria andSpendMarkEqualTo(String value) {
            addCriterion("spend_mark =", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkNotEqualTo(String value) {
            addCriterion("spend_mark <>", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkGreaterThan(String value) {
            addCriterion("spend_mark >", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkGreaterThanOrEqualTo(String value) {
            addCriterion("spend_mark >=", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkLessThan(String value) {
            addCriterion("spend_mark <", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkLessThanOrEqualTo(String value) {
            addCriterion("spend_mark <=", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkLike(String value) {
            addCriterion("spend_mark like", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkNotLike(String value) {
            addCriterion("spend_mark not like", value, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkIn(List<String> values) {
            addCriterion("spend_mark in", values, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkNotIn(List<String> values) {
            addCriterion("spend_mark not in", values, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkBetween(String value1, String value2) {
            addCriterion("spend_mark between", value1, value2, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendMarkNotBetween(String value1, String value2) {
            addCriterion("spend_mark not between", value1, value2, "spendMark");
            return (Criteria) this;
        }

        public Criteria andSpendStatusIsNull() {
            addCriterion("spend_status is null");
            return (Criteria) this;
        }

        public Criteria andSpendStatusIsNotNull() {
            addCriterion("spend_status is not null");
            return (Criteria) this;
        }

        public Criteria andSpendStatusEqualTo(Integer value) {
            addCriterion("spend_status =", value, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusNotEqualTo(Integer value) {
            addCriterion("spend_status <>", value, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusGreaterThan(Integer value) {
            addCriterion("spend_status >", value, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("spend_status >=", value, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusLessThan(Integer value) {
            addCriterion("spend_status <", value, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusLessThanOrEqualTo(Integer value) {
            addCriterion("spend_status <=", value, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusIn(List<Integer> values) {
            addCriterion("spend_status in", values, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusNotIn(List<Integer> values) {
            addCriterion("spend_status not in", values, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusBetween(Integer value1, Integer value2) {
            addCriterion("spend_status between", value1, value2, "spendStatus");
            return (Criteria) this;
        }

        public Criteria andSpendStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("spend_status not between", value1, value2, "spendStatus");
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