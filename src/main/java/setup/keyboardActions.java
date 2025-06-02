package setup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class keyboardActions {
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
    Actions ac = new Actions(driver);

    // Keyboard Actions
    // ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
    
    // ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
    
    // new tab
    ac.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
    System.out.println(driver.getWindowHandles());
    driver.switchTo().newWindow(WindowType.TAB);
    System.out.println(driver.getWindowHandles());
    // switch to tab
    //ac.keyDown(Keys.CONTROL).keyDown(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.CONTROL).build().perform();


  }
}
