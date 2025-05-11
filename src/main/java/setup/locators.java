package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class locators {
  static protected WebDriver driver1;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver1 = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver1.get("https://testautomationpractice.blogspot.com/");
    driver1.manage().window().maximize();
    driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // Name Locators
    //driver.findElement(By.name("viewport"));
    // className Locator
    driver1.findElement(By.className("form-control")).sendKeys("Hii");
    // ID Loactors
    driver1.findElement(By.id("name")).sendKeys("Madhuri");
    // Tag Name
    driver1.findElement(By.tagName("img")).isDisplayed();
    // LinkText Locator
    driver1.findElement(By.linkText("Blog")).click();
    driver1.findElement(By.partialLinkText("How To Explain Project In Interview Freshers")).click();
    driver1.quit();
  }
}