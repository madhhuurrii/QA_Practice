package setup.coursera;
import setup.coursera.*;;

class Person{
  String Fname;
  String Lname;
  int Height;
  int Weight;
  void run(){
    System.out.println("Can Run");
  }
  
  void walk() {
    System.out.println("Can Walk");
  }
}


public class thirdexcercise {

public static void main(String[] args) {
   Person madhuri = new Person();
   madhuri.Fname="Madhuri";
   madhuri.Lname="Ramakrishnan";

   book b= new book();
   b.name="Art of Computer Programming";
   b.BookName();
   b.name="Effective Java";
   b.BookName();
   b.name="Clean Code";
   b.BookName();
}
  
}
