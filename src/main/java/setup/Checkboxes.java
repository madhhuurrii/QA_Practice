package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import java.util.List;

public class Checkboxes {
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
    // driver.quit();
    List<WebElement> l= driver.findElements(By.xpath("//input[@class='form-check-input']"));
    for (int i=0;i<l.size();i++){
        System.out.println(l.get(i).isSelected());
        l.get(i).click();
        System.out.println(l.get(i).isSelected());
      }
      driver.quit();
  }
}