package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        public Criteria andAttendanceTimeIsNull() {
            addCriterion("attendance_time is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIsNotNull() {
            addCriterion("attendance_time is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeEqualTo(Date value) {
            addCriterion("attendance_time =", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotEqualTo(Date value) {
            addCriterion("attendance_time <>", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThan(Date value) {
            addCriterion("attendance_time >", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attendance_time >=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThan(Date value) {
            addCriterion("attendance_time <", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("attendance_time <=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIn(List<Date> values) {
            addCriterion("attendance_time in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotIn(List<Date> values) {
            addCriterion("attendance_time not in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeBetween(Date value1, Date value2) {
            addCriterion("attendance_time between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("attendance_time not between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNull() {
            addCriterion("is_card is null");
            return (Criteria) this;
        }

        public Criteria andIsCardIsNotNull() {
            addCriterion("is_card is not null");
            return (Criteria) this;
        }

        public Criteria andIsCardEqualTo(Byte value) {
            addCriterion("is_card =", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotEqualTo(Byte value) {
            addCriterion("is_card <>", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThan(Byte value) {
            addCriterion("is_card >", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_card >=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThan(Byte value) {
            addCriterion("is_card <", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardLessThanOrEqualTo(Byte value) {
            addCriterion("is_card <=", value, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardIn(List<Byte> values) {
            addCriterion("is_card in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotIn(List<Byte> values) {
            addCriterion("is_card not in", values, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardBetween(Byte value1, Byte value2) {
            addCriterion("is_card between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsCardNotBetween(Byte value1, Byte value2) {
            addCriterion("is_card not between", value1, value2, "isCard");
            return (Criteria) this;
        }

        public Criteria andIsAgencyIsNull() {
            addCriterion("is_agency is null");
            return (Criteria) this;
        }

        public Criteria andIsAgencyIsNotNull() {
            addCriterion("is_agency is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgencyEqualTo(Byte value) {
            addCriterion("is_agency =", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotEqualTo(Byte value) {
            addCriterion("is_agency <>", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyGreaterThan(Byte value) {
            addCriterion("is_agency >", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_agency >=", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyLessThan(Byte value) {
            addCriterion("is_agency <", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyLessThanOrEqualTo(Byte value) {
            addCriterion("is_agency <=", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyIn(List<Byte> values) {
            addCriterion("is_agency in", values, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotIn(List<Byte> values) {
            addCriterion("is_agency not in", values, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyBetween(Byte value1, Byte value2) {
            addCriterion("is_agency between", value1, value2, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_agency not between", value1, value2, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsReplacementIsNull() {
            addCriterion("is_replacement is null");
            return (Criteria) this;
        }

        public Criteria andIsReplacementIsNotNull() {
            addCriterion("is_replacement is not null");
            return (Criteria) this;
        }

        public Criteria andIsReplacementEqualTo(Byte value) {
            addCriterion("is_replacement =", value, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementNotEqualTo(Byte value) {
            addCriterion("is_replacement <>", value, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementGreaterThan(Byte value) {
            addCriterion("is_replacement >", value, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_replacement >=", value, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementLessThan(Byte value) {
            addCriterion("is_replacement <", value, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementLessThanOrEqualTo(Byte value) {
            addCriterion("is_replacement <=", value, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementIn(List<Byte> values) {
            addCriterion("is_replacement in", values, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementNotIn(List<Byte> values) {
            addCriterion("is_replacement not in", values, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementBetween(Byte value1, Byte value2) {
            addCriterion("is_replacement between", value1, value2, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andIsReplacementNotBetween(Byte value1, Byte value2) {
            addCriterion("is_replacement not between", value1, value2, "isReplacement");
            return (Criteria) this;
        }

        public Criteria andOneCardIsNull() {
            addCriterion("one_card is null");
            return (Criteria) this;
        }

        public Criteria andOneCardIsNotNull() {
            addCriterion("one_card is not null");
            return (Criteria) this;
        }

        public Criteria andOneCardEqualTo(Date value) {
            addCriterion("one_card =", value, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardNotEqualTo(Date value) {
            addCriterion("one_card <>", value, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardGreaterThan(Date value) {
            addCriterion("one_card >", value, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardGreaterThanOrEqualTo(Date value) {
            addCriterion("one_card >=", value, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardLessThan(Date value) {
            addCriterion("one_card <", value, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardLessThanOrEqualTo(Date value) {
            addCriterion("one_card <=", value, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardIn(List<Date> values) {
            addCriterion("one_card in", values, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardNotIn(List<Date> values) {
            addCriterion("one_card not in", values, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardBetween(Date value1, Date value2) {
            addCriterion("one_card between", value1, value2, "oneCard");
            return (Criteria) this;
        }

        public Criteria andOneCardNotBetween(Date value1, Date value2) {
            addCriterion("one_card not between", value1, value2, "oneCard");
            return (Criteria) this;
        }

        public Criteria andTowCardIsNull() {
            addCriterion("tow_card is null");
            return (Criteria) this;
        }

        public Criteria andTowCardIsNotNull() {
            addCriterion("tow_card is not null");
            return (Criteria) this;
        }

        public Criteria andTowCardEqualTo(Date value) {
            addCriterion("tow_card =", value, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardNotEqualTo(Date value) {
            addCriterion("tow_card <>", value, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardGreaterThan(Date value) {
            addCriterion("tow_card >", value, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardGreaterThanOrEqualTo(Date value) {
            addCriterion("tow_card >=", value, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardLessThan(Date value) {
            addCriterion("tow_card <", value, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardLessThanOrEqualTo(Date value) {
            addCriterion("tow_card <=", value, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardIn(List<Date> values) {
            addCriterion("tow_card in", values, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardNotIn(List<Date> values) {
            addCriterion("tow_card not in", values, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardBetween(Date value1, Date value2) {
            addCriterion("tow_card between", value1, value2, "towCard");
            return (Criteria) this;
        }

        public Criteria andTowCardNotBetween(Date value1, Date value2) {
            addCriterion("tow_card not between", value1, value2, "towCard");
            return (Criteria) this;
        }

        public Criteria andCardPeopleIsNull() {
            addCriterion("card_people is null");
            return (Criteria) this;
        }

        public Criteria andCardPeopleIsNotNull() {
            addCriterion("card_people is not null");
            return (Criteria) this;
        }

        public Criteria andCardPeopleEqualTo(Integer value) {
            addCriterion("card_people =", value, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleNotEqualTo(Integer value) {
            addCriterion("card_people <>", value, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleGreaterThan(Integer value) {
            addCriterion("card_people >", value, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_people >=", value, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleLessThan(Integer value) {
            addCriterion("card_people <", value, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("card_people <=", value, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleIn(List<Integer> values) {
            addCriterion("card_people in", values, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleNotIn(List<Integer> values) {
            addCriterion("card_people not in", values, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleBetween(Integer value1, Integer value2) {
            addCriterion("card_people between", value1, value2, "cardPeople");
            return (Criteria) this;
        }

        public Criteria andCardPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("card_people not between", value1, value2, "cardPeople");
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