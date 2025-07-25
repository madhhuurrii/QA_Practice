package code.javapraccode;

public class swapstring {
  public static void main(String[] args) {
  String s = "Hey";
  String s1 = "GoodMorning";
  int l=s.length();
  s=s+s1;
  s1=s.substring(0,l);
  s=s.substring(l,s.length());
  System.out.println(s+" "+s1);
  }
}
