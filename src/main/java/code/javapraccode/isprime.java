package code.javapraccode;

public class isprime {
  public static void main(String [] args){
    int a=23;
    if(a<=1){
      System.out.println("False");
    }
    else{
      int f=0;
      for(int i=2;i<a;i++){
        if(a%i==0){
          f=-1;
          System.out.println(i);
          break;
        }
      }
      if(f==-1){
        System.out.println("False");
      }
      else{
        System.out.println("True");
      }
    }
  }
  
}
