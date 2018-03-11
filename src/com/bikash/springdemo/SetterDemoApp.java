package com.bikash.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach cricketCoach=context.getBean("myCoachC",CricketCoach.class);
		
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getEmailAddress());
		
		System.out.println(cricketCoach.getTeamName());
		
		context.close();
	}

}
