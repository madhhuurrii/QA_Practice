package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;
import java.util.ArrayList;

public class BrowserMethods {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    // Open Link in new tab
    String baseUrl = "http://www.google.co.uk/";
    driver.manage().window().maximize();
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
    ((JavascriptExecutor)driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1)); //switches to new tab
    driver.get("https://www.facebook.com");
    
    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
    // driver.get("https://www.news.google.com");
    driver.close(); // closes 1 tab
    driver.quit(); //closes whole window
  }
}