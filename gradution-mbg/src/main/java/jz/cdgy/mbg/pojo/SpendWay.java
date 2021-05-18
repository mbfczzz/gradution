package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

@TableName("t_spend_way")
public class SpendWay implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String wayName;

    private String wayDescribe;

    @TableField(fill = FieldFill.INSERT)
    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWayName() {
        return wayName;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName == null ? null : wayName.trim();
    }

    public String getWayDescribe() {
        return wayDescribe;
    }

    public void setWayDescribe(String wayDescribe) {
        this.wayDescribe = wayDescribe == null ? null : wayDescribe.trim();
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wayName=").append(wayName);
        sb.append(", wayDescribe=").append(wayDescribe);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}