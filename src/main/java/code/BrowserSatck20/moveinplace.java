package code.BrowserSatck20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class moveinplace {
  public static void main(String[] args) {
    
    int []a={0,1,3,0,2,6,0,4};
    List<Integer> a1 = new ArrayList<Integer>();
    // Collections.addAll(a1, a);
    // List a1=Arrays.asList(a);
    for(int i=0;i<a.length;i++){
      a1.add(a[i]);
    }
    System.out.println(a1);
    int s=a1.size();
    
    for(int i=0;i<s;i++){
      if(a1.get(i).equals(0)){
          a1.remove(i);
          a1.add(0);
      }
    }
    System.out.println(a1);
    

  }
  
}
