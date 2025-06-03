package code.BrowserSatck20;

import java.util.Collections;
import java.util.HashMap;
public class countFreq {
  public static void main(String[] args) {
    int [] a={1,2,3,2,4,5,2,1,8,5,3};

    HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
    for(int i=0;i<a.length;i++){
      if(h.containsKey(a[i])){
        h.put(a[i],h.get(a[i])+1);
      }
      else{
        h.put(a[i],1);
      }
    }
    System.out.println(h);
  }
}
