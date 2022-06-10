package com.blazeclan.qa.stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class SearchSteps {

	WebDriver driver;
	@Given("User on Demo home page")
	public void user_on_amazon_home_page() {
		System.out.println("User on home page");
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
	}

	@When("User enters search item in search store filed")
	public void user_enters_search_item_in_search_store_filed() {
		System.out.println("Enter the search item");
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobile");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		System.out.println("Click on search button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Searched item should be displayed")
	public void searched_item_should_be_displayed() {
		System.out.println("Searched item should be displayed");
		String pageTtile = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
		Assert.assertEquals("Search", pageTtile);
	}
	
	@When("User enters search item {string} in search store filed")
	public void user_enters_search_item_in_search_store_filed(String item) {
		System.out.println("Searched item is mobile");
		driver.findElement(By.id("small-searchterms")).sendKeys(item);
	}

	@When("User enters search item {string} in search store filed1")
	public void user_enters_search_item_in_search_store_filed1(String SearchItem) {
		System.out.println("Searched item is mobile");
		driver.findElement(By.id("small-searchterms")).sendKeys(SearchItem);
	}

	@Before
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		System.out.println("Browser is launched");
	}

	@After
	@Then("User close the browser")
	public void user_close_the_browser() {
		System.out.println("Browser is closed");
	}

}
