package com.prjct.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prjct.qa.base.TestBase;
import com.prjct.qa.pages.HomePage;
import com.prjct.qa.pages.LoginPage;

public class LoginpageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initilization();
		 loginpage=new LoginPage();
	}
	
	@Test(enabled=true)
	public void loginpagetitletest() {
		String title=loginpage.validateloginpageTitle();
		Assert.assertEquals(title, "Login - Exacta Portal");
	}
	@Test(enabled=true)
	public void crmlogotest() {
		boolean flag=loginpage.validatelogo();
		Assert.assertTrue(flag);
	}
	@Test(enabled=true)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
	//	driver.close();
		driver.quit();
	}
	
}
