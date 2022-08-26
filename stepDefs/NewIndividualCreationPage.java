package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class NewIndividualCreationPage extends ProjectSpecificMethods{
	@And("Enter the Last Name as (.*)$")
	public void newIndividualCreation(String lastName) throws InterruptedException {			//Enter the last name
		driver.findElement(By.xpath("//input[contains(@class,'lastName')]")).sendKeys(lastName);
		Thread.sleep(1000);
		System.out.println("Entered the last name as: "+lastName);
	}
	@And("Click save in the New Individuals creation page")										//Click Save
	public void clickSaveInNewIndividualCreationPage() {
		driver.findElement(By.xpath("//button[@title='Save']")).click();
	}

}
