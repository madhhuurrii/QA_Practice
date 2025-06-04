package code.BrowserSatck20;

import java.util.*;

public class duplinum {
  public static void main(String[] args) {
    int a[] = {1,2,3,2,3,1,5,3,6};
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

    for(int i=0;i<a.length;i++){
      if(h.containsKey(a[i])){
        h.put(a[i],h.get(a[i])+1);
      }
      else{
        h.put(a[i],1);
      }
    }
    for(Object c:h.keySet()){
      int z=h.get(c);
      if(z>1)
      {
         System.out.println(c);
      }
    }
  }
}
