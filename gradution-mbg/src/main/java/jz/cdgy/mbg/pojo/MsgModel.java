package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

@TableName(value = "t_msg_model")
public class MsgModel implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String msgType;

    private String msgName;

    private String title;

    private Integer isValid;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date updateTime;

    private String msgContent;

    private int isUse;

    private int wayId;

    private String resoureUrl;

    private static final long serialVersionUID = 1L;

    public String getResoureUrl() {
        return resoureUrl;
    }

    public void setResoureUrl(String resoureUrl) {
        this.resoureUrl = resoureUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getMsgName() {
        return msgName;
    }

    public void setMsgName(String msgName) {
        this.msgName = msgName == null ? null : msgName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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

    public String getMsgContent() {
        return msgContent;
    }

    public int getIsUse() {
        return isUse;
    }

    public void setIsUse(int isUse) {
        this.isUse = isUse;
    }

    public int getWayId() {
        return wayId;
    }

    public void setWayId(int wayId) {
        this.wayId = wayId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    @Override
    public String toString() {
        return "MsgModel{" +
                "id=" + id +
                ", msgType='" + msgType + '\'' +
                ", msgName='" + msgName + '\'' +
                ", title='" + title + '\'' +
                ", isValid=" + isValid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", msgContent='" + msgContent + '\'' +
                ", isUse=" + isUse +
                ", wayId=" + wayId +
                '}';
    }
}