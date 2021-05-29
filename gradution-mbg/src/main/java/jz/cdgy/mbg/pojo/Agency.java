package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

@TableName("t_agency")
public class Agency implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String agencyName;

    private String agencyDescribe;

    @TableField(fill = FieldFill.INSERT)
    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    public String getAgencyDescribe() {
        return agencyDescribe;
    }

    public void setAgencyDescribe(String agencyDescribe) {
        this.agencyDescribe = agencyDescribe == null ? null : agencyDescribe.trim();
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
        sb.append(", agencyName=").append(agencyName);
        sb.append(", agencyDescribe=").append(agencyDescribe);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}