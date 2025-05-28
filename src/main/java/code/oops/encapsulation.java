package code.oops;

public class encapsulation {
  // Encapsulation

  //// wrapping up data and methods to single unit
  /// 1. All variables should be private
  /// 2. for every variables there should 2 methods(getter,setters), individually
  /// 3. variables can be operated only through methods
  /// This helps in maintaing security of applications
  /// 
  /// 
  /// source -> generate setter&getters (eclipse)
  
  private int s;
  private String s1;
  void setno(int s){
    this.s=s;
  }
  void sets(String s1){
    this.s1=s1;
  }
  void getno(){
    System.out.println(s);
  }
  public static void main(String[] args) {
     encapsulation e=new encapsulation();
     e.setno(10);
     e.getno();
  }
}
