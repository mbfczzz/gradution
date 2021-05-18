package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("t_job_transfer")
public class JobTransfer implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer sourceDepartment;

    private Integer destineDepartment;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date transferTime;

    private Integer empId;

    private Integer statusId;

    private String transferReason;

    @TableField(exist = false)
    private String empName;

    @TableField(exist = false)
    private String sourceDepartmentName;

    @TableField(exist = false)
    private String destineDepartmentName;

    @TableField(exist = false)
    private String transferTimeStr;

    @TableField(exist = false)
    private String statusName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSourceDepartment() {
        return sourceDepartment;
    }

    public void setSourceDepartment(Integer sourceDepartment) {
        this.sourceDepartment = sourceDepartment;
    }

    public Integer getDestineDepartment() {
        return destineDepartment;
    }

    public void setDestineDepartment(Integer destineDepartment) {
        this.destineDepartment = destineDepartment;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getTransferReason() {
        return transferReason;
    }

    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason == null ? null : transferReason.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSourceDepartmentName() {
        return sourceDepartmentName;
    }

    public void setSourceDepartmentName(String sourceDepartmentName) {
        this.sourceDepartmentName = sourceDepartmentName;
    }

    public String getDestineDepartmentName() {
        return destineDepartmentName;
    }

    public void setDestineDepartmentName(String destineDepartmentName) {
        this.destineDepartmentName = destineDepartmentName;
    }

    public String getTransferTimeStr() {
        return transferTimeStr;
    }

    public void setTransferTimeStr(String transferTimeStr) {
        this.transferTimeStr = transferTimeStr;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceDepartment=").append(sourceDepartment);
        sb.append(", destineDepartment=").append(destineDepartment);
        sb.append(", transferTime=").append(transferTime);
        sb.append(", empId=").append(empId);
        sb.append(", statusId=").append(statusId);
        sb.append(", transferReason=").append(transferReason);
        sb.append("]");
        return sb.toString();
    }
}