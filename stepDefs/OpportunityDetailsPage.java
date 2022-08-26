package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;

public class OpportunityDetailsPage extends ProjectSpecificMethods {	
	@Then("Opportunity is created as (.*)$")
	public void opportunityVerification(String oppName) {				//Verify the opportunity is created
		WebElement oppNameLabel = driver.findElement(By.xpath("(//div[@class='entityNameTitle slds-line-height--reset']/following::lightning-formatted-text)[1]"));
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(oppNameLabel.getText(), oppName);
	}
}
