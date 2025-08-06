package code.javapraccode;

import java.util.HashMap;

public class dupliCheckChar {
  public static void main(String[] args) {
    String s="Hello Good Morning";
    s=s.toLowerCase();
    HashMap<Character,Integer> h = new HashMap<>();
    for(int i=0;i<s.length();i++){
      char s1=s.charAt(i);
         if(s1==' '){
          continue;
         }
         else if(h.containsKey(s1)){
           h.put(s1, h.get(s1)+1);
         }
         else{
          h.put(s1, 1);
         }
    }

    for(char s1: h.keySet()){
      if(h.get(s1)>1){
        System.out.println("Char "+s1+ ": "+h.get(s1));
      }
    }
  }
}
