package com.webPersonal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
    private JavaMailSender mailSender;
	
	 public void sendEmail(String to, String subject, String content) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo(to);  
        email.setSubject(subject);
        email.setText(content);
        
        mailSender.send(email);
    }
	 
	 public void sendGenericEmail(String to) {
	
        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo(to);  
        email.setSubject("Enseguida me pondre en contacto con usted");
        email.setText("Muchas gracias por visitar mi web, ahora mismo me encuentro atendiendo su consulta, me pondré en contacto en la mayor brevedad posible. Un saludo");
        
        mailSender.send(email);
    }

}
