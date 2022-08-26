package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class SalesConsoleHomePage extends ProjectSpecificMethods{	
	@Given("Click the {string} tab from the Sales Console home page")
	public void clickOpportunitiesTab(String tabName) throws InterruptedException {
		if(driver.findElement(By.xpath("(//span[@class='slds-truncate'])[1]")).getText().equals("Sales")) {
			System.out.println("Sales Console is opened");
		}
		else {
			System.out.println("Sales Console is not opened");
		}
		//Click the tab from Sales console
		Thread.sleep(2000);
		String XPath="//span[text()='"+tabName+"']";
		WebElement ele = driver.findElement(By.xpath(XPath));		
		js.executeScript("arguments[0].click();", ele);					//Click on tab 
		System.out.println("Clicked the : "+tabName+" object tab from Sales Console");
		Thread.sleep(2000);
	}
}
