package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class ConditionalMethods
 {
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
    // isSelected
    WebElement l=driver.findElement(By.xpath("//input[@id='monday']"));
    System.out.println(l.isSelected());
    l.click();
    System.out.println(l.isSelected());
    // isEnabled
    WebElement l1 = driver.findElement(By.xpath("//button[@name='start']"));
    System.out.println(l1.isEnabled());
    // isDisplayed
    WebElement l2 = driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
    System.out.println(l2.isDisplayed());

    
    driver.quit();
  }
}