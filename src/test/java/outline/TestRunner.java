package outline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src\\test\\features\\login.feature"
 ,glue={"outline"}
 ,tags= {"@NegativeTest,@RegressionTest,@SmokeTest"}
 )
 
public class TestRunner {

}
