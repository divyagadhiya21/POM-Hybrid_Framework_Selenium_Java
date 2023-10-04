package com.demo.seleniumeasy.qa.pages.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import com.demo.seleniumeasy.qa.pages.InputFormDemoPage;
import com.selenium.actions.qa.utils.SeleniumActions;

public class InputFormDemoPageTest extends SeleniumActions {
	
	InputFormDemoPage ifd;

	public InputFormDemoPageTest() {
		super();
	}
	
    @BeforeTest
	public void initMethod() {
    	Browsers("https://demo.seleniumeasy.com/input-form-demo.html");
		ifd = new InputFormDemoPage();
	}
	

    @Test
	public void verifyInputFormDemo() {
		ifd.inputFormValidation("Divya", "Gadhiya", "test1@gmail.com", "4373233333", "Address test", "Toronto", "Alaska", "5000", "www.google.com", "This is a Test Form for automation testing");
		}
	
    

	@AfterClass
	public void closeBrowserInstance() {
		closeBrowser();
	}
}
