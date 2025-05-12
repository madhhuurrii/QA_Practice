package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class Actions {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
    
    // Alert declaration
    // Simple Alert
    Alert a = driver.switchTo().alert();
    a.accept();
    
    // Confirmational Alert accept/dismiss
    driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
    Alert a1 = driver.switchTo().alert();
    a1.dismiss();
    
    // Prompt Alert
    driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
    Alert a2 = driver.switchTo().alert();
    a2.sendKeys("Madhuri Ramakrishnan");
    a2.accept();

    // driver.quit();
  }
}