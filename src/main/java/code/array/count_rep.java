package code.array;

import java.util.Scanner;

public class count_rep {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a[] = new int[x];
    for (int i = 0; i < x; i++) {
      a[i] = sc.nextInt();
    }
    int e = sc.nextInt();
    int count = 0;
    for (int i = 0; i < x; i++) {
      if (a[i] == e) {
        count = count + 1;
      }

    }
    System.out.println(count);
  }
}
