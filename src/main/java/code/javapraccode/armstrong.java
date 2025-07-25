package code.javapraccode;

public class armstrong {
  public static void main(String[] args) {
    int a=371;
    int len= String.valueOf(a).length();
    int sum=0;
    while(a>0){
      int temp = a % 10;
      System.out.println(temp);
      
      a=a/10;
      
      sum=sum+(int) Math.pow(temp,len);
      // System.out.println(sum);
    }
    System.out.println("Armstrong: "+sum);

  }
}
