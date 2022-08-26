package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Then;

public class DashboardsPage extends ProjectSpecificMethods{
	@Then("Verify Dashboard is created and Dashboard name is displayed as (.*)$")
	public void verifyDashboard(String dashName) {
		WebElement dashFrameObj=driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(dashFrameObj);
		//Verify the dashboard name is same as entered in new dashboard creation page
		WebElement dashNameObj = driver.findElement(By.xpath("//span[@class='slds-form-element__static slds-grid slds-grid_align-spread']"));
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(dashNameObj.getText(), dashName);			//Soft assert
		
		//Verify Dashboard is created		
		String cssValueColor = driver.findElement(By.xpath("//div[@class='grid-layout']")).getCssValue("background-color");
		System.out.println("The dashboard is created with style property as :" + cssValueColor);
		driver.switchTo().defaultContent();
	}
}
