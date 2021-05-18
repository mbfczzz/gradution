package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@TableName("t_recruit")
public class Recruit implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private Integer releasePeople;

    private String recruitContent;

    private Integer recruitPosition;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date recruitTime;

    private String recruitName;

    @TableField(exist = false)
    private String  recruitTimeStr;

    @TableField(exist = false)
    private String empName;

    @TableField(exist = false)
    private String positionName;

    @TableField(exist = false)
    private List<Rule> rules;

    @TableField(exist = false)
    private String ruleStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReleasePeople() {
        return releasePeople;
    }

    public void setReleasePeople(Integer releasePeople) {
        this.releasePeople = releasePeople;
    }

    public String getRecruitContent() {
        return recruitContent;
    }

    public void setRecruitContent(String recruitContent) {
        this.recruitContent = recruitContent == null ? null : recruitContent.trim();
    }

    public Integer getRecruitPosition() {
        return recruitPosition;
    }

    public void setRecruitPosition(Integer recruitPosition) {
        this.recruitPosition = recruitPosition;
    }

    public Date getRecruitTime() {
        return recruitTime;
    }

    public void setRecruitTime(Date recruitTime) {
        this.recruitTime = recruitTime;
    }

    public String getRecruitName() {
        return recruitName;
    }

    public void setRecruitName(String recruitName) {
        this.recruitName = recruitName == null ? null : recruitName.trim();
    }

    public String getRecruitTimeStr() {
        return recruitTimeStr;
    }

    public void setRecruitTimeStr(String recruitTimeStr) {
        this.recruitTimeStr = recruitTimeStr;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRuleStr() {
        return ruleStr;
    }

    public void setRuleStr(String ruleStr) {
        this.ruleStr = ruleStr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", releasePeople=").append(releasePeople);
        sb.append(", recruitContent=").append(recruitContent);
        sb.append(", recruitPosition=").append(recruitPosition);
        sb.append(", recruitTime=").append(recruitTime);
        sb.append(", recruitName=").append(recruitName);
        sb.append("]");
        return sb.toString();
    }
}