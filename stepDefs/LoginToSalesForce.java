package stepDefs;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginToSalesForce extends ProjectSpecificMethods{	
	@Given("Type the username as {string}")						//Enter the username
	public void typeUsername(String username) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(username);
		//driver.findElement(By.xpath("//span[@id='idcard-identity']")).sendKeys(username);
	}
	@And("Type the password as {string}")						//Enter the password
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		//driver.findElement(By.xpath("//span[@id='password']")).sendKeys(password);
	}
	@When("Click on the Log In button")				//Click login button
	public void clickLogInButton() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		//driver.findElement(By.xpath("//span[@id='Login']")).click();
		Thread.sleep(1000);
	}
}
