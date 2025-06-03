package code.BrowserSatck20;

import java.util.Arrays;

public class missingnum {
  public static void main(String[] args) {
    char []a ={1,2,3,5,7};
    Arrays.sort(a);
    int j=0;
    int z=a.length;
    z=z-1;

    for(int i=a[0];i<=6;i++){
      if(i==a[j]){
        j=j+1;
      }
      else{
        System.out.println(i);
      }
    }

  }
}
