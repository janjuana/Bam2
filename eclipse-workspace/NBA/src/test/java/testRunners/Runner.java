package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features"}
,glue= {""}
,plugin={"pretty","html:test-output"}
,dryRun=true
,monochrome=true)
				
public class Runner {

}