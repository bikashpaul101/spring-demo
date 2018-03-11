package com.bikash.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoachB",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoachB",Coach.class);
		
//		TrackCoach tc=context.getBean("myCoachB",TrackCoach.class);
//		tc.setName("Bikash");
//		TrackCoach tcn=context.getBean("myCoachB",TrackCoach.class);
//		tcn.getName();
		//check if they are the same
		boolean result=(theCoach==alphaCoach);
		System.out.println(result);
		
		System.out.println("\nMemory locaion for theCoach :"+theCoach);
		System.out.println("\nMemory locaion for alphaCoach :"+alphaCoach);
		
		context.close();
	}

}
