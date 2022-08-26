package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;

@CucumberOptions(features = "src/test/java/features",glue = {"stepDefs","hooks"},
monochrome = true,
publish = true,
tags="@smoke")
public class RunHooksAndTags extends ProjectSpecificMethods {

}