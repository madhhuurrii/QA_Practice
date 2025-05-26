package code.array;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a[] = {1,2,3,4,5};
    // different data type in array
    Object c[]={"ABC",1,true};
    
    int b[] = new int[a.length];
    int j=0;
    for (int i = a.length-1;i>=0;i--) {
        b[j]=a[i];
        j=j+1;
    }
    System.out.println(Arrays.toString(b));
    
  }
}
