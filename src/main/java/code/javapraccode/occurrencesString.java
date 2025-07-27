package code.javapraccode;

import java.util.HashMap;

public class occurrencesString {
  public static void main(String[] args) {
    String a="Hello Good Morning";
    HashMap <Character,Integer> h = new HashMap<>();
    for(int i=0;i<a.length();i++){
    Character s= a.charAt(i);
    s=s.toLowerCase(s);
   // System.out.println(s);
     if (h.containsKey(s)){
         h.put(s, h.get(s)+1);
     }
     else{
      h.put(s,1 );
     }
    }
    System.out.println(h);
  }
}
