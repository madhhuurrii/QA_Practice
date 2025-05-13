package setup;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class SelectDropdown {
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
    // Dropdown Declaration
    WebElement d = driver.findElement(By.xpath("//select[@id='country']"));
    WebElement d1 = driver.findElement(By.xpath("//select[@id='colors']"));
    WebElement d2 = driver.findElement(By.xpath("//select[@id='animals']"));

    Select drp = new Select(d);
    Select drp1 = new Select(d1);
    Select drp2 = new Select(d2);

    // Select by visible text
    drp.selectByVisibleText("India");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drp1.selectByValue("yellow");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drp2.selectByIndex(3);

    List<WebElement> options = drp.getOptions();
    for(int i=0;i<options.size();i++){
      System.out.println(options.get(i).getText());
    }


    driver.quit();
  }
}