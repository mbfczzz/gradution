package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

@TableName("t_problem")
public class Problem implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String problemModel;

    private String problemContent;

    private Byte isOk;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private String addPeople;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblemModel() {
        return problemModel;
    }

    public void setProblemModel(String problemModel) {
        this.problemModel = problemModel == null ? null : problemModel.trim();
    }

    public String getProblemContent() {
        return problemContent;
    }

    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent == null ? null : problemContent.trim();
    }

    public Byte getIsOk() {
        return isOk;
    }

    public void setIsOk(Byte isOk) {
        this.isOk = isOk;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddPeople() {
        return addPeople;
    }

    public void setAddPeople(String addPeople) {
        this.addPeople = addPeople == null ? null : addPeople.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", problemModel=").append(problemModel);
        sb.append(", problemContent=").append(problemContent);
        sb.append(", isOk=").append(isOk);
        sb.append(", createTime=").append(createTime);
        sb.append(", addPeople=").append(addPeople);
        sb.append("]");
        return sb.toString();
    }
}