package setup.saucedemo.test;



import setup.saucedemo.pages.LoginPage;
import setup.saucedemo.utils.Base;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest extends Base {
  WebDriver driver;
  public void setup(){
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
    driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    
  }
  public void teardown(){
    driver.quit();
  }
  public void login(){
    System.out.println((driver.getCurrentUrl()));
    LoginPage p = new LoginPage(driver);
    // p.setup();
    p.LoginData("standard_user", "secret_sauce");
    p.LoginSubmit();

  }



   public static void main(String[] args) {
    //  WebDriver driver;
    //LoginPage p = new LoginPage(driver);
    LoginTest l = new LoginTest();
    l.setup();
    l.login();
   
   
    
    
    

   }
}
