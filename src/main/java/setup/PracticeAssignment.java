package setup;

//package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class PracticeAssignment {
  static protected WebDriver driver;
  static {
    chromedriver().setup();
    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    // Write a script to open google.com and verify that title is Google 
    // and also verify that it is redirected to google.co.in
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    String s=driver.getTitle();
    System.out.println(s);
    if(s.equalsIgnoreCase("Google")){
      System.out.println("Correct");
    }
    else{
      System.out.println("Incorrect");
    }
    
    driver.quit();
  }
}