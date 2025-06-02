package code.oops;

interface Shape{
  int f=10; // static and final

  void circle(); // abstract method (no-implementation)
  // methods in interface is public

  default void push(){
    System.out.println("Hi");
  }
  static void append(){
    System.out.println("Hello");
  }
  
}

public class dataAbstraction implements Shape{
  public void circle(){
    System.out.println("Circle");
  }

  public static void main(String[] args) {
    //Scenario 1
    dataAbstraction db = new dataAbstraction();
    db.circle();
    db.push();
    Shape.append(); // static can be accessed diretly using interface

   
    // Scenario 2
    Shape sh=new dataAbstraction();
    // can reference but not instantiate


  }
}

/// Abstraction
/// It refers to process of hiding the implementation details and shwoing functionality 
/// to user.
/// 1. Abstract Class   2. Interface

/// Interface
/// 1. Interface is blueprint of class
/// 2. Interface contains final&static variables
/// 3. Interface contains Abstract method
/// 4. Abstract method contains method signature but not body
/// 5. Methods in Interface are public
/// 6. Interface supports the functionality of multiple Inheritnce
/// 7. can define interface using interface keyword
/// 8. Class extends another class, interface extends another interface, but class implements interface
/// 9. we can create obj ref for interface but cannot instantiate it 