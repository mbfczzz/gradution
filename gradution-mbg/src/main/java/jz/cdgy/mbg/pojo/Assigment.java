package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@TableName("t_assigment")
public class Assigment implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer empId;

    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date assigementTime;

    private Integer taskId;

    private Integer statusId;

    @TableField(exist = false)
    private String assigementTimeStr;

    @TableField(exist = false)
    private String taskName;

    @TableField(exist = false)
    private String statusName;

    @TableField(exist = false)
    private String empName;

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

    public Date getAssigementTime() {
        return assigementTime;
    }

    public void setAssigementTime(Date assigementTime) {
        this.assigementTime = assigementTime;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getAssigementTimeStr() {
        return assigementTimeStr;
    }

    public void setAssigementTimeStr(String assigementTimeStr) {
        this.assigementTimeStr = assigementTimeStr;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
        sb.append(", assigementTime=").append(assigementTime);
        sb.append(", taskId=").append(taskId);
        sb.append(", statusId=").append(statusId);
        sb.append("]");
        return sb.toString();
    }
}