package jz.cdgy.mbg.pojo;

import java.io.Serializable;

public class Status implements Serializable {
    private Integer id;

    private String statusName;

    private String statusDescribe;

    private Integer isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getStatusDescribe() {
        return statusDescribe;
    }

    public void setStatusDescribe(String statusDescribe) {
        this.statusDescribe = statusDescribe == null ? null : statusDescribe.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", statusName=").append(statusName);
        sb.append(", statusDescribe=").append(statusDescribe);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}