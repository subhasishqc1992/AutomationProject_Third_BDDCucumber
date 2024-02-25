package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common_Elements {
	
	WebDriver driver;
	
	public Common_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement UserName;
	
	@FindBy(id = "password" )
	public WebElement PassWord;
	
	@FindBy(id = "login-button")
	public WebElement LoginBtn;
}
