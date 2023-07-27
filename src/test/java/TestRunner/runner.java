package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/Login.html","json:target/cucumber.json"}, //reporting purpose
			monochrome=false,  //console output color
			tags = "", //tags from feature file
			features = {"src/test/resources/featureFiles"}, //location of feature files
			glue= {"stepDefinition"}) //location of step definition files
	

		public class runner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }

	


}
