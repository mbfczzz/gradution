package jz.cdgy.msg.Email;

import jz.cdgy.msg.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SimpleEmailSend implements ToEmail {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendEmail(Email email) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //谁发的
        simpleMailMessage.setFrom(from);
        //谁要接收
        simpleMailMessage.setTo(email.getTargets());
        //邮件标题
        simpleMailMessage.setSubject(email.getTitle());
        //邮件内容
        simpleMailMessage.setText(email.getSubject());
        try {
            System.out.println(simpleMailMessage);
            mailSender.send(simpleMailMessage);
        } catch (MailException e) {
            e.printStackTrace();
        }
    }
}
