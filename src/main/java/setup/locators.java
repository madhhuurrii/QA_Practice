package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class locators extends LoginAutomate {
  static protected WebDriver driver1;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver1 = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver1.get("https://github.com/madhhuurrii/");
    driver1.manage().window().maximize();
    LoginAutomate obj = new LoginAutomate();
    System.out.println(obj.driver);
    driver1.quit();
  }
}