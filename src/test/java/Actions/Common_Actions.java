package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Elements.Common_Elements;
import Elements.SauceDemo_AllItems_Elements;
import Steps.CommonSteps;

public class Common_Actions {
	
	private WebDriver driver;
	Common_Elements CElements;
	
	public Common_Actions(CommonSteps CSteps) {
		this.driver = CSteps.getDriver();
		CElements = new Common_Elements(driver);
	}
	
	public void OpenUrl(String url) {
		driver.get(url);
	}
	
	public void Login(String username, String password) {
	    CElements.UserName.sendKeys(username);
	    CElements.PassWord.sendKeys(password);
	    CElements.LoginBtn.click();
	}
}
