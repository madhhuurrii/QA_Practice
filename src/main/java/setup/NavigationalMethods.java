package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class NavigationalMethods {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);

  }

  public static void main(String[] args) {
    driver.get("https://github.com/madhhuurrii/");
    driver.manage().window().maximize();
    // Navigate To
    driver.navigate().to("https://testautomationpractice.blogspot.com/");
    driver.findElement(By.linkText("Blog")).click();
    // Navigate Back
    driver.navigate().back();
    // Navigate Forward
    driver.navigate().forward();
    //Navigate Refresh
    driver.navigate().refresh();
    System.out.println(driver.getCurrentUrl());


    // driver.quit();
  }
}