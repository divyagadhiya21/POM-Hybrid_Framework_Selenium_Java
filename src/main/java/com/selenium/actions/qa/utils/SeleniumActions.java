package com.selenium.actions.qa.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.main.TestMain;

public class SeleniumActions extends TestMain{
	
	public void enterData(WebElement ele, String ValueToEnter) {
		ele.sendKeys(ValueToEnter);
	}
	
	
	public void selectFromDropDown(WebElement ele, String ValueToSelect) {
		Select val = new Select(ele);
		val.selectByVisibleText(ValueToSelect);
	}
	
	
	public void clickButton(WebElement ele) {
		ele.click();
	}
	
	public String getAttribute(WebElement ele) {
		return ele.getAttribute("value");
	}
	
	public void dragDrop(WebElement eleToDragFrom, WebElement eleToDragTo) {
		Actions act = new Actions(driver);
		act.dragAndDrop(eleToDragFrom, eleToDragTo);
		act.perform();
	}
	
	public void mouseHover(WebElement eleToMoveTo) {
		Actions act = new Actions(driver);
		act.moveToElement(eleToMoveTo);
		act.perform();
	}
	
	public void waitTime(int timeInMilliSeconds) {
		try {
			Thread.sleep(timeInMilliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
