package jz.cdgy.mbg.pojo;

import java.io.Serializable;
import java.util.Date;

public class Msg implements Serializable {
    private Integer id;

    private String type;

    private String sendPeople;

    private Date sendTime;

    private Integer modelId;

    private Integer sendWay;

    private Integer sendType;

    private Integer msgSource;

    private Integer sendSubject;

    private String msgTitle;

    private String msgContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSendPeople() {
        return sendPeople;
    }

    public void setSendPeople(String sendPeople) {
        this.sendPeople = sendPeople == null ? null : sendPeople.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getSendWay() {
        return sendWay;
    }

    public void setSendWay(Integer sendWay) {
        this.sendWay = sendWay;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Integer getMsgSource() {
        return msgSource;
    }

    public void setMsgSource(Integer msgSource) {
        this.msgSource = msgSource;
    }

    public Integer getSendSubject() {
        return sendSubject;
    }

    public void setSendSubject(Integer sendSubject) {
        this.sendSubject = sendSubject;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", sendPeople=").append(sendPeople);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", modelId=").append(modelId);
        sb.append(", sendWay=").append(sendWay);
        sb.append(", sendType=").append(sendType);
        sb.append(", msgSource=").append(msgSource);
        sb.append(", sendSubject=").append(sendSubject);
        sb.append(", msgTitle=").append(msgTitle);
        sb.append(", msgContent=").append(msgContent);
        sb.append("]");
        return sb.toString();
    }
}