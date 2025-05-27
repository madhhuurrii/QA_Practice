package code.oops;

public class classnobj {

  int x;
  String m;
  void display(){
    System.out.println(x+" "+m);
  }

  classnobj(int a){
      x=a;
      System.out.println(x);
  }
  public static void main(String[] args) {
    // class is collection of attributes and behaviour
    // without class there is no object
    // object is blueprint of class


    // class is collection of variables and method
    // class is a logical entity, does not occupy space in memory
    // class Employee{
    //    variables
    //    method
    // } 


    // Object 
    // object is instance of class
    // object is created by using class
    // n no of objects can be created for a class
    // object is physical entity/ occupies space in memory
    // Employee emp = new Employee();

    // Constructor
    // Constructor takes param but has no return type
    // Constructor is same name as classname
    // it is initiated as soon as the object is declared
    // 2 types: default and parameterized constructor
    // only used for assigning value no logics

    
     classnobj c = new classnobj(5); // object declaration of class
     c.x=10;
     c.m="Madhuri";
     c.display();
    //  classnobj c1 = new classnobj(11);
    //  c1.display();



  }
}
