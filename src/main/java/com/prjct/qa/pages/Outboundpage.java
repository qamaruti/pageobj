package com.prjct.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prjct.qa.base.TestBase;

public class Outboundpage extends TestBase {
	
	@FindBy(xpath = "//a[@data-exacta-tab-text='Pick Orders']")
	WebElement Pick_Orders;
	@FindBy(xpath = "//a[@data-exacta-menu-title='View All Pick Orders']")
	WebElement View_All_Pick_Orders_Title;
	
	
	public Outboundpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verify_View_All_Pick_Orders_Utility() {
		 View_All_Pick_Orders_Title.click();
	}
	public String click_View_All_Pick_Orders() {
		return Pick_Orders.getText();
	}
}
