package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class AppsViewAllPage extends ProjectSpecificMethods {
	@And("Click the app name as {string} from the View All Apps page")									 //Click the app name link from View All screen
	public void clickSalesConsoleLink(String appName) throws InterruptedException {
		String XPath="//p[text()='"+appName+"']";
		//driver.findElement(By.xpath(XPath)).click();
		WebElement ele=driver.findElement(By.xpath(XPath));
		js.executeScript("arguments[0].click();", ele);
		Thread.sleep(10000);
		System.out.println("Clicked the "+ appName+" link from App Launcher to open the Console");
	}
}
