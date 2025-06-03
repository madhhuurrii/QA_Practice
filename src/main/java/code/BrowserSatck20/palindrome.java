package code.BrowserSatck20;

public class palindrome {
  public static void main(String[] args) {
    String s="madam";
    StringBuilder s1=new StringBuilder(s);

    if(s1.equals(s1.reverse())){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }

  }
}
