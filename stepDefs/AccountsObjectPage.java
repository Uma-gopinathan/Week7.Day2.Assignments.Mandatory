package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class AccountsObjectPage extends ProjectSpecificMethods{
	@And("Click on New button in the Accounts Object page")
	public void clickNewAccountCreationBtn() throws InterruptedException {					//Click new button to create a new account object
		driver.findElement(By.xpath("//a[@title='New']")).click();
		Thread.sleep(2000);
		System.out.println("Clicked the new button from the Accounts object page");
		
		//verify if New Account page is displayed
		WebElement ele = driver.findElement(By.xpath("(//h2[contains(@class,'title')])[6]"));
		if(ele.getText().equals("New Account")) {
			System.out.println("New Account Creation pop-up is opened");
		}
		else {
			System.out.println("New Account Creation pop-up is not opened");
		}
	}

}
