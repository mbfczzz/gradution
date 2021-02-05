package jz.cdgy.msg.Email;

import jz.cdgy.common.exception.ParamException;
import jz.cdgy.msg.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;

@Component
public class AttachEmailSend implements ToEmail {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendEmail(Email email) throws MessagingException {
        //创建一个MINE消息
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            //谁发
            helper.setFrom(from);
            //谁接收
            helper.setTo(email.getTargets());
            //邮件主题
            helper.setSubject(email.getTitle());
            //邮件内容   true 表示带有附件或html
            helper.setText(email.getSubject(), true);
            String fileName = email.getMultipartFile().getOriginalFilename();
            File file = File.createTempFile(fileName,fileName.substring(fileName.lastIndexOf(".")));
            email.getMultipartFile().transferTo(file);
            FileSystemResource multipartFileToFile = new FileSystemResource(file);
            //添加附件
            helper.addAttachment(multipartFileToFile.getFilename(), multipartFileToFile);
            mailSender.send(message);
        } catch (MessagingException | IOException e) {
            throw new ParamException("附件邮件发送失败!");
        }
    }
}
