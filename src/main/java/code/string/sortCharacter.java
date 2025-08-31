package code.string;

import java.util.Arrays;

public class sortCharacter {
  public static void main(String[] args) {
    String s= "Hello Good Morning";
    String str="";
    String[] l= s.split(" ");
    for(int i=0;i<l.length;i++){
      char[] a = l[i].toCharArray();
      Arrays.sort(a);
      String st=new String(a);
      str=str+st+" ";

      
    }
    System.out.println(str);
  }
}
