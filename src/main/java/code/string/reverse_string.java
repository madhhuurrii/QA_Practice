package code.string;

import java.util.*;
public class reverse_string{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    String s1="";
    for(int i=s.length()-1;i>=0;i--){
       s1=s1+s.charAt(i);
    }

    // char a[]= s.toCharArray();
    // Arrays.toString(a)

    // StringBuffer s= new StringBuffer("welcome")
    //s.reverse()

    // immutable - cannot change (String)
    // mutable - can change (StringBuffer, StringBuilder)
    System.out.println("Reversed String:"+s1);
  }
}
