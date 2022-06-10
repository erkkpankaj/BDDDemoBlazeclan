package com.blazeclan.qa.setpsDefinition;

import java.io.IOException;
import org.testng.Assert;
import com.blazeclan.qa.pages.LoginPage;
import com.blazeclan.qa.util.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Serach extends Base {

	LoginPage loginPageObj;  

	@Given("User opens the browser")
	public void user_opens_the_browser() throws IOException {
		Base.initializeDriver();
		loginPageObj = new LoginPage();
	}

	@Then("User on homepage check the homepage title")
	public void user_on_homepage_check_the_homepage_title() {
		String homePageTitle = driver.getTitle();
		System.out.println("Home page title is ::: " + homePageTitle);
		Assert.assertEquals(homePageTitle, "nopCommerce demo store", "Page title mismatched");
	}

	@Then("Enter the search item in search store field")
	public void enter_the_search_item_in_search_store_field() throws InterruptedException {
		loginPageObj.searchStoreTextField.sendKeys("mobile");
		System.out.println("Enter the search item");
		Thread.sleep(3000);
	}

	@And("Click on the search button")
	public void click_on_the_search_button() {
		System.out.println("Clicking on search button");
		loginPageObj.submitButton.click();
	}

	@Then("Check for page title")
	public void check_for_page_title() throws InterruptedException {
		System.out.println("Checking for page title");
		String pageTtile = loginPageObj.searchPageTitle.getText();
		Assert.assertEquals("Search", pageTtile);
		Thread.sleep(3000);
	}

	@When("User enters search item {string} in search store filed")
	public void user_enters_search_item_in_search_store_filed(String item) {
		System.out.println("Enter the search item ::: " + item);
		loginPageObj.searchStoreTextField.sendKeys(item);
	}

	@Then("User search multiple items {string} in search store filed")
	public void user_search_multiple_items_in_search_store_filed(String string) {
		System.out.println("Enter the multiple search items ::: " + string);
		loginPageObj.searchStoreTextField.sendKeys(string);
	}

	@Before
	public void launchTheBrowser() {
		System.out.println("Browser is launched");
	}

	@After
	public void closeTheBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}
}
