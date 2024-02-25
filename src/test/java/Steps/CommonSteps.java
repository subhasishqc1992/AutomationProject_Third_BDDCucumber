package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Actions.Common_Actions;
import Actions.SauceDemo_AllItems_Actions;
import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.thucydides.core.model.TakeScreenshots;

public class CommonSteps {
	
	private WebDriver driver;
	Common_Actions CActions;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Eclipse_Workspace_New\\BDDCucumber\\Drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(io.cucumber.java.Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(scr, "image/png", scenario.getName());
		}
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
