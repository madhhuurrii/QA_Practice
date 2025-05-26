package code.string;

import java.util.*;
public class palindrom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    // System.out.println(s);
    StringBuffer s1=new StringBuffer(s);
    s1.reverse();
    System.out.println(s1);
    if(s.equals(s1.toString())){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a Palindrome");
    }
    
  }
}
