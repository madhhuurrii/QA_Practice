package code.javapraccode;

import java.util.HashMap;

public class dupliChar {
  public static void main(String[] args) {
    String s="Anaconda";
    s=s.toLowerCase();
    char[] s1= s.toCharArray();
    HashMap<Character,Integer> h = new HashMap<>();
    for(int i=0;i<s1.length;i++){
      Character a= s1[i];
      if(h.containsKey(a)){
        h.put(a, h.get(a)+1);
      }
      else{
        h.put(a, 1);
      }


    }
    for(char c:h.keySet()){
      if(h.get(c)>1){
        System.out.println(c+" "+h.get(c));
      }
    }
  }
}
