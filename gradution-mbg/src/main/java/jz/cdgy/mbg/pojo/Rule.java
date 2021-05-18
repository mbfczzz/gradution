package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

@TableName("t_rule")
public class Rule implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String ruleName;

    private String ruleDescribe;

    @TableField(fill = FieldFill.INSERT)
    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public String getRuleDescribe() {
        return ruleDescribe;
    }

    public void setRuleDescribe(String ruleDescribe) {
        this.ruleDescribe = ruleDescribe == null ? null : ruleDescribe.trim();
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
        sb.append(", ruleName=").append(ruleName);
        sb.append(", ruleDescribe=").append(ruleDescribe);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}