package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIsNull() {
            addCriterion("send_people is null");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIsNotNull() {
            addCriterion("send_people is not null");
            return (Criteria) this;
        }

        public Criteria andSendPeopleEqualTo(String value) {
            addCriterion("send_people =", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotEqualTo(String value) {
            addCriterion("send_people <>", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleGreaterThan(String value) {
            addCriterion("send_people >", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("send_people >=", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleLessThan(String value) {
            addCriterion("send_people <", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleLessThanOrEqualTo(String value) {
            addCriterion("send_people <=", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleLike(String value) {
            addCriterion("send_people like", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotLike(String value) {
            addCriterion("send_people not like", value, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleIn(List<String> values) {
            addCriterion("send_people in", values, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotIn(List<String> values) {
            addCriterion("send_people not in", values, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleBetween(String value1, String value2) {
            addCriterion("send_people between", value1, value2, "sendPeople");
            return (Criteria) this;
        }

        public Criteria andSendPeopleNotBetween(String value1, String value2) {
            addCriterion("send_people not between", value1, value2, "sendPeople");
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

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andSendWayIsNull() {
            addCriterion("send_way is null");
            return (Criteria) this;
        }

        public Criteria andSendWayIsNotNull() {
            addCriterion("send_way is not null");
            return (Criteria) this;
        }

        public Criteria andSendWayEqualTo(Integer value) {
            addCriterion("send_way =", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotEqualTo(Integer value) {
            addCriterion("send_way <>", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayGreaterThan(Integer value) {
            addCriterion("send_way >", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_way >=", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLessThan(Integer value) {
            addCriterion("send_way <", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayLessThanOrEqualTo(Integer value) {
            addCriterion("send_way <=", value, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayIn(List<Integer> values) {
            addCriterion("send_way in", values, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotIn(List<Integer> values) {
            addCriterion("send_way not in", values, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayBetween(Integer value1, Integer value2) {
            addCriterion("send_way between", value1, value2, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendWayNotBetween(Integer value1, Integer value2) {
            addCriterion("send_way not between", value1, value2, "sendWay");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("send_type is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("send_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Integer value) {
            addCriterion("send_type =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Integer value) {
            addCriterion("send_type <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Integer value) {
            addCriterion("send_type >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_type >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Integer value) {
            addCriterion("send_type <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("send_type <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Integer> values) {
            addCriterion("send_type in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Integer> values) {
            addCriterion("send_type not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Integer value1, Integer value2) {
            addCriterion("send_type between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_type not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andMsgSourceIsNull() {
            addCriterion("msg_source is null");
            return (Criteria) this;
        }

        public Criteria andMsgSourceIsNotNull() {
            addCriterion("msg_source is not null");
            return (Criteria) this;
        }

        public Criteria andMsgSourceEqualTo(Integer value) {
            addCriterion("msg_source =", value, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceNotEqualTo(Integer value) {
            addCriterion("msg_source <>", value, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceGreaterThan(Integer value) {
            addCriterion("msg_source >", value, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_source >=", value, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceLessThan(Integer value) {
            addCriterion("msg_source <", value, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceLessThanOrEqualTo(Integer value) {
            addCriterion("msg_source <=", value, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceIn(List<Integer> values) {
            addCriterion("msg_source in", values, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceNotIn(List<Integer> values) {
            addCriterion("msg_source not in", values, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceBetween(Integer value1, Integer value2) {
            addCriterion("msg_source between", value1, value2, "msgSource");
            return (Criteria) this;
        }

        public Criteria andMsgSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_source not between", value1, value2, "msgSource");
            return (Criteria) this;
        }

        public Criteria andSendSubjectIsNull() {
            addCriterion("send_subject is null");
            return (Criteria) this;
        }

        public Criteria andSendSubjectIsNotNull() {
            addCriterion("send_subject is not null");
            return (Criteria) this;
        }

        public Criteria andSendSubjectEqualTo(Integer value) {
            addCriterion("send_subject =", value, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectNotEqualTo(Integer value) {
            addCriterion("send_subject <>", value, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectGreaterThan(Integer value) {
            addCriterion("send_subject >", value, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_subject >=", value, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectLessThan(Integer value) {
            addCriterion("send_subject <", value, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("send_subject <=", value, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectIn(List<Integer> values) {
            addCriterion("send_subject in", values, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectNotIn(List<Integer> values) {
            addCriterion("send_subject not in", values, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectBetween(Integer value1, Integer value2) {
            addCriterion("send_subject between", value1, value2, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andSendSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("send_subject not between", value1, value2, "sendSubject");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("msg_title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("msg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("msg_title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("msg_title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("msg_title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("msg_title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("msg_title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("msg_title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("msg_title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("msg_title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("msg_title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("msg_title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("msg_title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("msg_title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNull() {
            addCriterion("msg_content is null");
            return (Criteria) this;
        }

        public Criteria andMsgContentIsNotNull() {
            addCriterion("msg_content is not null");
            return (Criteria) this;
        }

        public Criteria andMsgContentEqualTo(String value) {
            addCriterion("msg_content =", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotEqualTo(String value) {
            addCriterion("msg_content <>", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThan(String value) {
            addCriterion("msg_content >", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentGreaterThanOrEqualTo(String value) {
            addCriterion("msg_content >=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThan(String value) {
            addCriterion("msg_content <", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLessThanOrEqualTo(String value) {
            addCriterion("msg_content <=", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentLike(String value) {
            addCriterion("msg_content like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotLike(String value) {
            addCriterion("msg_content not like", value, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentIn(List<String> values) {
            addCriterion("msg_content in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotIn(List<String> values) {
            addCriterion("msg_content not in", values, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentBetween(String value1, String value2) {
            addCriterion("msg_content between", value1, value2, "msgContent");
            return (Criteria) this;
        }

        public Criteria andMsgContentNotBetween(String value1, String value2) {
            addCriterion("msg_content not between", value1, value2, "msgContent");
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