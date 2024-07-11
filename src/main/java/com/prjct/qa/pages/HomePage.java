package com.prjct.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prjct.qa.base.TestBase;

public class HomePage extends TestBase{

	
	    @FindBy(xpath= "//div[@class='main-menu-nav-icon icon-favorite']")
	    WebElement FavoritiesMenu;
	    @FindBy(xpath = "//a[@title='Favorites']")
	    WebElement FavoritiesPageTitile;
	    @FindBy(xpath= "//*[@id=\"mainMenuItem-2\"]/div/div[1]")
	    WebElement OutboundMenu;
	    @FindBy(xpath= "//a[@title='Outbound']")
	    WebElement OutboundPageTitile;
	    @FindBy(xpath = "//*[@id=\"mainMenuItem-3\"]")
	    WebElement InboundMenu;
	    @FindBy(xpath = "//*[@id=\"accordionSection-3\"]/div[1]/a")
	    WebElement InboundPageTitile;
	    @FindBy(xpath= "//*[@id=\"mainMenuItem-13\"]")
	    WebElement UsersandGroupsMenu;
	    @FindBy(xpath = "//*[@id=\"accordionSection-13\"]/div[1]/a")
	    WebElement UsersandGroupsPageTitile;
	    @FindBy(xpath = "//*[@id=\"mainMenuItem-20\"]")
	    WebElement InventoryMaintainanceMenu;
	    @FindBy(xpath = "//*[@id=\"accordionSection-20\"]/div[1]/a")
	    WebElement InventoryMaintainancePageTitile;
	    @FindBy(xpath = "//*[@id=\"mainMenuItem-27\"]")
	    WebElement ReportsMenu;
	    @FindBy(xpath = "//*[@id=\"accordionSection-27\"]/div[1]/a")
	    WebElement ReportsPageTitile;
	    @FindBy(xpath = "//*[@id=\"mainMenuItem-36\"]")
	    WebElement UtilitiesMenu;
	    @FindBy(xpath = "//*[@id=\"accordionSection-36\"]/div[1]/a")
	    WebElement UtilitiesPageTitile;
	    @FindBy(xpath = "//*[@id=\"mainMenuItem-109\"]")
	    WebElement SelfserviceReportingMenu;
	    @FindBy(xpath = "//*[@id=\"accordionSection-109\"]/div[1]/a")
	    WebElement SelfserviceReportingPageTitile;

	    
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
	    public void clickSelfserviceReportingMenu() {
	        SelfserviceReportingMenu.click();
	    }
	    public void clickUtilitiesMenu() {
	        UtilitiesMenu.click();
	    }
	    public void clickReportsMenu() {
	        ReportsMenu.click();
	    }
	    public void clickInventoryMaintainanceMenu() {
	        InventoryMaintainanceMenu.click();
	    }
	    public void clickUsersandGroupsMenu() {
	        UsersandGroupsMenu.click();
	    }
	    public void clickInboundMenu() {
	        InboundMenu.click();
	    }
	    public void clickOutboundMenu() {
	        OutboundMenu.click();
	    }
	    public void clickFavoritiesMenu() {
	        FavoritiesMenu.click();
	    }
	  public String VerifyFavoritesPageTitile() {
		  
	       return FavoritiesPageTitile.getText();	    
	    }
	    public String VerifyOutboundPageTitile() {
	        return OutboundPageTitile.getText();	        
	    }
	   public String VerifyInboundPageTitile() {
	        return InboundPageTitile.getText();	    
	    }
	   public String VerifyUsersandGroupsPageTitile() {
	      return UsersandGroupsPageTitile.getText();	     
	    }
	   public String VerifyInventoryMaintainancePageTitile() {
	      return InventoryMaintainancePageTitile.getText();	       
	    }
	    public String VerifyReportsPageTitile() {
	       return ReportsPageTitile.getText();	       
	    }
	    public String VerifyUtilitiesPageTitile() {
	        return UtilitiesPageTitile.getText();
	    }
	   public String VerifySelfserviceReportingPageTitile() {
	        return SelfserviceReportingPageTitile.getText();
	    }	
}
