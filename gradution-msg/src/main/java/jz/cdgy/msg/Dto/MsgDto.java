package jz.cdgy.msg.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MsgDto {

    private String id;

    private String msgTitle;

    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss",timezone ="GMT+8")
    private String sendTime;

    private String msgContent;

    private String sendWay;

    private Integer modelId;

    private String sendPeople;

    private String sourceId;

    private String subjectId;
}
