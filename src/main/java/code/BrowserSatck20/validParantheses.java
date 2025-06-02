package code.BrowserSatck20;

public class validParantheses {
  public static void main(String[] args) {
    String s="()[]";
    int f1 = 0, f2 = 0, f3 = 0;
    char[] s1 = s.toCharArray();
    for (int i = 0; i < s1.length; i++) {
      if (s1[i] == '(') {
        f1 = -1;
      } else if (s1[i] == '[') {
        f2 = -1;
      } else if (s1[i] == '{') {
        f3 = -1;
      } else if (s1[i] == ')') {
        f1 = 0;
      } else if (s1[i] == ']') {
        f2 = 0;
      } else {
        f3 = 0;
      }
    }
    if (f1 == 0 && f2 == 0 && f3 == 0) {
      System.out.println("Valid Parentheses");
    } else {
      System.out.println("Not valid");
    }
  }
}
