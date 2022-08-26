package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class OpportunitiesObjectPage extends ProjectSpecificMethods{
	@And("Click on New button in the Opportunities object page")
	public void clickNewInOpportunitiesObjectPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='New']")).click();
		Thread.sleep(4000);
		System.out.println("Clicked the new button from the Opportunities object page");

		WebElement ele =driver.findElement(By.xpath("//h2[contains(@class,'heading')]"));
		if(ele.getText().equals("New Opportunity")) {
			System.out.println("New Opportunity Creation pop-up is opened");
		}
		else {
			System.out.println("New Opportunity Creation pop-up is not opened");
		}
	}
}