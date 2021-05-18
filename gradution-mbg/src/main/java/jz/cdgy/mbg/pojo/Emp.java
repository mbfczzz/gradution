package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_emp")
public class Emp implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String empName;

    private String empAddress;

    private String empPhone;

    private String empWx;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date createTime;

    @TableField(exist = false)
    private String createTimeStr;

    @TableField(fill = FieldFill.UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date updateTime;

    @TableField(exist = false)
    private String updateTimeStr;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date leaveTime;

    @TableField(exist = false)
    private String leaveTimeStr;

    @TableField(fill = FieldFill.INSERT)
    private Byte isLeave;

    private String empEmail;

    private Integer empPosition;

    private Integer empDepartment;

    @TableField(exist = false)
    private String positionName;

    @TableField(exist = false)
    private String departmentName;

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

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress == null ? null : empAddress.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpWx() {
        return empWx;
    }

    public void setEmpWx(String empWx) {
        this.empWx = empWx == null ? null : empWx.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Byte getIsLeave() {
        return isLeave;
    }

    public void setIsLeave(Byte isLeave) {
        this.isLeave = isLeave;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }


    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getUpdateTimeStr() {
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public String getLeaveTimeStr() {
        return leaveTimeStr;
    }

    public void setLeaveTimeStr(String leaveTimeStr) {
        this.leaveTimeStr = leaveTimeStr;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(Integer empPosition) {
        this.empPosition = empPosition;
    }

    public Integer getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Integer empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empWx='" + empWx + '\'' +
                ", createTime=" + createTime +
                ", createTimeStr='" + createTimeStr + '\'' +
                ", updateTime=" + updateTime +
                ", updateTimeStr='" + updateTimeStr + '\'' +
                ", leaveTime=" + leaveTime +
                ", leaveTimeStr='" + leaveTimeStr + '\'' +
                ", isLeave=" + isLeave +
                ", empEmail='" + empEmail + '\'' +
                ", empPosition=" + empPosition +
                ", empDepartment=" + empDepartment +
                '}';
    }
}