package setup.saucedemo.test;

import java.time.Duration;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import setup.saucedemo.pages.inventoryPage;
import setup.saucedemo.utils.Base;

public class inventoryTest extends Base{
  WebDriver driver;
  public void setup(){
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
    driver.get("https://www.saucedemo.com/v1/inventory.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    
  }
  public void teardown(){
    driver.quit();
  }
   public void inventory(){
      inventoryPage in = new inventoryPage(driver);
      in.sort("lohi");
      in.addToCart(2);

   }
  public static void main(String[] args) {
    inventoryTest t = new inventoryTest();
    t.setup();
    t.inventory();
    t.teardown();
  }
}
