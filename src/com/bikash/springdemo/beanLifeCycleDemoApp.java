package com.bikash.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoachB",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
