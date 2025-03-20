package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Features",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-reports/reports.html",
				"json:target/cucumber-reports/reports.json",
				"junit:target/cucumber-reports/reports.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class HealthCare_Run extends AbstractTestNGCucumberTests {
	
}
