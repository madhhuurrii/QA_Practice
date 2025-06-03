package code.BrowserSatck20;

import java.util.ArrayList;
import java.util.HashMap;

public class nonrepeat {
  public static void main(String[] args) {
    String s="azaccdjdeffgghhr";
    char [] a=s.toCharArray();
    HashMap <Character,Integer> h = new HashMap<Character,Integer>();
    for(int i=0;i<a.length;i++){
        if(h.containsKey(a[i])){
          h.put(a[i],h.get(a[i])+1);
        }
        else{
          h.put(a[i],1);
        }
    }
    ArrayList z = new ArrayList<>();
    for(int i=0;i<a.length;i++){
     
        if (h.get(a[i]) == 1 && h.containsKey(a[i]) ) {
          System.out.println(a[i]);
          // z.add(c);
          break;
        }
      
    
    }
  }

 
}
