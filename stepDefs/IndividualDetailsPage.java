package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;

public class IndividualDetailsPage extends ProjectSpecificMethods{
	@Then("Verify if the new individual is displayed in the Individual page as (.*)$")
	public void verifyNewIndividual(String lastName) {				//Verify the new Individual is created
		WebElement individualLabel=driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]"));
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(individualLabel.getText(), lastName);
	}

}
