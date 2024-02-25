package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo_AllItems_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='pricebar']/button")
	public List<WebElement> AddCart;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	public WebElement ShoppingCart;
	
	@FindBy(id = "checkout")
	public WebElement CheckOutBtn;
	
	@FindBy(id = "first-name")
	public WebElement FirstName;
	
	@FindBy(id = "last-name")
	public WebElement LastName;
	
	@FindBy(id = "postal-code")
	public WebElement PostalCode;
	
	@FindBy(id = "continue")
	public WebElement ContinueBtn;
	
	@FindBy(xpath = "//div[@class='summary_info']")
	public WebElement OrderSummary;
	
	@FindBy(id = "finish")
	public WebElement FinishBtn;
	
	@FindBy(id = "back-to-products")
	public WebElement BactToHomeBtn;
	

	public SauceDemo_AllItems_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
