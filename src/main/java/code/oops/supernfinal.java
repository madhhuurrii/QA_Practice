package code.oops;

class Test{
  final int s=0;
  final void m1(){
    System.out.println("This is final");
  }
}
class Test1 extends Test{
    void m1(){// gives error due to final
      System.out.println("This is Start");
      super.m1();
    }
    
    void m2() {// gives error due to final
      System.out.println("This is Start");
      
    }
}
public class supernfinal {
  public static void main(String[] args) {
    Test1 t=new Test1();
    t.s=100; // cant be assigned since t is final
    System.out.println(t.s);
    System.out.println();

  }
}
// final - variables, method, class
// variable value cannot be changed (constant)
// Method can not be override if final keyword is used in child classes
// Class - we cannot extend class 

// super - implemented only in inheritance
// super refers to immediate parent class
// super - variable, methods
