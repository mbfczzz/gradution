package jz.cdgy.msg.Email;

import jz.cdgy.msg.model.Email;

import javax.mail.MessagingException;

public  interface  ToEmail {

    void sendEmail(Email email) throws MessagingException;
}
