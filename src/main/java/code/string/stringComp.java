package code.string;

public class stringComp {
  public static void main(String[] args) {
    // == Equals
    String s=new String("welcome"); // referencing 
    String s1="welcome";

    System.out.println(s==s1); // compares objects
    System.out.println(s.equals(s1)); // compares value of object
  }
}
