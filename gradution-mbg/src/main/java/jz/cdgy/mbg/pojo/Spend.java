package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("t_spend")
public class Spend implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String spendPeople;

    private String spendItem;

    private Integer spendWay;

    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date spendTime;

    private String spendMark;

    private Integer spendStatus;

    @TableField(exist = false)
    private String WayName;

    @TableField(exist = false)
    private String spendTimeStr;

    @TableField(exist = false)
    private String statusName;

    @TableField(exist = false)
    private String itemName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpendPeople() {
        return spendPeople;
    }

    public void setSpendPeople(String spendPeople) {
        this.spendPeople = spendPeople == null ? null : spendPeople.trim();
    }

    public String getSpendItem() {
        return spendItem;
    }

    public void setSpendItem(String spendItem) {
        this.spendItem = spendItem == null ? null : spendItem.trim();
    }

    public Integer getSpendWay() {
        return spendWay;
    }

    public void setSpendWay(Integer spendWay) {
        this.spendWay = spendWay;
    }

    public Date getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Date spendTime) {
        this.spendTime = spendTime;
    }

    public String getSpendMark() {
        return spendMark;
    }

    public void setSpendMark(String spendMark) {
        this.spendMark = spendMark == null ? null : spendMark.trim();
    }

    public Integer getSpendStatus() {
        return spendStatus;
    }

    public void setSpendStatus(Integer spendStatus) {
        this.spendStatus = spendStatus;
    }

    public String getWayName() {
        return WayName;
    }

    public void setWayName(String dWayName) {
        this.WayName = WayName;
    }

    public String getSpendTimeStr() {
        return spendTimeStr;
    }

    public void setSpendTimeStr(String spendTimeStr) {
        this.spendTimeStr = spendTimeStr;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spendPeople=").append(spendPeople);
        sb.append(", spendItem=").append(spendItem);
        sb.append(", spendWay=").append(spendWay);
        sb.append(", spendTime=").append(spendTime);
        sb.append(", spendMark=").append(spendMark);
        sb.append(", spendStatus=").append(spendStatus);
        sb.append("]");
        return sb.toString();
    }
}