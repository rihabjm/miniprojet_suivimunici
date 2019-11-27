package com.miniprojet.suivi.outils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
	@Autowired
    private JavaMailSender javaMailSender;
	
	public void sendEmail(String email, String oject, String subject) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(email);

        msg.setSubject(oject);
        msg.setText(subject);

        javaMailSender.send(msg);

    }

}
