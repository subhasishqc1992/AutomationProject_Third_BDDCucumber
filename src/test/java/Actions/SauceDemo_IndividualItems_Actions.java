package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Elements.SauceDemo_AllItems_Elements;
import Elements.SauceDemo_IndividualItems_Elements;
import Steps.CommonSteps;
import io.cucumber.datatable.DataTable;

public class SauceDemo_IndividualItems_Actions {
	
	private  WebDriver driver;
	SauceDemo_IndividualItems_Elements IndividualItems;
	
	public SauceDemo_IndividualItems_Actions(CommonSteps CSteps) {
		this.driver = CSteps.getDriver();
		IndividualItems = new SauceDemo_IndividualItems_Elements(driver);
	}
	
	public void VisitIndividualItem(DataTable datatable) {
		List<WebElement> Item = IndividualItems.Individual;
		for(int i = 0; i<Item.size(); i++) {
			try {
				Item.get(i).click();
			} catch (StaleElementReferenceException e) {
				IndividualItems.Individual.get(i).click();
			}
			
			String price = IndividualItems.ItemPrice.getText();
			System.out.println("Price of "+ datatable.cell(i,0)+" is "+ price);
			IndividualItems.AddToCart.click();
			IndividualItems.BackToProducts.click();	
		}
	}
	
	public void LogoutFromHome() {
		IndividualItems.BurgerMenu.click();
		IndividualItems.LogoutSidebar.click();
	}

}
