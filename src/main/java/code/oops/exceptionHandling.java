package code.oops;

public class exceptionHandling {
  // Exception is an event which cause sudden termination of program (user mistake)
  
  // Errors - syntax, logical (caused by programmers)
  public static void main(String[] args) throws ArithmeticException {
    try{
      System.out.println(100/0);

    }
    catch(Exception e){
      System.out.println(e.getMessage());
    } // 1 try can have multiple catch blocks
    finally{
      // block of code which needs to be executed anyhow
      System.out.println("Finally executed!");
    }
  }
}

/// types of exception
/// 1) Checked Exceptions 
///    [ InteruptedException, FileNotFound, IOException etc.]
/// 2) Unchecked Exceptions
///    [ArithmeticException, NullPointerException, ArrayIndexOutofBound etc.]
/// 
/// ArithmeticException - In which a number is divided by 0
/// NullPointerException - Performing operations on null variables
/// ArrayIndexOutofBound - trying to access value out of size of array
/// NumberFormatException - if string('welcome', instead of '1234') is passed to parse it to Int
/// 
/// 
/// 
/// where inputs is taken, high chance of exception