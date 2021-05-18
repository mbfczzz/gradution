package jz.cdgy.mbg.pojo;

import com.baomidou.mybatisplus.annotation.*;
import org.omg.CORBA.IDLType;

import java.io.Serializable;

@TableName("t_refund_way")
public class RefundWay implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String refundName;

    private String refundDescribe;

    @TableField(fill = FieldFill.INSERT)
    private Byte isValid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefundName() {
        return refundName;
    }

    public void setRefundName(String refundName) {
        this.refundName = refundName == null ? null : refundName.trim();
    }

    public String getRefundDescribe() {
        return refundDescribe;
    }

    public void setRefundDescribe(String refundDescribe) {
        this.refundDescribe = refundDescribe == null ? null : refundDescribe.trim();
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
        sb.append(", refundName=").append(refundName);
        sb.append(", refundDescribe=").append(refundDescribe);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}