package setup.coursera;

public class firstexercise {
  public static void main(String[] args) { // psvm
    System.out.println("Hello World"); // sysout ctrl+space
    System.out.println("Good Bye World");

    System.out.println("5 * 3 : " + 5 * 3);

    System.out.println("No. of Seconds in a day: " + 24 * 60 * 60);

    int a = 5, b = 3, c = 10;

    System.out.println(a + b + c);
    a = 30;
    System.out.println(a + b + c);

    b = 40;
    System.out.println(a + b + c);

    // 7 Multiplication Table
    for(int i=1;i<=10;i++){
      System.out.println("7 * "+i+" = "+i*7);
    }

    //6 tables
    for (int i = 1; i <= 10; i++) {
      System.out.println("6 * " + i + " = " + i * 6);
    }
    // 10 tables
    for (int i = 1; i <= 10; i++) {
      System.out.println("10 * " + i + " = " + i * 10);
    }

    for(int i=1;i<=10;i++){
      System.out.print(i+" ");
    }
    System.out.println();
    for (int i = 10; i >0; i--) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 1; i <= 10; i++) {
      System.out.print(i*i +" ");
    }



  }
}
