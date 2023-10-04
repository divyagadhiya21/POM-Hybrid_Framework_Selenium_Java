package com.demo.seleniumeasy.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.actions.qa.utils.SeleniumActions;

public class InputFormDemoPage extends SeleniumActions {
	
	//Syntax of rel xpath
	//tagname[@attributename='attribute value']
	//tagname[contains(attributename, 'attributevalue']
	//tagname[text()='textvalue']
	
	
	
	@FindBy(name="first_name")
	WebElement fName;
	
	@FindBy(name="last_name")
	WebElement lName;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="zip")
	WebElement zip;
	
	@FindBy(name="website")
	WebElement website;
	
	//Do you have hosting? (Radio button option)
	@FindBy(xpath="//input[@value='yes']")
	WebElement yesBtn;
	
	@FindBy(name="comment")
	WebElement projDesc;
	
	//send (Button)
	@FindBy(xpath="//button[text()='Send ']")
	WebElement sendBtn;
	
	public InputFormDemoPage() {
		PageFactory.initElements(driver, this); 
		
		//-- For driver required to extend class
		//PageClass extends SeleniumActions
		//SeleniumActions extends TestMain
	}
	
	public void inputFormValidation(String firstName, String lastName, String mailId, String PhoneNumber, String addressDetails, String pCity, String pState, String pZip, String pWebsite, String pDes) {
		enterData(fName, firstName);
		enterData(lName, lastName);
		enterData(email, mailId);
		enterData(phone, PhoneNumber);
		enterData(address, addressDetails);
		enterData(city, pCity);
		selectFromDropDown(state, pState);
		enterData(zip, pZip);
		enterData(website, pWebsite);
		clickButton(yesBtn);
		enterData(projDesc, pDes);
		clickButton(sendBtn);
		
	}
	
}



