package luma.ny.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//plugin= {"pretty", "json:target/cucumber.json"},
		features= {".//Features/"},
		glue={"luma.ny.stepdef","luma.ny.hooks"},
		tags="@smoke"
		//dryRun=true
		
			
		
		
		
		)
public class MyRunnerClass extends AbstractTestNGCucumberTests {

}
