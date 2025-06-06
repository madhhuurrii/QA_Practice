package setup.saucedemo.pages;

import org.openqa.selenium.WebDriver;

import setup.saucedemo.utils.Base;

import org.openqa.selenium.*;

public class LoginPage extends Base {
  // Constructors
  WebDriver driver;
  public LoginPage(WebDriver driver){
     this.driver=driver;
  }
  
  // Locators
  By userName = By.xpath("//input[@id='user-name']");
  By passWord = By.xpath("//input[@id='password']");
  By submitBtn = By.xpath("//input[@id='login-button']");
  
  // Actions
  public void LoginData(String a,String b){
    driver.findElement(userName).sendKeys(a);
    driver.findElement(passWord).sendKeys(b);


  }
  public void LoginSubmit(){
    driver.findElement(submitBtn).click();
    System.out.println("Successfully Logged In");
  }


}
