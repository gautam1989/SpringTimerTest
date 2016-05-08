package com.test.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Configuration
@ComponentScan(basePackages="com.test.test")
@EnableScheduling
public class TestContorller {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@Scheduled(fixedDelay = 5000)
	 public void fixedDelayTask() {
	 System.out.println(new Date() + " This runs in a fixed delay");
	 }

	
	
	
	
}
