package code.BrowserSatck20;
import java.util.*;
public class twoSum {
  public static void main(String[] args) {
    int [] a={ 3, 3};
    Scanner sc=new Scanner(System.in);
    int target=sc.nextInt();
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        int s = a[i] + a[j];
        if (s == target) {
         
          System.out.println(i + " " + j);
          break;
        }
  
      }
      
    }
  }
}
