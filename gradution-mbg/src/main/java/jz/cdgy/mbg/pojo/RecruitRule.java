package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

@TableName("t_recruit_rule")
public class RecruitRule implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer recruitId;

    private Integer ruleId;

    @TableField(fill = FieldFill.INSERT)
    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Integer recruitId) {
        this.recruitId = recruitId;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
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
        sb.append(", recruitId=").append(recruitId);
        sb.append(", ruleId=").append(ruleId);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}