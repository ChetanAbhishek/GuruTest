/*
 * Total Ten scenarios
 * Scenario 1-3 group effort, Scenario 4-7 Chetan , Scenario 8-10 Srishti
 * Regression test case , positive test case and negative test case
 * 
 * */


package outline;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
		 public static WebDriver driver;
		 
		 //scenario one
		 
		 @Given("^User is on Home Page$")
		 public void user_is_on_Home_Page() throws Throwable {
			 System.setProperty("webdriver.chrome.driver", "E:\\WorkOffice\\chrome_driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.get("http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
		     driver.manage().window().maximize();
		 }
		 
		 @When("^User clicks button$")
		 public void user_clicks_insurance_project() throws Throwable {
			 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[3]/a")).click();
		 
		 }
		 
		 @Then("^Message displayed Login Successfully$")
		 public void message_displayed_Login_Successfully() throws Throwable {
		 System.out.println("Login Successfully");
		 }
		 
		 
		 //Scenario Two
	
		 @Given("^User is on Insurance Project Page$")
		 public void userOnInsurancePage() throws Throwable{
			 System.out.println("User on Insurance Project page success");
			 }
		 
		 @When("^the user enter \"([^\"]*)\" and \"([^\"]*)\" and login$")
		 public void loginOnInsurancePage(String username,String password) throws Throwable{
			
			driver.findElement(By.id("email")).sendKeys(username);
			 driver.findElement(By.id("password")).sendKeys(password);
			 driver.findElement(By.name("submit")).click();
			 }
		 @Then("^User login succesfully$")
		 public void successfulLogin() throws Throwable{
			 System.out.println("User login success");
			 }
		 
		 //Scenario Three
		 
		 @Given("^User has successfully signed in$")
		 public void userLoggedOnInsurancePage() throws Throwable{
			 System.out.println("User logged in Insurance Project page success");
			 }
		 @When("^User clicks logout button$")
		 public void user_clicks_logout() throws Throwable {
			 driver.findElement(By.xpath("//html/body/div[3]/form/input")).click();
			 
		 }
		 @Then("^Message displayed Logout Successfully$")
		 public void userLoggedOutSuccess() throws Throwable{
			 System.out.println("User logged out from Insurance Project page success");
			 }
		 
		 //Scenario Four
		 @Given("^User is on home page$")
		 public void userOnHomePage() throws Throwable{
			 System.out.println("User On Home Page");
			 }
		 @When("^User click on agile project$")
		 public void userClicksOnAgileProject() throws Throwable {
			 driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[4]/a")).click();
			 
		 }
		 @Then("^Message displayed page opened Successfully$")
		 public void userClickOnAgileProjectS() throws Throwable{
			 System.out.println("User successfuly clicked on agile project");
			 
			 }
	
		 //Scenario Five

@Given("^User is on Agile Project Page$")
public void user_is_on_Agile_Project_Page() throws Throwable {
	System.out.println("User on Agile Project page success");
    
}
@When("^the user will enter \"([^\"]*)\" and \"([^\"]*)\" and login$")
public void the_user_will_enter_and_and_login(String userid, String pwd) throws Throwable {
	driver.findElement(By.name("uid")).sendKeys(userid);
	 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(pwd);
	 driver.findElement(By.name("btnLogin")).click();
    
}

@Then("^User login successful$")
public void user_login_successful() throws Throwable {
	System.out.println("User login success");
    
}

//Scenario Six

@Given("^User should click on mini statement$")
public void user_should_click_on_mini_statement() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  driver.findElement(By.linkText("Mini Statement")).click();
}

@When("^User should select an id$")
public void user_should_select_an_id() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Select drpminstat = new Select(driver.findElement(By.name("accountno")));
	drpminstat.selectByVisibleText("3308");
	driver.findElement(By.name("AccSubmit")).click();
}  

@Then("^Mini Statement page will display$")
public void mini_Statement_page_will_display() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Mini statement displayed successfuly");
    
}

//Scenario Seven


@Given("^User should click logout button$")
public void user_should_click_logout_button() throws Throwable {
    driver.findElement(By.linkText("Log out")).click();
    
}

@When("^User should handle alert box$")
public void user_should_handle_alert_box() throws Throwable {
	 Alert alert = driver.switchTo().alert();		
		
     // Capturing alert message.    
     String alertMessage= driver.switchTo().alert().getText();		
     		
     // Displaying alert message		
     System.out.println(alertMessage);	
     alert.accept();
    
}

@Then("^user should be able to logout$")
public void user_should_be_able_to_logout() throws Throwable {
    System.out.println("User should move to home page successfully");
    
}

//Scenario Eight (also used in ten)
@Given("^User is on Bank Project Page$")
public void user_is_on_Bank_Project_Page() throws Throwable{
	driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a")).click();
	 System.out.println("User on Bank Project page success");
	 }
@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and login$")
public void user_enters_and_and_login(String usename, String pasword) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Enter credentials");
		driver.findElement(By.name("uid")).sendKeys(usename);
		 driver.findElement(By.name("password")).sendKeys(pasword);
		 driver.findElement(By.name("btnLogin")).click();
   
}
@Then("^Message displayed that user is not valid$")
public void message_displayed_that_user_is_not_valid() throws Throwable{
	 System.out.println("Message displayed that user is not valid");
	 Thread.sleep(2000);
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	
	 }
//Scenario Nine
@Given("^User entered \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_entered_and(String ue, String pd) throws Throwable {
	driver.findElement(By.name("uid")).sendKeys(ue);
	 driver.findElement(By.name("password")).sendKeys(pd);
    
}

@When("^User clicks reset button$")
public void user_clicks_reset_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("btnReset")).click();
    
    
}

@Then("^User name and password is reset$")
public void user_name_and_password_is_reset() throws Throwable {
	Thread.sleep(2000);
	 System.out.println("Password is reset");
    
}

//Scenario Ten
@Then("^User has logged in$")
public void user_has_logged_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
    driver.close();
}


}
