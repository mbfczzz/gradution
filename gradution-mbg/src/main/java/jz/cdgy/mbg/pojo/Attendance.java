package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@TableName("t_attendance")
public class Attendance implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date attendanceTime;

    private Byte isCard;

    private Byte isAgency;

    private Byte isReplacement;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date oneCard;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private Date towCard;

    private Integer cardPeople;

    @TableField(exist = false)
    private String attendanceTimeStr;

    @TableField(exist = false)
    private String oneCardStr;

    @TableField(exist = false)
    private String towCardStr;

    @TableField(exist = false)
    private String empName;

    @TableField(exist = false)
    private List<Agency> agencys;

    @TableField(exist = false)
    private String  agencyStr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(Date attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public Byte getIsCard() {
        return isCard;
    }

    public void setIsCard(Byte isCard) {
        this.isCard = isCard;
    }

    public Byte getIsAgency() {
        return isAgency;
    }

    public void setIsAgency(Byte isAgency) {
        this.isAgency = isAgency;
    }

    public Byte getIsReplacement() {
        return isReplacement;
    }

    public void setIsReplacement(Byte isReplacement) {
        this.isReplacement = isReplacement;
    }

    public Date getOneCard() {
        return oneCard;
    }

    public void setOneCard(Date oneCard) {
        this.oneCard = oneCard;
    }

    public Date getTowCard() {
        return towCard;
    }

    public void setTowCard(Date towCard) {
        this.towCard = towCard;
    }

    public Integer getCardPeople() {
        return cardPeople;
    }

    public void setCardPeople(Integer cardPeople) {
        this.cardPeople = cardPeople;
    }

    public String getAttendanceTimeStr() {
        return attendanceTimeStr;
    }

    public void setAttendanceTimeStr(String attendanceTimeStr) {
        this.attendanceTimeStr = attendanceTimeStr;
    }

    public String getOneCardStr() {
        return oneCardStr;
    }

    public void setOneCardStr(String oneCardStr) {
        this.oneCardStr = oneCardStr;
    }

    public String getTowCardStr() {
        return towCardStr;
    }

    public void setTowCardStr(String towCardStr) {
        this.towCardStr = towCardStr;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<Agency> getAgencys() {
        return agencys;
    }

    public void setAgencys(List<Agency> agencys) {
        this.agencys = agencys;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAgencyStr() {
        return agencyStr;
    }

    public void setAgencyStr(String agencyStr) {
        this.agencyStr = agencyStr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attendanceTime=").append(attendanceTime);
        sb.append(", isCard=").append(isCard);
        sb.append(", isAgency=").append(isAgency);
        sb.append(", isReplacement=").append(isReplacement);
        sb.append(", oneCard=").append(oneCard);
        sb.append(", towCard=").append(towCard);
        sb.append(", cardPeople=").append(cardPeople);
        sb.append("]");
        return sb.toString();
    }
}