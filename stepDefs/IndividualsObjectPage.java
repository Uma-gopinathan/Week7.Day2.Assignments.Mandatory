package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class IndividualsObjectPage extends ProjectSpecificMethods{
	//lightning-icon[contains(@class,'favorites')]
	@When("Click on the Dropdown icon in the Individuals tab")
	public void clickIndividualsDropDown() {
		WebElement arrow = driver.findElement(By.xpath("((//span[text()='Individuals'])[1]/following::a)[1]"));
		js.executeScript("arguments[0].click();", arrow);
	}
	@And("Click on New Individual from the Individuals Object page") 
	public void clickNewIndividualLink() throws InterruptedException {
		WebElement newIndividual=driver.findElement(By.xpath("//span[text()='New Individual']"));
		js.executeScript("arguments[0].click();", newIndividual);
		Thread.sleep(2000);
	}
}