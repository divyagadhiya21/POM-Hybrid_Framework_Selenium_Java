package com.demo.seleniumeasy.qa.pages.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.seleniumeasy.qa.pages.BasicCheckboxDemoPage;
import com.selenium.actions.qa.utils.SeleniumActions;

public class BasicCheckboxDemoPageTest extends SeleniumActions {
	
	BasicCheckboxDemoPage bcd;
	
	public BasicCheckboxDemoPageTest() {
		super();
	}
	
	 @BeforeTest
		public void initMethod() {
	    	Browsers("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
	    	bcd = new BasicCheckboxDemoPage();
		}
	 
	 @Test
	 public void verifyCheckBox() {
	
		 for(int indexVal=0;indexVal<bcd.optionsCount();indexVal++) {
			 if(indexVal<bcd.optionsCount()-1) {
				 Assert.assertEquals(bcd.clickCheckAllBtn(indexVal), "Check All");
				 System.out.print("indexVal");
			 }else {
				 Assert.assertEquals(bcd.clickCheckAllBtn(indexVal), "Uncheck All");
				 System.out.print("indexVal");
			 }
		 }
	 }
	 
		@AfterClass
		public void closeBrowserInstance() {
			closeBrowser();
		}

}
