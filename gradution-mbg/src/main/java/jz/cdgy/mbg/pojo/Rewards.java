package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("t_rewards")
public class Rewards implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer empId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private Date rewardTime;

    private String rewardContent;

    private Integer rewardStandard;

    @TableField(exist = false)
    private String empName;

    @TableField(exist = false)
    private String positionName;

    @TableField(exist = false)
    private String empPhone;

    @TableField(exist = false)
    private String departmentName;

    @TableField(exist = false)
    private String rewardTimeStr;

    @TableField(exist = false)
    private String standardName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getRewardTime() {
        return rewardTime;
    }

    public void setRewardTime(Date rewardTime) {
        this.rewardTime = rewardTime;
    }

    public String getRewardContent() {
        return rewardContent;
    }

    public void setRewardContent(String rewardContent) {
        this.rewardContent = rewardContent == null ? null : rewardContent.trim();
    }

    public Integer getRewardStandard() {
        return rewardStandard;
    }

    public void setRewardStandard(Integer rewardStandard) {
        this.rewardStandard = rewardStandard;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getRewardTimeStr() {
        return rewardTimeStr;
    }

    public void setRewardTimeStr(String rewardTimeStr) {
        this.rewardTimeStr = rewardTimeStr;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empId=").append(empId);
        sb.append(", rewardTime=").append(rewardTime);
        sb.append(", rewardContent=").append(rewardContent);
        sb.append(", rewardStandard=").append(rewardStandard);
        sb.append("]");
        return sb.toString();
    }
}