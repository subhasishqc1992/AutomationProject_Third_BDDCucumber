package Steps;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Actions.Common_Actions;
import Actions.SauceDemo_AllItems_Actions;
import groovy.time.Duration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo_AllItems {
	
	Common_Actions C_actions;
	SauceDemo_AllItems_Actions AllItems;
	
	public SauceDemo_AllItems(Common_Actions ca, SauceDemo_AllItems_Actions ai) {
		this.C_actions = ca;
		this.AllItems = ai;
	}

	@Given("Login to Sauce Demo page using {string} and {string}")
	public void login_to_Sauce_Demo_page(String string1, String string2) {
	    C_actions.OpenUrl("https://www.saucedemo.com/");
	    C_actions.Login(string1, string2);
	}

	@When("Add all items to cart")
	public void add_all_items_to_cart() {
		AllItems.AddToCart();
	}
	
	@When("Provide all details and Checkout i.e. {string}, {string} and {string}")
	public void provide_all_details_and_Checkout(String string1, String string2, String string3) {
	    AllItems.CheckOutDetails(string1, string2, string3);
	}
	
	@Then("Take the order details")
	public void take_the_order_details() {
	    AllItems.OrderDetails();
	}
	
}
