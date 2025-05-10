package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class LoginAutomate {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    System.out.println(driver.getCurrentUrl());
    
    // driver.quit();
  }
}