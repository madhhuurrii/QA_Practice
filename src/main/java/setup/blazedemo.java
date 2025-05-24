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
    
    // Selecting To and for port
    WebElement a = driver.findElement(By.xpath("//select[@name='fromPort']"));
    WebElement b = driver.findElement(By.xpath("//select[@name='toPort']"));

    Select dr = new Select(a);
    Select drp = new Select(b);

    dr.selectByIndex(3);
    drp.selectByValue("Cairo");
    
    // Next Page
    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();


    // Selecting Cheap Flight
    int r = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
    // int c=driver.findElements(By.xpath("//table[@class='table']//tr[1]")).size();
    Float min = Float.MAX_VALUE;
    String s2 = "";
    for (int i = 2; i < r; i++) {

      String s = driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[6]")).getText();
      String s1 = s.substring(1);
      Float z = Float.parseFloat(s1);
      if (z < min) {
        min = z;
        s2 = s;
      }

    }
    System.out.println(s2);
    for (int i = 2; i < r; i++) {
      String s = driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[6]")).getText();

      if (s.equals(s2)) {
        driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[1]//input[@value='Choose This Flight']")).click();
        break;

      }
    }

    // Filling the form
    driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Madhuri");
    driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Dakshina CHS");
    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Navi Mumbai");
    driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");
    driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("400 708");
    driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("408028849294");
    driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("madhuri");
    driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
    driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
    
    System.out.println("Successfully Purchased! Yay!");
    driver.quit();
  }
}