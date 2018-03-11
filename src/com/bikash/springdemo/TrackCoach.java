package com.bikash.springdemo;

public class TrackCoach implements Coach {
	
	//private field for dependency
	private String name;
	
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private FortuneService fortuneService;
	
	//constructor for dependency injection	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//init-method
	public void initMethod() {
		System.out.println("Init method called");
	}
	
	//destroy-method
	public void destroyMethod() {
		System.out.println("Destroy method called");
	}

}
