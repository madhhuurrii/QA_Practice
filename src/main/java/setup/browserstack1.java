package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class browserstack1 {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://www.browserstack.com/");
    driver.manage().window().maximize();
    WebElement s=driver.findElement(By.xpath("//div[@id='product-text-section']//h1"));
    System.out.println(s.getAttribute("innerHTML"));
    driver.quit();
  }
} 
  

