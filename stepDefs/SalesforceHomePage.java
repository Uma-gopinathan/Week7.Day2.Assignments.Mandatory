package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SalesforceHomePage extends ProjectSpecificMethods{
	@And ("Click the Switch to Lightning link in home page")
	public void clickSwitchToLightningLink() {					//Click switch to lightning link
		driver.findElement(By.xpath("//a[@class='switch-to-lightning']")).click();
	}
	@Then("Verify the home page is displayed")					//Verify home page is displayed
	public void verifyHomePage() {		
		WebElement homeLabel = driver.findElement(By.xpath("//span[contains(@class,'breadcrumbDetail uiOutputText')]"));
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(homeLabel.getText(), "Home");
		System.out.println("Successfully logged in to salesforce");
	}
	@Given("Click on toggle menu button from the left corner")    //Click the App launcher
	public void clickAppLauncher() {
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		System.out.println("Clicked the APP Launcher");
	}
	@And("Click view All link")										 //Click the View All button
	public void clickViewAllLink() throws InterruptedException {                
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		System.out.println("Clicked the View All link");
		Thread.sleep(2000);
	}
}
