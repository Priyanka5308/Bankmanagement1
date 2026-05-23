package com.bank.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender mailSender() {

        JavaMailSenderImpl sender = new JavaMailSenderImpl();

        sender.setHost("smtp.gmail.com");
        sender.setPort(587);
        sender.setUsername("priyanka.raama@gmail.com");      // change
        sender.setPassword("cgbl jana dtmn dxsp");         // change

        Properties props = sender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true"); //new
        props.put("mail.smtp.ssl.protocols", "TLSv1.2"); //new 
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com"); //new
        props.put("mail.debug", "true");

        return sender;
    }
}
