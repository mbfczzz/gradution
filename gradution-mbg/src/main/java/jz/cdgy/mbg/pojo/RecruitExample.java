package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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

        public Criteria andReleasePeopleIsNull() {
            addCriterion("release_people is null");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleIsNotNull() {
            addCriterion("release_people is not null");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleEqualTo(Integer value) {
            addCriterion("release_people =", value, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleNotEqualTo(Integer value) {
            addCriterion("release_people <>", value, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleGreaterThan(Integer value) {
            addCriterion("release_people >", value, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("release_people >=", value, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleLessThan(Integer value) {
            addCriterion("release_people <", value, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleLessThanOrEqualTo(Integer value) {
            addCriterion("release_people <=", value, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleIn(List<Integer> values) {
            addCriterion("release_people in", values, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleNotIn(List<Integer> values) {
            addCriterion("release_people not in", values, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleBetween(Integer value1, Integer value2) {
            addCriterion("release_people between", value1, value2, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andReleasePeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("release_people not between", value1, value2, "releasePeople");
            return (Criteria) this;
        }

        public Criteria andRecruitContentIsNull() {
            addCriterion("recruit_content is null");
            return (Criteria) this;
        }

        public Criteria andRecruitContentIsNotNull() {
            addCriterion("recruit_content is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitContentEqualTo(String value) {
            addCriterion("recruit_content =", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentNotEqualTo(String value) {
            addCriterion("recruit_content <>", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentGreaterThan(String value) {
            addCriterion("recruit_content >", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_content >=", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentLessThan(String value) {
            addCriterion("recruit_content <", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentLessThanOrEqualTo(String value) {
            addCriterion("recruit_content <=", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentLike(String value) {
            addCriterion("recruit_content like", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentNotLike(String value) {
            addCriterion("recruit_content not like", value, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentIn(List<String> values) {
            addCriterion("recruit_content in", values, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentNotIn(List<String> values) {
            addCriterion("recruit_content not in", values, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentBetween(String value1, String value2) {
            addCriterion("recruit_content between", value1, value2, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitContentNotBetween(String value1, String value2) {
            addCriterion("recruit_content not between", value1, value2, "recruitContent");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionIsNull() {
            addCriterion("recruit_position is null");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionIsNotNull() {
            addCriterion("recruit_position is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionEqualTo(Integer value) {
            addCriterion("recruit_position =", value, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionNotEqualTo(Integer value) {
            addCriterion("recruit_position <>", value, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionGreaterThan(Integer value) {
            addCriterion("recruit_position >", value, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruit_position >=", value, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionLessThan(Integer value) {
            addCriterion("recruit_position <", value, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionLessThanOrEqualTo(Integer value) {
            addCriterion("recruit_position <=", value, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionIn(List<Integer> values) {
            addCriterion("recruit_position in", values, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionNotIn(List<Integer> values) {
            addCriterion("recruit_position not in", values, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionBetween(Integer value1, Integer value2) {
            addCriterion("recruit_position between", value1, value2, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("recruit_position not between", value1, value2, "recruitPosition");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeIsNull() {
            addCriterion("recruit_time is null");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeIsNotNull() {
            addCriterion("recruit_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeEqualTo(Date value) {
            addCriterion("recruit_time =", value, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeNotEqualTo(Date value) {
            addCriterion("recruit_time <>", value, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeGreaterThan(Date value) {
            addCriterion("recruit_time >", value, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recruit_time >=", value, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeLessThan(Date value) {
            addCriterion("recruit_time <", value, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeLessThanOrEqualTo(Date value) {
            addCriterion("recruit_time <=", value, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeIn(List<Date> values) {
            addCriterion("recruit_time in", values, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeNotIn(List<Date> values) {
            addCriterion("recruit_time not in", values, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeBetween(Date value1, Date value2) {
            addCriterion("recruit_time between", value1, value2, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitTimeNotBetween(Date value1, Date value2) {
            addCriterion("recruit_time not between", value1, value2, "recruitTime");
            return (Criteria) this;
        }

        public Criteria andRecruitNameIsNull() {
            addCriterion("recruit_name is null");
            return (Criteria) this;
        }

        public Criteria andRecruitNameIsNotNull() {
            addCriterion("recruit_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitNameEqualTo(String value) {
            addCriterion("recruit_name =", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotEqualTo(String value) {
            addCriterion("recruit_name <>", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameGreaterThan(String value) {
            addCriterion("recruit_name >", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_name >=", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameLessThan(String value) {
            addCriterion("recruit_name <", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameLessThanOrEqualTo(String value) {
            addCriterion("recruit_name <=", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameLike(String value) {
            addCriterion("recruit_name like", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotLike(String value) {
            addCriterion("recruit_name not like", value, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameIn(List<String> values) {
            addCriterion("recruit_name in", values, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotIn(List<String> values) {
            addCriterion("recruit_name not in", values, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameBetween(String value1, String value2) {
            addCriterion("recruit_name between", value1, value2, "recruitName");
            return (Criteria) this;
        }

        public Criteria andRecruitNameNotBetween(String value1, String value2) {
            addCriterion("recruit_name not between", value1, value2, "recruitName");
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