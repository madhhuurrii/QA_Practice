package code.javapraccode;

import java.util.ArrayList;

public class fibonacci {
  public static void main(String[] args) {
    int f=10;
    if(f==1 || f==0){
      System.out.println(f);
    }
    else{
      int [] a = new int[f];
      a[0]=0;
      a[1]=1;
      
      for(int i=2;i<f;i++){
        a[i]=a[i-1]+a[i-2];
      }
      for(int i=0;i<f;i++){
        System.out.print(a[i]+" ");
      }
    }
  }
}
