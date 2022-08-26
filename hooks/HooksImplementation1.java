package hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import stepDefs.ProjectSpecificMethods;

public class HooksImplementation1 extends ProjectSpecificMethods {
	@BeforeStep  //use this annotation to execute the code below before every step in the test
	public void beforeStep() {
		System.out.println("This is before starting each step in the testcase");
	}
	@AfterStep  //use this cucumber annotation to execute the code below after every step in the test
	public void takeSnapShot() throws IOException {
		System.out.println("This is after every step");
		File source=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("snap-"+i+".png");
		FileUtils.copyFile(source, dest);
		i++;  //static variable from ProjectSpecificMethods class
	}
	public static void beforeSuite() {}
	public static void afterSuite() {
		driver.close();
	}

}
