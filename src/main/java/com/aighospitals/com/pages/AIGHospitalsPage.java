package com.aighospitals.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.actions.qa.utils.SeleniumActions;

public class AIGHospitalsPage extends SeleniumActions{ 
	//This line declares the class AIGHospitalsPage and extends the SeleniumActions class. 
	//It means that the AIGHospitalsPage class inherits methods and properties from the SeleniumActions class.
	
	
	//	@FindBy(xpath="//li[@class='listshow dropdown deskshow']//span[contains(text(),'About us')]")
	//This line uses the FindBy annotation to locate the aboutUs web element on the page. 
	//The xpath attribute specifies the XPath expression used to find the element.
	
	//WebElement aboutUs;
	//This line declares the aboutUs variable of type WebElement, which will hold the reference to 
	//the web element located by the @FindBy annotation.
	
	
	@FindBy(xpath="//li[@class='listshow dropdown deskshow']//span[contains(text(),'About us')]")
	WebElement aboutUs;
	
	
	@FindBy(xpath="//div[@class='row']//a[@class='nav-link'][normalize-space()='Overview']")
	WebElement overview;
	
	public AIGHospitalsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
//public AIGHospitalsPage() {		
//This is a constructor for the AIGHospitalsPage class. It is used to initialize the PageFactory 
//and the web elements defined in the class.

//PageFactory.initElements(driver, this);: This line initializes the web elements defined in the 
//class. It binds the web elements to the corresponding variables (aboutUs and overview) using the driver object.
	
	
	public void navigateToOverview() {
		waitTime(3000);
		mouseHover(aboutUs);
		waitTime(3000);
		clickButton(overview);
	}
	
//This is a method named navigateToOverview(). 
//It is a custom method defined to perform a specific action, which is navigating to 
//the "Overview" page on the AIG Hospitals website.
	
//waitTime(3000);: This line pauses the execution of the script for 3000 milliseconds (3 seconds). 
//mouseHover(aboutUs);: This line performs a mouse hover action on the aboutUs web element. 
//Mouse hovering means moving the mouse pointer over the element without clicking it.

//clickButton(overview);: This line clicks on the overview web element. 
//The clickButton() method defined in the SeleniumActions class to perform a click action on a web element.

}
