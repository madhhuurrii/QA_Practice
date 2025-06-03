package code.oops;

import java.util.*;


public class HashSet {
  public static void main(String[] args) {
    HashSet h = new HashSet();
   // Set h1 = new HashSet();

   h.add(200);
   h.add(300);
   h.add(500);

   // remove element
   h.remove(200); // pass value not index

   // Inserting not possible

   // accessing specific element not allowed

   // convert hashset to arraylist
   ArrayList a = new ArrayList<>(h);

   // read elements
   for(Object x:h){
    System.out.println(x);
   }

   // size of HashSet
   h.size();





    

  }
  
}

/// HashSet - A class implemented Set Interface
/// 1. Hetergeneous data - allowed
/// 2. Insertion order - not supported
/// 3. Duplicate elements - not allowed
/// 4. Multiple null not allowed, only single null allowed
/// 
