package stepDefs;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

//This class is a common class for intialising driver and opening the browser
public class ProjectSpecificMethods extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;    //static as it is used by multiple classes
	public static int i=1;
	JavascriptExecutor js= (JavascriptExecutor)driver;
	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		//Handling the browser notification
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");			
		driver=new ChromeDriver(options);		//launch the browser -chrome
		driver.get("https://login.salesforce.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
