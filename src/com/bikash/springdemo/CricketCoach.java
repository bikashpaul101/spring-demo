package com.bikash.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	//create no-arg constructor
	CricketCoach(){
		System.out.println("Inside CricketCoach constructor");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside CricketCoach setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}	

}
