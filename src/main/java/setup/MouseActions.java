package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class MouseActions {
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
    Actions act = new Actions(driver);

    // Mouse Hover
    WebElement d= driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
    WebElement d1= driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
    
    act.moveToElement(d).moveToElement(d1).click().build().perform();
    
    // Context Click
    act.contextClick(d).build().perform();


    // Double Click
    WebElement d2 = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
    act.doubleClick(d2).build().perform();
    WebElement d3 = driver.findElement(By.xpath("//input[@id='field1']"));
    WebElement d4 = driver.findElement(By.xpath("//input[@id='field2']"));
    String p=d3.getAttribute("value");
    String q=d4.getAttribute("value");
    if(p.equals(q)){
      System.out.println("Context Click Worked!");
    }
    else{
      System.out.println("Context Click didn't worked!");
      System.out.println(p+" "+q);
    }

    // driver.quit();
  }
}