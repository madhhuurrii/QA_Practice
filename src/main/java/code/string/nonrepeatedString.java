package code.string;

import java.util.*;

public class nonrepeatedString {
  public static void main(String[] args) {
    String a="Annyeonhaseyo";
    a=a.toLowerCase();
    HashMap<Character,Integer> h= new HashMap<>();
    for(int i=0;i<a.length();i++){
        if(h.containsKey(a.charAt(i))){
          h.put(a.charAt(i), h.get(a.charAt(i))+1);
        }
        else{
          h.put(a.charAt(i), 1);
        }

    }
    for(int i=0;i<a.length();i++){
      if(h.get(a.charAt(i))==1){
        System.out.println(a.charAt(i));
        break;
      }
    }
  }
}
