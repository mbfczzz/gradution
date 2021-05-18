package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

@TableName("t_status")
public class Status implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String statusName;

    private String statusDescribe;

    @TableField(fill = FieldFill.INSERT)
    private Integer isValid;

    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}