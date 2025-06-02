package code.oops;

class Animal{
  int s=0;
  @Override  //It is not mandatory to use @Override.
  void speak(){
    System.out.print("Barking");
  }
}
class Cat extends Animal{
    @Override
    void speak(){
      System.out.print("Meowing");
    }

    void s1(){
      System.out.print(super.s);
    }
}

public class overiding {
  // deals with the Inheritance concept
  // Method Overriding deals with implementation of method
  // no change in name or parameters
  // Needs 2 class minium to achieve overriding
  public static void main(String[] args) {
    Cat c=new Cat();
    c.speak();
    c.s1();

  }
}

/// Method Overriding
/// 1. Possible only in multiple classes(inheritance)
/// 2. we should not change the signature of the method, but body
/// 3. method names are same
/// 4. belongs to inheritance

/// Method Overloading
/// 1. Possible in single & multiple Inheriatnce
/// 2. Is the concept of Polymorphism
/// 3. should change the signature of method
/// 4. methods names are same
