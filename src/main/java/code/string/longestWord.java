package code.string;

import java.util.ArrayList;
import java.util.List;

public class longestWord {
  public static void main(String[] args) {
    String sentence="Hello Good Morning Mumbai";
    
    String[] l=sentence.split(" ");
    int max=0;
    String a="";
    for(int i=0;i<l.length;i++){
        if(l[i].length()>max){
           max=l[i].length();
           a=l[i];
        }
    }
    System.out.println(a);
  }
}
