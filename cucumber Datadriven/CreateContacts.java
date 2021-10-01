package StepDefinitioin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContacts {

	WebDriver driver;
	
	@Given("^user will be on login page$")
	public void user_will_be_on_login_page()  {
	   System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\AutomationTest\\Cucumber-Automation\\Library\\drivers\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("http://localhost:82/login.do;jsessionid=b72xffpqv8ju");
	}
	
	
	@When("^title of login page$")
	public void title_of_login_page()  {
	   String title=driver.getTitle();
	   System.out.println(title);
	}
	
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password)  {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
	    
	}
	
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	   driver.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
	}
	
	@Then("^user minimize the page$")
	public void user_minimize_the_page(){
		driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	   
	}
	
	@Then("^user click on Users$")
	public void user_click_on_Users()  {
	    driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[5]/a")).click();
	}
	
	@Then("^user clicks on  Add user$")
	public void user_clicks_on_Add_user()  {
	   driver.findElement(By.xpath("//*[@id=\'createUserDiv']/div")).click();
	}
	
	@Then("^user enter user \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_user_and_and_and_and_and(String firstname, String lastname, String email, String usernamedetails, String userpassword, String retypepassword)  {
		driver.findElement(By.id("userDataLightBox_firstNameField")).clear();
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(firstname);
		driver.findElement(By.id("userDataLightBox_lastNameField")).clear();
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lastname);
		driver.findElement(By.id("userDataLightBox_emailField")).clear();
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
		driver.findElement(By.id("userDataLightBox_usernameField")).clear();
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(usernamedetails);
		driver.findElement(By.id("userDataLightBox_passwordField")).clear();
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(userpassword);
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(retypepassword);
	   
	}
	
	@Then("^click on ctreate user$")
	public void click_on_ctreate_user()  {
	    driver.findElement(By.id("userDataLightBox_commitBtn")).click();
	}
	
	@Then("^click on logout$")
	public void click_on_logout()  {
	    driver.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
	}
	@Then("^close$")
	public void close()  {
	    driver.close();
	}


	
	


}
