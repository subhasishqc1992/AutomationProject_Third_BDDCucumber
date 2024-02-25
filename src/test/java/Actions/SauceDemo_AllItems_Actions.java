package Actions;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Elements.SauceDemo_AllItems_Elements;
import Steps.CommonSteps;

public class SauceDemo_AllItems_Actions {
	
	private  WebDriver driver;
	SauceDemo_AllItems_Elements AllItems;
	
	public SauceDemo_AllItems_Actions(CommonSteps CSteps) {
		this.driver = CSteps.getDriver();
		AllItems = new SauceDemo_AllItems_Elements(driver);
	}
	
	public void AddToCart() {
		Iterator<WebElement> It = AllItems.AddCart.iterator();
		while(It.hasNext()) {
			It.next().click();
		}
		AllItems.ShoppingCart.click();
	}
	
	public void CheckOutDetails(String firstname, String lastname, String postalcode) {
		AllItems.CheckOutBtn.click();
		AllItems.FirstName.sendKeys(firstname);
		AllItems.LastName.sendKeys(lastname);
		AllItems.PostalCode.sendKeys(postalcode);
		AllItems.ContinueBtn.click();		
	}
	
	public void OrderDetails() {
		System.out.println(AllItems.OrderSummary.getText());
		AllItems.FinishBtn.click();
		AllItems.BactToHomeBtn.click();	
	}
}
