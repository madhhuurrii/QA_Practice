package code.javapraccode;

public class swap2Num {
  public static void main(String[] args) {
    int a=10, b=20;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Swapped numbers: a: "+a+" , b: "+b);
  }
}
