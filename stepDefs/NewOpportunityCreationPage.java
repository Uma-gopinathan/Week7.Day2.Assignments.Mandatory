package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class NewOpportunityCreationPage extends ProjectSpecificMethods{
	@And("Enter Opportunity name as (.*)$")									//Enter Opportunity name
	public void enterOpportunityName(String oppName) {
		driver.findElement(By.xpath("(//label[text()='Opportunity Name']/following::input)[1]")).sendKeys(oppName);
		System.out.println("Entered the Opprtunity Name: "+oppName);					
	}

	@And("Enter the opportunity close date in the new Opportunity creation page as (.*)$")			//Enter the opportunity close date
	public void enterCloseDate(String closeDt) {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(closeDt);
	}

	@And("Select Stage in the new Opportunity creation page as (.*)$")				//Select the Stage
	public void selectOpportunity(String oppStage) {
		String startLetter = Character.toString(oppStage.charAt(0));				//obtaining the first letter from the stage and sendkeys
		WebElement stage=driver.findElement(By.xpath("//label[text()='Stage']/following::button[1]"));

		js.executeScript("arguments[0].click();", stage);
		driver.findElement(By.xpath("//label[text()='Stage']/following::button[1]")).sendKeys(startLetter);
		driver.findElement(By.xpath("//label[text()='Stage']/following::button[1]")).sendKeys(Keys.ENTER);
	}
	@And("Click Save in the new Opportunity creation page")			//Click Save
	public void clickSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(1000);
		System.out.println("Clicked the Save button in the Account creation page");
	}
	@Then("Verify the Alert message is displayed for Name and Stage as (.*)$")			//Verify error message when mandatory fields are not entered
	public void verifyMandatoryFieldReqErrorMsg(String msg) {
		List<WebElement> errorMsg = driver.findElements(By.xpath("//div[@class='slds-form-element__help']"));
		int noOfErrorEle=errorMsg.size();
		for(i=0;i<noOfErrorEle;i++){
			Assert.assertEquals(errorMsg.get(i).getText(), msg);		//Hard Assert
		}
		System.out.println("The error message is displayed for each field when the mandatory fields are not entered");
	}
}