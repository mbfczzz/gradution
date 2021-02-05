package jz.cdgy.msg.Email;

import jz.cdgy.msg.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class HtmlEmailSend implements   ToEmail {
    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;
    @Override
    public void sendEmail(Email email) throws MessagingException {
            //创建一个MINE消息
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper minehelper = new MimeMessageHelper(message, true);
            //谁发
            minehelper.setFrom(from);
            //谁要接收
            minehelper.setTo(email.getTargets());
            //邮件主题
            minehelper.setSubject(email.getTitle());
            //邮件内容   true 表示带有附件或html
            minehelper.setText(email.getSubject(), true);
            try {
                mailSender.send(message);
            } catch (MailException e) {
                e.printStackTrace();
            }
        }
    }
