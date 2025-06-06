package setup.saucedemo.pages;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class inventoryPage {
  WebDriver driver;
  //Contructor
  public inventoryPage(WebDriver driver){
    this.driver=driver;
  }

  //Locators
  By selPrice = By.xpath("//select[@class='product_sort_container']");
  By addCart = By.xpath("//button[@class='btn_primary btn_inventory']");


  // Actions
  public void sort(String a1){
    WebElement p = driver.findElement(selPrice);
    Select s= new Select(p);
    List <WebElement> s1=s.getOptions();
    s.selectByValue("lohi");
    for(int i=0;i<s1.size();i++){
      System.out.println(s1.get(i));
      //  if(s1.get(i)).equals("")
    }
    System.out.println("Successfully filtered!");


  }

  public void addToCart(int item){
        List<WebElement> s2 = driver.findElements(addCart);
        for(int i=0;i<s2.size();i++){
          if(i==item){
            s2.get(i).click();
          }
        }
        System.out.println("Successfully added"+item);
  }

}
