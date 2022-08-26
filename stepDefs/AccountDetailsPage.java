package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;

public class AccountDetailsPage extends ProjectSpecificMethods{
	@Then("the account name is displayed in the Account Details page as (.*)$")
	public void verifyAccountName(String accName) {							//Verify the account is created and displayed
		WebElement accNameLabel = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']"));
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(accNameLabel.getText(), accName);			//Soft assert
	}
	

}
