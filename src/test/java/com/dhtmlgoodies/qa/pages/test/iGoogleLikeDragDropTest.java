package com.dhtmlgoodies.qa.pages.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dhtmlgoodies.qa.page.iGoogleLikeDragDropPage;
import com.selenium.actions.qa.utils.SeleniumActions;

public class iGoogleLikeDragDropTest extends SeleniumActions {
	
	iGoogleLikeDragDropPage dd;
	
	public iGoogleLikeDragDropTest() {
		super();
	}
	
	@BeforeTest
	public void initMethod() {
    	Browsers("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		dd = new iGoogleLikeDragDropPage();
	}
	
	@Test
	public void verifyDragDrop1() {
		dd.DragBlock3ToBlock2();

	}
	
	@Test
	public void verifyDragDrop2() {
		dd.DragBlock1ToBlock4();

	}
	
	
}
