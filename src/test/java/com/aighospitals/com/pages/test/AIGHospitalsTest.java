package com.aighospitals.com.pages.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aighospitals.com.pages.AIGHospitalsPage;
import com.selenium.actions.qa.utils.SeleniumActions;

public class AIGHospitalsTest extends SeleniumActions {

	AIGHospitalsPage aigHome;
	
	public AIGHospitalsTest() {
		super();
	}
	
	@BeforeTest
	public void initMethod() {
    	Browsers("https://www.aighospitals.com/");
    	aigHome = new AIGHospitalsPage();
	}
	
	
	@Test
	public void verifyOverview() {
		aigHome.navigateToOverview();
	}
	
}
