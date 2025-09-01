package code.BrowserSatck20;

import java.util.Arrays;

public class array1 {
  public static void main(String[] args){
    int[] a={1,2,3,4,5};
    int temp=a[a.length-1];
    int t=0;
    for(int i=0;i<a.length;i++){
      if(i==0){
        t=a[i];
        a[i]=temp;
      }
      else{
        int t1=a[i];
        a[i]=t;
        t=t1;
      }
    }
    System.out.println(Arrays.toString(a));
  }
}
