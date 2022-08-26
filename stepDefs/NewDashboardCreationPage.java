package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class NewDashboardCreationPage extends ProjectSpecificMethods {
	@And("Enter Name in the dashboard creation page as (.*)$")
	public void enterDashboardName(String dashName) {												//Enter dashboard name
		WebElement dashFrameObj=driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(dashFrameObj);
		driver.findElement(By.id("dashboardNameInput")).sendKeys(dashName);
		driver.switchTo().defaultContent();
		System.out.println("Entered the dahboard name in the New Dashboard creation page");
	}
	@And("Click on Create in the dashboard creation page")
	public void clickCreateInDashboardCreationPage() throws InterruptedException {			//Click Create
		WebElement dashFrameObj=driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(dashFrameObj);
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Clicked the Create button in the New Dashboard creation page");
		Thread.sleep(2000);
	}
}
