package jz.cdgy.mbg.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferExample() {
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

        public Criteria andSourceAddrIsNull() {
            addCriterion("source_addr is null");
            return (Criteria) this;
        }

        public Criteria andSourceAddrIsNotNull() {
            addCriterion("source_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAddrEqualTo(String value) {
            addCriterion("source_addr =", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotEqualTo(String value) {
            addCriterion("source_addr <>", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrGreaterThan(String value) {
            addCriterion("source_addr >", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("source_addr >=", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrLessThan(String value) {
            addCriterion("source_addr <", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrLessThanOrEqualTo(String value) {
            addCriterion("source_addr <=", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrLike(String value) {
            addCriterion("source_addr like", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotLike(String value) {
            addCriterion("source_addr not like", value, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrIn(List<String> values) {
            addCriterion("source_addr in", values, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotIn(List<String> values) {
            addCriterion("source_addr not in", values, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrBetween(String value1, String value2) {
            addCriterion("source_addr between", value1, value2, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andSourceAddrNotBetween(String value1, String value2) {
            addCriterion("source_addr not between", value1, value2, "sourceAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrIsNull() {
            addCriterion("destine_addr is null");
            return (Criteria) this;
        }

        public Criteria andDestineAddrIsNotNull() {
            addCriterion("destine_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDestineAddrEqualTo(String value) {
            addCriterion("destine_addr =", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrNotEqualTo(String value) {
            addCriterion("destine_addr <>", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrGreaterThan(String value) {
            addCriterion("destine_addr >", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrGreaterThanOrEqualTo(String value) {
            addCriterion("destine_addr >=", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrLessThan(String value) {
            addCriterion("destine_addr <", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrLessThanOrEqualTo(String value) {
            addCriterion("destine_addr <=", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrLike(String value) {
            addCriterion("destine_addr like", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrNotLike(String value) {
            addCriterion("destine_addr not like", value, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrIn(List<String> values) {
            addCriterion("destine_addr in", values, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrNotIn(List<String> values) {
            addCriterion("destine_addr not in", values, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrBetween(String value1, String value2) {
            addCriterion("destine_addr between", value1, value2, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andDestineAddrNotBetween(String value1, String value2) {
            addCriterion("destine_addr not between", value1, value2, "destineAddr");
            return (Criteria) this;
        }

        public Criteria andTranferTimeIsNull() {
            addCriterion("tranfer_time is null");
            return (Criteria) this;
        }

        public Criteria andTranferTimeIsNotNull() {
            addCriterion("tranfer_time is not null");
            return (Criteria) this;
        }

        public Criteria andTranferTimeEqualTo(Date value) {
            addCriterion("tranfer_time =", value, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeNotEqualTo(Date value) {
            addCriterion("tranfer_time <>", value, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeGreaterThan(Date value) {
            addCriterion("tranfer_time >", value, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tranfer_time >=", value, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeLessThan(Date value) {
            addCriterion("tranfer_time <", value, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeLessThanOrEqualTo(Date value) {
            addCriterion("tranfer_time <=", value, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeIn(List<Date> values) {
            addCriterion("tranfer_time in", values, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeNotIn(List<Date> values) {
            addCriterion("tranfer_time not in", values, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeBetween(Date value1, Date value2) {
            addCriterion("tranfer_time between", value1, value2, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andTranferTimeNotBetween(Date value1, Date value2) {
            addCriterion("tranfer_time not between", value1, value2, "tranferTime");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
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

        public Criteria andTransferReasonIsNull() {
            addCriterion("transfer_reason is null");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIsNotNull() {
            addCriterion("transfer_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTransferReasonEqualTo(String value) {
            addCriterion("transfer_reason =", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotEqualTo(String value) {
            addCriterion("transfer_reason <>", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonGreaterThan(String value) {
            addCriterion("transfer_reason >", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_reason >=", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLessThan(String value) {
            addCriterion("transfer_reason <", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLessThanOrEqualTo(String value) {
            addCriterion("transfer_reason <=", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonLike(String value) {
            addCriterion("transfer_reason like", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotLike(String value) {
            addCriterion("transfer_reason not like", value, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonIn(List<String> values) {
            addCriterion("transfer_reason in", values, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotIn(List<String> values) {
            addCriterion("transfer_reason not in", values, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonBetween(String value1, String value2) {
            addCriterion("transfer_reason between", value1, value2, "transferReason");
            return (Criteria) this;
        }

        public Criteria andTransferReasonNotBetween(String value1, String value2) {
            addCriterion("transfer_reason not between", value1, value2, "transferReason");
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