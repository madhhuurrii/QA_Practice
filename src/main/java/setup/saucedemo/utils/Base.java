package setup.saucedemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class Base {
   WebDriver driver;

  // chromedriver().setup();
  // var options = new ChromeOptions();
  // options.addArguments("--no-sandbox");
  // driver = new ChromeDriver(options);
  

  
  public void setup(){
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
    driver.get("https://www.saucedemo.com/v1/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
  }
  public void teardown(){
    driver.quit();
  }
  // public static void main(String[] args) {
  //   // driver.get("https://github.com/madhhuurrii/");
  //   // driver.manage().window().maximize();
  //   // driver.quit();
  // }
}