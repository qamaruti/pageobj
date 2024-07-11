package com.prjct.qa.testcases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prjct.qa.base.TestBase;
import com.prjct.qa.pages.HomePage;
import com.prjct.qa.pages.LoginPage;

public class HomepageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {

		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(enabled=true)
	public void clickVerifyFavoritesPageTitile() {
		homePage.clickFavoritiesMenu();
		String title1 = homePage.VerifyFavoritesPageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assert.assertEquals(title1, "FAVORITES");
		System.out.println("Verified the label "+title1);
	}

	@Test(enabled=true)
	public void verifyOutboundPageTitle() {
		homePage.clickOutboundMenu();
		String title2 = homePage.VerifyOutboundPageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertEquals(title2, "OUTBOUND");
		System.out.println("Verified the label "+title2);

	}
	@Test(enabled=true)
	public void verifyInboundPageTitle() {
		homePage.clickInboundMenu();
		String title3 = homePage.VerifyInboundPageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assert.assertEquals(title3, "INBOUND");
		System.out.println("Verified the label "+title3);

	}
	@Test(enabled=true)
	public void verifyUsersandGroupsPageTitle() {
		homePage.clickUsersandGroupsMenu();
		String title4 = homePage.VerifyUsersandGroupsPageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assert.assertEquals(title4, "USERS AND GROUPS");
		System.out.println("Verified the label "+title4);

	}
	@Test(enabled=true)
	public void verifyInventoryMaintainancePageTitle() {
		homePage.clickInventoryMaintainanceMenu();
		String title5 = homePage.VerifyInventoryMaintainancePageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assert.assertEquals(title5, "INVENTORY MAINTENANCE");
		System.out.println("Verified the label "+title5);

	}
	@Test(enabled=true)
	public void verifyUtilitiesPageTitle() {
		homePage.clickUtilitiesMenu();
		String title6 = homePage.VerifyUtilitiesPageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assert.assertEquals(title6, "UTILITIES");
		System.out.println("Verified the label "+title6);

	}
	@Test(enabled=true)
	public void verifySelfserviceReportingPageTitle() {
		homePage.clickSelfserviceReportingMenu();
		String title7 = homePage.VerifySelfserviceReportingPageTitile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertEquals(title7, "SELF SERVICE REPORTING");
		System.out.println("Verified the label "+title7);

	}

	@AfterMethod
	public void teardown() {
		//driver.close();
	driver.quit();
	}

}
