package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class DashboardObjectPage extends ProjectSpecificMethods{
	@When("Click on the New Dashboard option")
	public void clickNewAccountCreationBtn() throws InterruptedException {					//Click new button to create a new account object
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		Thread.sleep(5000);
		System.out.println("Clicked the New Dashboard button from the Dashboard object page");

		//verify if New Dashboard page is displayed
		WebElement dashFrameObj=driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(dashFrameObj);
		WebElement ele = driver.findElement(By.xpath("//h2[@class='slds-text-heading_medium']"));
		if(ele.getText().equals("New Dashboard")) {
			System.out.println("New Dashboard Creation pop-up is opened");
		}
		else {
			System.out.println("New Dashboard Creation pop-up is not opened");
		}
		driver.switchTo().defaultContent();
	}
}