package code.string;

import java.util.Arrays;

public class sortWords {
  public static void main(String[] args) {
    String s="Hello Good Morning";
    String[] l=s.split(" ");
    Arrays.sort(l);

    String a="";
    for(int i=0;i<l.length;i++){
      a=a+l[i]+" ";
    }
    System.out.println(a);
    

  }
}
