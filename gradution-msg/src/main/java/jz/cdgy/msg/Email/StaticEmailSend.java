package jz.cdgy.msg.Email;

import jz.cdgy.common.exception.ParamException;
import jz.cdgy.msg.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class StaticEmailSend implements ToEmail {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendEmail(Email email) throws MessagingException {
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

            String content =
                    "<html><body><img width='250px' src= "+email.getImageUrl()+" '>"+email.getSubject()
                            + "</body></html>";
            helper.setText(content, true);
            mailSender.send(message);
        } catch (MessagingException e) {
            throw new ParamException("静态资源邮件发送失败!");
        }
    }
}
