package tt.sundayVision.Runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/featureFiles" }, glue = { "src/test/java/tt.ebay.StepDef", "src/test/java/tt.utilities" }, 
				tags = {"@tarek"}, 
				plugin = { "Pretty", "html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
				"com.cucumber,listener.ExtentCucumberFormatter:target/cucumber-reports.html"}, 
				monochrome = true)

public class ebayRunner extends AbstractTestNGCucumberTests {

	@AfterClass // import from TestNG
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/config.xml"));

	}
}