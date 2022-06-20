package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 private WebDriver driver;
	    //By locator
	  private By emailID=By.id("email");
	  private By password=By.id("passwd");
	  private By signinButton=By.id("SubmitLogin");
	  private By forgotPasswordlink=By.xpath("//a[text()='Forgot your password?111']");
	  
	  
	  //constructor of the page class
	   public LoginPage(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	  
	  //actions of the page behaviour of the page
	   public String getLoginPageTitle()
	   {
		   return driver.getTitle();
	   }
	   
	   public void enterUsername(String username)
	   {
		   driver.findElement(emailID).sendKeys(username);
	   }
          
	   public void enterPassword(String pw)
	   {
		   driver.findElement(password).sendKeys(pw);
	   }
	   
	   public void clickOnlogin()
	   {
		   driver.findElement(signinButton).click();
	   }
	   
	   public boolean isForgotPwdLinkExist() {
			return driver.findElement(forgotPasswordlink).isDisplayed();
		}
	   public AccountsPage doLogin(String un, String pwd) {
			System.out.println("login with: " + un + " and " + pwd);
			driver.findElement(emailID).sendKeys(un);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(signinButton).click();
			return new AccountsPage(driver);
		}


}
