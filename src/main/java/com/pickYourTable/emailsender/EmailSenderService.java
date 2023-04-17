package com.pickYourTable.emailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderService{

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmailVerificationCode(String code, String to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("PickYourApplication - Twój kod weryfikacyjny");
        message.setText("Cześć! Twój kod do weryfikacji konta to: " + code);
        emailSender.send(message);
    }
}