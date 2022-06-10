package com.blazeclan.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;
import com.blazeclan.qa.util.Base;
import com.blazeclan.qa.util.LoggerHelper;


public class LoginPage extends Base {

	// Object repository

	@FindBy(id = "small-searchterms") 
	public WebElement searchStoreTextField;
 
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//div[@class='page-title']")
	public WebElement searchPageTitle;
	
	Logger logger = LoggerHelper.getLogger(LoginPage.class);

	// Initializing the Page Objects
	public LoginPage() {
		logger.info("Initializing the page objects");
		PageFactory.initElements(driver, this);
	}	
}
