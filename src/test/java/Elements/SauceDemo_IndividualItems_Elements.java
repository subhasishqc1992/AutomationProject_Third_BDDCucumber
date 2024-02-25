package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemo_IndividualItems_Elements {
  WebDriver driver;
  
  public SauceDemo_IndividualItems_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  
  @FindBy(xpath = "//div[@class='inventory_item_label']/a/div")
  public List<WebElement> Individual;
  
  @FindBy(xpath = "//div[@class='inventory_details_price']")
  public WebElement ItemPrice;
  
  @FindBy(xpath = "//button[text()='Add to cart']")
  public WebElement AddToCart;
  
  @FindBy(id = "back-to-products")
  public WebElement BackToProducts;
  
  @FindBy(id = "react-burger-menu-btn")
  public WebElement BurgerMenu;
  
  @FindBy(id = "logout_sidebar_link")
  public WebElement LogoutSidebar;
}
