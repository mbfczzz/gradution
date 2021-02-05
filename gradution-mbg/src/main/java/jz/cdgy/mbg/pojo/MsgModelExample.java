package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MsgModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgModelExample() {
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

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(String value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(String value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(String value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(String value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(String value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLike(String value) {
            addCriterion("msg_type like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotLike(String value) {
            addCriterion("msg_type not like", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<String> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<String> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(String value1, String value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(String value1, String value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgNameIsNull() {
            addCriterion("msg_name is null");
            return (Criteria) this;
        }

        public Criteria andMsgNameIsNotNull() {
            addCriterion("msg_name is not null");
            return (Criteria) this;
        }

        public Criteria andMsgNameEqualTo(String value) {
            addCriterion("msg_name =", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotEqualTo(String value) {
            addCriterion("msg_name <>", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameGreaterThan(String value) {
            addCriterion("msg_name >", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameGreaterThanOrEqualTo(String value) {
            addCriterion("msg_name >=", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameLessThan(String value) {
            addCriterion("msg_name <", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameLessThanOrEqualTo(String value) {
            addCriterion("msg_name <=", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameLike(String value) {
            addCriterion("msg_name like", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotLike(String value) {
            addCriterion("msg_name not like", value, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameIn(List<String> values) {
            addCriterion("msg_name in", values, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotIn(List<String> values) {
            addCriterion("msg_name not in", values, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameBetween(String value1, String value2) {
            addCriterion("msg_name between", value1, value2, "msgName");
            return (Criteria) this;
        }

        public Criteria andMsgNameNotBetween(String value1, String value2) {
            addCriterion("msg_name not between", value1, value2, "msgName");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andResoureUrlIsNull() {
            addCriterion("resoure_url is null");
            return (Criteria) this;
        }

        public Criteria andResoureUrlIsNotNull() {
            addCriterion("resoure_url is not null");
            return (Criteria) this;
        }

        public Criteria andResoureUrlEqualTo(String value) {
            addCriterion("resoure_url =", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlNotEqualTo(String value) {
            addCriterion("resoure_url <>", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlGreaterThan(String value) {
            addCriterion("resoure_url >", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("resoure_url >=", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlLessThan(String value) {
            addCriterion("resoure_url <", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlLessThanOrEqualTo(String value) {
            addCriterion("resoure_url <=", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlLike(String value) {
            addCriterion("resoure_url like", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlNotLike(String value) {
            addCriterion("resoure_url not like", value, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlIn(List<String> values) {
            addCriterion("resoure_url in", values, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlNotIn(List<String> values) {
            addCriterion("resoure_url not in", values, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlBetween(String value1, String value2) {
            addCriterion("resoure_url between", value1, value2, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andResoureUrlNotBetween(String value1, String value2) {
            addCriterion("resoure_url not between", value1, value2, "resoureUrl");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("is_use is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("is_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Integer value) {
            addCriterion("is_use =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Integer value) {
            addCriterion("is_use <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Integer value) {
            addCriterion("is_use >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Integer value) {
            addCriterion("is_use <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Integer value) {
            addCriterion("is_use <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion("is_use in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion("is_use not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Integer value1, Integer value2) {
            addCriterion("is_use between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andWayIdIsNull() {
            addCriterion("way_id is null");
            return (Criteria) this;
        }

        public Criteria andWayIdIsNotNull() {
            addCriterion("way_id is not null");
            return (Criteria) this;
        }

        public Criteria andWayIdEqualTo(Integer value) {
            addCriterion("way_id =", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotEqualTo(Integer value) {
            addCriterion("way_id <>", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdGreaterThan(Integer value) {
            addCriterion("way_id >", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_id >=", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdLessThan(Integer value) {
            addCriterion("way_id <", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdLessThanOrEqualTo(Integer value) {
            addCriterion("way_id <=", value, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdIn(List<Integer> values) {
            addCriterion("way_id in", values, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotIn(List<Integer> values) {
            addCriterion("way_id not in", values, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdBetween(Integer value1, Integer value2) {
            addCriterion("way_id between", value1, value2, "wayId");
            return (Criteria) this;
        }

        public Criteria andWayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("way_id not between", value1, value2, "wayId");
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