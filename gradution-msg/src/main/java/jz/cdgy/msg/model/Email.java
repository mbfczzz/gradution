package jz.cdgy.msg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Email {
    private String[] targets;

    //主体内容
    private String subject;

    //标题
    private String title;

    private String imageUrl;

    private MultipartFile multipartFile;
}
