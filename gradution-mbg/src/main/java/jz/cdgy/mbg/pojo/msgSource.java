package jz.cdgy.mbg.pojo;

import java.io.Serializable;
import java.util.Date;

public class msgSource implements Serializable {
    private Integer id;

    private String sourceName;

    private String sourceDescribe;

    private Date createTime;

    private Date updateTime;

    private Integer isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    public String getSourceDescribe() {
        return sourceDescribe;
    }

    public void setSourceDescribe(String sourceDescribe) {
        this.sourceDescribe = sourceDescribe == null ? null : sourceDescribe.trim();
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
        sb.append(", sourceName=").append(sourceName);
        sb.append(", sourceDescribe=").append(sourceDescribe);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}