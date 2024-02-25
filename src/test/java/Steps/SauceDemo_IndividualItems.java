package Steps;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Actions.Common_Actions;
import Actions.SauceDemo_IndividualItems_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo_IndividualItems {
	
	SauceDemo_IndividualItems_Actions IndividualActions;
	Common_Actions CActions;
	
	public SauceDemo_IndividualItems(Common_Actions CActions, SauceDemo_IndividualItems_Actions IndividualActions) {
		this.IndividualActions = IndividualActions;
		this.CActions = CActions;
	}
	
	@Given("Login to Sauce Demo page using username and password")
	public void login_to_Sauce_Demo_page(DataTable datatable) {
		CActions.OpenUrl("https://www.saucedemo.com/");
		CActions.Login(datatable.cell(0, 0), datatable.cell(0, 1));
	}
	
	@When("Visit to each item page and check the functionality")
	public void visit_to_each_item_page(DataTable datatable) {
		IndividualActions.VisitIndividualItem(datatable);
	}
	
	@Then("Log Out from the page")
	public void Log_Out_from_the_page() {
	    IndividualActions.LogoutFromHome();
	}

}
