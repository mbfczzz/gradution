package jz.cdgy.mbg.pojo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer id;

    private String empName;

    private String empAddress;

    private String empPhone;

    private String empWx;

    private Date createTime;

    private Date updateTime;

    private Date leaveTime;

    private Byte isLeave;

    private String empEmail;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empName=").append(empName);
        sb.append(", empAddress=").append(empAddress);
        sb.append(", empPhone=").append(empPhone);
        sb.append(", empWx=").append(empWx);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", isLeave=").append(isLeave);
        sb.append(", empEmail=").append(empEmail);
        sb.append("]");
        return sb.toString();
    }
}