package com.bikash.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive the beans from spring container
		Coach theCoach=context.getBean("myCoachB",Coach.class);
		//call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
		//call new fortune methods
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
