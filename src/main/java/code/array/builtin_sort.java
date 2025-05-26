package code.array;
import java.util.Scanner;
import java.util.*;

public class builtin_sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a[] = new int[x];
    for (int i = 0; i < x; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
  }
}