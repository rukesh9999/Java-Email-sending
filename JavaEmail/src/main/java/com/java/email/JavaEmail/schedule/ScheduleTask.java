package com.java.email.JavaEmail.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

	private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);
	SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
	
	//@Scheduled(fixedRate = 1000)
	public void scheduletask() {
		log.info("the time is now {}..."+sdf.format(new Date()));
	}
}
