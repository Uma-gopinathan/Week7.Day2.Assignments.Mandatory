package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.And;

public class NewAccountCreation extends ProjectSpecificMethods{
	@And("Type the account name in the new account creation page as (.*)$")
	public void enterAccountNameInNewAccountCreationPage(String accName) {		 			//Enter the account name
		driver.findElement(By.xpath("//input[contains(@name,'Name')]")).sendKeys(accName);
		System.out.println("Entered the account name as: "+accName);	
	}
	@And("Select the ownership in the new account creation page as (.*)$")
	public void selectOwnerShip(String ownership) {									//Select the ownership
		Actions builder = new Actions(driver);
		WebElement own=driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')])[3]"));
		builder.scrollToElement(own).perform();
		
		js.executeScript("arguments[0].click();", own);
		driver.findElement(By.xpath("(//span[text()='Public'])[1]")).click();

	}
	@And("click the save button in the new account creation page")
	public void clickSaveInAccountCreationPage() throws InterruptedException {					//Click save in new account create page
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(1000);
		System.out.println("Clicked the Save button in the Account creation page");
	}
}