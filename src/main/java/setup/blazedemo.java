package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.time.Duration;

public class blazedemo {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://blazedemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement a = driver.findElement(By.xpath("//select[@name='fromPort']"));
    WebElement b = driver.findElement(By.xpath("//select[@name='toPort']"));

    Select dr = new Select(a);
    Select drp =new Select(b);

    dr.selectByIndex(3);
    drp.selectByValue("Cairo");

    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

    
    // driver.quit();
  }
}