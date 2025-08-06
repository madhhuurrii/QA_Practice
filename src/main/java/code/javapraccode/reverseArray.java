package code.javapraccode;

import java.util.*;

public class reverseArray {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int r=0, l= arr.length-1;

    while(r<l){
      int temp=arr[l];
      arr[l]=arr[r];
      arr[r]=temp;
      r++;
      l--;
    }
    System.out.println(Arrays.toString(arr));
    
  }
  
}
