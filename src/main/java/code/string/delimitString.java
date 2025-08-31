package code.string;

import java.util.Arrays;

public class delimitString {
  public static void main(String[] args) {
    String s="hello good morning";
    String email="madhuri.r@gmail.com";
    String[] s1=s.split(" ");
    String[] email1=email.split("@");
    System.out.println(Arrays.toString(s1));
    System.out.println(Arrays.toString(email1));
  }
}
