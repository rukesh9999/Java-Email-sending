package com.java.email.JavaEmail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.email.JavaEmail.schedule.ScheduleTask;

@RestController
@RequestMapping("/api")
public class EmailService {

	@Autowired
	JavaMailSender javaMailSender;
	private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);
	
	//@Scheduled(fixedRate =5000)
	@GetMapping("/send")
	public String sendEmail()
	{
		log.info("enterd sending mail method");	
		String mess;
		
		SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
		simpleMailMessage.setTo("tech.rukesh9999@gmail.com");
		simpleMailMessage.setSubject("hiiiii");
		simpleMailMessage.setText(" hi how r u ..."+" http://localhost:8080/api/auth/accountVerification");
		try {
		log.info("Before sending mail");	
		javaMailSender.send(simpleMailMessage);
		log.info("After sending mail");
		mess="Email sent successfully.....!!";
		}
		catch (Exception e) {
			// TODO: handle exception
			mess="failed to sent mail...";
			e.printStackTrace();
		}
		
		log.info("completed sending mail method");	
		return mess;
		
	}
	
	

	
}
