package code.javapraccode;

import java.util.HashMap;

public class opip {
  public static void main(String[] args) {
    String s="aabbbccccddddd";
    HashMap<Character,Integer> h = new HashMap<>();
    for(int i=0;i<s.length();i++){
      if(h.containsKey(s.charAt(i))){
        h.put(s.charAt(i), h.get(s.charAt(i))+1);
      }
      else{
        h.put(s.charAt(i), 1);
      }
    }
    String s1="";
    for(char c: h.keySet()){
      s1=s1+c;
      s1=s1+h.get(c);
    }
    System.out.println(s1);
  }
}
