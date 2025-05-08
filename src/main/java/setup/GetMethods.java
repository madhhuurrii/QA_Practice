package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class GetMethods {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    // 1. Get method
    driver.get("https://github.com/madhhuurrii/");
    driver.manage().window().maximize();
    // 2. Get Title
    String s=driver.getTitle();
    System.out.println(s);
    // 3. Get Current Url
    System.out.println(driver.getCurrentUrl());
    // 4. get page source
    System.out.println(driver.getPageSource());
    // 5. get window handles
    System.out.println(driver.getWindowHandle());
    driver.quit();
  }
}