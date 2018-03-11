package com.bikash.springdemo;

public class BaseballCoach implements Coach{
	
	//private field for dependency
	private FortuneService fortuneService;
	
	//constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes in batting practise";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService
		return fortuneService.getFortune();
	}
}
