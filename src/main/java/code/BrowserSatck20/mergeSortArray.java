package code.BrowserSatck20;

import java.util.*;

public class mergeSortArray {
  public static void main(String[] args) {
    int [] a={1,2,3,0,0,0};
  int m=3;
  int []b={19,8,7};
  int n=3;

  
  for(int i=0;i<n;i++){
    // System.out.println(a[i + m]);
      a[i+m]=b[i];

  }
  Arrays.sort(a);
  System.out.println(Arrays.toString(a));
  }
  
}
