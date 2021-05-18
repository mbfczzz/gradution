package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName("t_money")
public class Money implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String empName;

    private Integer statusId;

    private BigDecimal empMoney;

    private String moneyDescribe;

    private Integer refundWay;

    private Integer moneyItem;

    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date sendTime;

    @TableField(exist = false)
    private String statusName;

    @TableField(exist = false)
    private String refundName;

    @TableField(exist = false)
    private String accountName;

    @TableField(exist = false)
    private String sendTimeStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public BigDecimal getEmpMoney() {
        return empMoney;
    }

    public void setEmpMoney(BigDecimal empMoney) {
        this.empMoney = empMoney;
    }

    public String getMoneyDescribe() {
        return moneyDescribe;
    }

    public void setMoneyDescribe(String moneyDescribe) {
        this.moneyDescribe = moneyDescribe == null ? null : moneyDescribe.trim();
    }

    public Integer getRefundWay() {
        return refundWay;
    }

    public void setRefundWay(Integer refundWay) {
        this.refundWay = refundWay;
    }

    public Integer getMoneyItem() {
        return moneyItem;
    }

    public void setMoneyItem(Integer moneyItem) {
        this.moneyItem = moneyItem;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getRefundName() {
        return refundName;
    }

    public void setRefundName(String refundName) {
        this.refundName = refundName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getSendTimeStr() {
        return sendTimeStr;
    }

    public void setSendTimeStr(String sendTimeStr) {
        this.sendTimeStr = sendTimeStr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empName=").append(empName);
        sb.append(", statusId=").append(statusId);
        sb.append(", empMoney=").append(empMoney);
        sb.append(", moneyDescribe=").append(moneyDescribe);
        sb.append(", refundWay=").append(refundWay);
        sb.append(", moneyItem=").append(moneyItem);
        sb.append(", sendTime=").append(sendTime);
        sb.append("]");
        return sb.toString();
    }
}