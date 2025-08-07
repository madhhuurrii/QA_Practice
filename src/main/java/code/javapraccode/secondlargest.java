package code.javapraccode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.Collections;

public class secondlargest {
  public static void main(String[] args) {
    int[] a1= {100,25,5,8,9,9};
    HashMap <Integer,Integer> h = new HashMap<>();
    for(int i=0;i<a1.length;i++){
      if(h.containsKey(a1[i])){
        h.put(a1[i], h.get(a1[i])+1);
      }
      else{
        h.put(a1[i],1);
      }
    }

    ArrayList<Integer> a=new ArrayList<>(h.keySet());
    Collections.sort(a, Collections.reverseOrder());;
    
    System.out.println(a.get(1));

    

  }
}
