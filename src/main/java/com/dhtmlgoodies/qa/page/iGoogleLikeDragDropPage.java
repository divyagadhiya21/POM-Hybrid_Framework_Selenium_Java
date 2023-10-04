package com.dhtmlgoodies.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.actions.qa.utils.SeleniumActions;

public class iGoogleLikeDragDropPage extends SeleniumActions {
	
	@FindBy(xpath="//h1[contains(text(),'Block 3')]")
	WebElement block3;
	
	@FindBy(xpath="//h1[contains(text(),'Block 2')]")
	WebElement block2;

	@FindBy(xpath="//h1[contains(text(),'Block 1')]")
	WebElement block1;
	
	@FindBy(xpath="//h1[contains(text(),'Block 4')]")
	WebElement block4;
	
	
	public iGoogleLikeDragDropPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void DragBlock3ToBlock2() {
		dragDrop(block3, block2);
	}
	
	public void DragBlock1ToBlock4() {
		waitTime(3000);
		dragDrop(block1, block4);
	}
}
