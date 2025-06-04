package code.BrowserSatck20;

import java.util.HashMap;

public class majorityele {
  public static void main(String[] args) {
    int []a={ 2, 2, 1, 1, 1, 2, 2};
    int n=a.length;
    n=n/2;
    HashMap <Integer,Integer> h = new HashMap<Integer,Integer>();

    for(int i=0;i<a.length;i++){
      if(h.containsKey(a[i])){
        h.put(a[i],h.get(a[i])+1);
      }
      else{
        h.put(a[i],1);
      }
    }
    int max=0;
    int z=0;
    for(Object c:h.keySet()){

      if(h.get(c)>max){
        max=h.get(c);
        z=(int)c;
      }
    }
    System.out.println(z);
  }
}
