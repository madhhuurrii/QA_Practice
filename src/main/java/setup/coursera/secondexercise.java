package setup.coursera;

public class secondexercise {
  static int three(int a, int b, int c) {
    c = c + a + b;
    return c;
  }

  static int sumofangles(int a, int b) {
    int c = 180 - a - b;
    return c;
  }

  public static void main(String[] args) {
      int a=5,b=9,c=21;
      int x=20,y=50;
      System.out.println(three(a,b,c));
      System.out.println(sumofangles(x,y));

      // Ctrl Shift L for Shortcuts
      // have save actions too.
    }
}
