package parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageSteps {
	 LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	 private static String title;
	 

@Given("user is on login page")
public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
	 title=loginpage.getLoginPageTitle();
	 System.out.println("loginpagetitle:" + title );
    
}

@Then("page title should be {string}")
public void page_title_should_be(String expectedTitle) {
	title= loginpage.getLoginPageTitle();
      Assert.assertTrue(title.contains(expectedTitle));
	 
	
    
}

@Then("forgot your password link should be displayed")
public void forgot_your_password_link_should_be_displayed() {
    Assert.assertTrue(loginpage.isForgotPwdLinkExist());
}

@When("user enters username {string}")
public void user_enters_username(String username) {
	loginpage.enterUsername(username);
    
}

@When("user enters password {string}")
public void user_enters_password(String password) {
	loginpage.enterPassword(password);
    
}


@When("user clicks on Login button")
public void user_clicks_on_login_button() {
	loginpage.clickOnlogin();
    
}

/*@Then("user gets the title of the home page")
public void user_gets_the_title_of_the_home_page() {
	String title=loginpage.getLoginPageTitle();
	System.out.println("Title:" + title);
	
    
}*/


}
