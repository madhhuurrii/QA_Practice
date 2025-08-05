package code.javapraccode;

public class sumofdigits {
  public static void main(String[] args) {
    int a=999;
  int sum=0;
  while(a>0){
    int temp=a%10;
    sum=sum+temp;
    a=a/10;
  }
  System.out.println(sum);
  }
}
