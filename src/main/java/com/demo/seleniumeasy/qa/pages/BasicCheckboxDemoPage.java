package com.demo.seleniumeasy.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.actions.qa.utils.SeleniumActions;

public class BasicCheckboxDemoPage extends SeleniumActions{
	
	@FindBy(className="cb1-element")
	List<WebElement> allOptions;
	
	@FindBy(id="check1")
	WebElement checkAllBtn;
	
	public BasicCheckboxDemoPage() {
		PageFactory.initElements(driver, this);
	}

	
	public int optionsCount() {
		return allOptions.size();
		}
	
	public String clickCheckAllBtn(int elementToClickOn) {
		clickButton(allOptions.get(elementToClickOn));
		return getAttribute(checkAllBtn);
	}
}
