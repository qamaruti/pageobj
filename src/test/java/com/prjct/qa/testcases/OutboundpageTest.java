package com.prjct.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prjct.qa.base.TestBase;
import com.prjct.qa.pages.HomePage;
import com.prjct.qa.pages.LoginPage;
import com.prjct.qa.pages.Outboundpage;

public class OutboundpageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	Outboundpage outboundpage;

	public OutboundpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {

		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(enabled=true)
	public void click_View_All_Pick_Orders() {
		outboundpage.verify_View_All_Pick_Orders_Utility();
		String title7 = outboundpage.click_View_All_Pick_Orders();
	
		Assert.assertEquals(title7, "View ALL Pick Orders");
		System.out.println("Verified the label " + title7);
	}

	@AfterMethod
	public void teardown() {
		// driver.close();
		driver.quit();
	}
}
