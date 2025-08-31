package code.string;

import java.util.HashMap;

public class occurencesString {
  public static void main(String[] args) {
    String s="MadhuriRamakrishnan";
    s=s.toLowerCase();
    HashMap<Character,Integer> h = new HashMap<>();
    for(int i=0;i<s.length();i++){
      if(h.containsKey(s.charAt(i))){
        h.put(s.charAt(i),h.get(s.charAt(i))+1);
      }
      else{
        h.put(s.charAt(i), 1);
      }
      

    }
    System.out.println(h.toString());
  }
}
