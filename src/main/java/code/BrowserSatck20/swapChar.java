package code.BrowserSatck20;

public class swapChar {
  public static void main(String[] args) {
    String s="Kalyani";
    char c=s.charAt(0);
    char c1=s.charAt(s.length()-1);
    String s1=c1+s.substring(1, s.length()-1)+c;
    System.out.println(s1);
  }
}
