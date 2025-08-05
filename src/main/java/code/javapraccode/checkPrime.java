package code.javapraccode;

public class checkPrime {
  public static void main(String[] args) {
    int p=2;
    int f=0;
    for(int i=2;i<p;i++){
        if(p%i==0){
          f=-1;
          break;
        }
    }
    if(f==-1 || p==2|| p==1){
      System.out.println("Not a Prime!");
    }
    else{
      System.out.println("Is a Prime!");
    }
  }
}
