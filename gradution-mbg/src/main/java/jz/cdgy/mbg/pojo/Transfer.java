package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("t_transfer")
public class Transfer implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String sourceAddr;

    private String destineAddr;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date transferTime;

    private Integer empId;

    private Integer statusId;

    private String transferReason;

    @TableField(exist = false)
    private String empName;

    @TableField(exist = false)
    private String statusName;

    @TableField(exist = false)
    private String transferTimeStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr == null ? null : sourceAddr.trim();
    }

    public String getDestineAddr() {
        return destineAddr;
    }

    public void setDestineAddr(String destineAddr) {
        this.destineAddr = destineAddr == null ? null : destineAddr.trim();
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

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceAddr=").append(sourceAddr);
        sb.append(", destineAddr=").append(destineAddr);
        sb.append(", empId=").append(empId);
        sb.append(", statusId=").append(statusId);
        sb.append(", transferReason=").append(transferReason);
        sb.append("]");
        return sb.toString();
    }
}