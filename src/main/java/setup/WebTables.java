package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class WebTables {
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
    // no. of rows
    int r = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
    int c = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
    System.out.print(c);
    // starts with 1 not 0
    for(int i=2;i<r;i++){
      String a = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
      System.out.println(a);

    }
    
    // driver.quit();
  }
}