package code.BrowserSatck20;

import java.util.Collections;
import java.util.HashMap;

public class anagrams {
  public static void main(String[] args) {
    String s1 = "madam";
    String s2 = "madamji";
     if(s1.length()==s2.length()){
      
       HashMap<Character, Integer> h = new HashMap<Character, Integer>();
       HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();

       for (int i = 0; i < s1.length(); i++) {
         if (h.containsKey(s1.charAt(i))) {
           h.put(s1.charAt(i), h.get(s1.charAt(i)) + 1);
         } else {
           h.put(s1.charAt(i), 1);
         }
       }

       for (int i = 0; i < s2.length(); i++) {
         if (h1.containsKey(s2.charAt(i))) {
           h1.put(s2.charAt(i), h1.get(s2.charAt(i)) + 1);
         } else {
           h1.put(s2.charAt(i), 1);
         }
       }
       int f = 0;
       for (Object c : h.keySet()) {
         if (h.get(c) != (h1.get(c))) {
           f = -1;
           break;
         }
       }
       if (f == -1) {
         System.out.print("Not Anagram");
       } else {
         System.out.println("Anagram");
       }

     }
     else{
      System.out.println("not Anagram");
     }
  }
}
