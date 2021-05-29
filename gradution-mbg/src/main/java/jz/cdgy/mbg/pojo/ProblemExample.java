package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andProblemModelIsNull() {
            addCriterion("problem_model is null");
            return (Criteria) this;
        }

        public Criteria andProblemModelIsNotNull() {
            addCriterion("problem_model is not null");
            return (Criteria) this;
        }

        public Criteria andProblemModelEqualTo(String value) {
            addCriterion("problem_model =", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelNotEqualTo(String value) {
            addCriterion("problem_model <>", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelGreaterThan(String value) {
            addCriterion("problem_model >", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelGreaterThanOrEqualTo(String value) {
            addCriterion("problem_model >=", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelLessThan(String value) {
            addCriterion("problem_model <", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelLessThanOrEqualTo(String value) {
            addCriterion("problem_model <=", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelLike(String value) {
            addCriterion("problem_model like", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelNotLike(String value) {
            addCriterion("problem_model not like", value, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelIn(List<String> values) {
            addCriterion("problem_model in", values, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelNotIn(List<String> values) {
            addCriterion("problem_model not in", values, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelBetween(String value1, String value2) {
            addCriterion("problem_model between", value1, value2, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemModelNotBetween(String value1, String value2) {
            addCriterion("problem_model not between", value1, value2, "problemModel");
            return (Criteria) this;
        }

        public Criteria andProblemContentIsNull() {
            addCriterion("problem_content is null");
            return (Criteria) this;
        }

        public Criteria andProblemContentIsNotNull() {
            addCriterion("problem_content is not null");
            return (Criteria) this;
        }

        public Criteria andProblemContentEqualTo(String value) {
            addCriterion("problem_content =", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotEqualTo(String value) {
            addCriterion("problem_content <>", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentGreaterThan(String value) {
            addCriterion("problem_content >", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentGreaterThanOrEqualTo(String value) {
            addCriterion("problem_content >=", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentLessThan(String value) {
            addCriterion("problem_content <", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentLessThanOrEqualTo(String value) {
            addCriterion("problem_content <=", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentLike(String value) {
            addCriterion("problem_content like", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotLike(String value) {
            addCriterion("problem_content not like", value, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentIn(List<String> values) {
            addCriterion("problem_content in", values, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotIn(List<String> values) {
            addCriterion("problem_content not in", values, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentBetween(String value1, String value2) {
            addCriterion("problem_content between", value1, value2, "problemContent");
            return (Criteria) this;
        }

        public Criteria andProblemContentNotBetween(String value1, String value2) {
            addCriterion("problem_content not between", value1, value2, "problemContent");
            return (Criteria) this;
        }

        public Criteria andIsOkIsNull() {
            addCriterion("is_ok is null");
            return (Criteria) this;
        }

        public Criteria andIsOkIsNotNull() {
            addCriterion("is_ok is not null");
            return (Criteria) this;
        }

        public Criteria andIsOkEqualTo(Byte value) {
            addCriterion("is_ok =", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotEqualTo(Byte value) {
            addCriterion("is_ok <>", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkGreaterThan(Byte value) {
            addCriterion("is_ok >", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_ok >=", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkLessThan(Byte value) {
            addCriterion("is_ok <", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkLessThanOrEqualTo(Byte value) {
            addCriterion("is_ok <=", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkIn(List<Byte> values) {
            addCriterion("is_ok in", values, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotIn(List<Byte> values) {
            addCriterion("is_ok not in", values, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkBetween(Byte value1, Byte value2) {
            addCriterion("is_ok between", value1, value2, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotBetween(Byte value1, Byte value2) {
            addCriterion("is_ok not between", value1, value2, "isOk");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAddPeopleIsNull() {
            addCriterion("add_people is null");
            return (Criteria) this;
        }

        public Criteria andAddPeopleIsNotNull() {
            addCriterion("add_people is not null");
            return (Criteria) this;
        }

        public Criteria andAddPeopleEqualTo(String value) {
            addCriterion("add_people =", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleNotEqualTo(String value) {
            addCriterion("add_people <>", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleGreaterThan(String value) {
            addCriterion("add_people >", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("add_people >=", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleLessThan(String value) {
            addCriterion("add_people <", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleLessThanOrEqualTo(String value) {
            addCriterion("add_people <=", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleLike(String value) {
            addCriterion("add_people like", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleNotLike(String value) {
            addCriterion("add_people not like", value, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleIn(List<String> values) {
            addCriterion("add_people in", values, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleNotIn(List<String> values) {
            addCriterion("add_people not in", values, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleBetween(String value1, String value2) {
            addCriterion("add_people between", value1, value2, "addPeople");
            return (Criteria) this;
        }

        public Criteria andAddPeopleNotBetween(String value1, String value2) {
            addCriterion("add_people not between", value1, value2, "addPeople");
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