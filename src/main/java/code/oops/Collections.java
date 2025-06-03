package code.oops;

import java.util.*;

public class Collections {
  public static void main(String[] args) {
    // ArrayList declaration
    ArrayList ar = new ArrayList();
    List arr = new ArrayList<>();

    // Homogeneous Declaration
    ArrayList<Integer> a= new ArrayList<Integer>(); // Wrapper Class

    // Add data to list
    a.add(100);
    a.add(300);
    a.add(400);
    arr.add("hellow");
    ar.add(600);

    //Size of list
    System.out.println(a.size());

    // printing arraylist
    System.out.println(arr);

    // remove data from arraylist
    a.remove(0);
    System.out.println(a);

    // Insert element
    a.add(1,200);
    System.out.println(a);

    // Modify element in arraylist
    a.set(1,600);
    System.out.println(a);

    // Access specific element 
    System.out.println(a.get(1));

    // Reading element from arraylist
    for(int i=0;i<a.size();i++){
      // System.out.println(a.get(i));
    }

    for(Object x:a){
      System.out.println(x);
    }

    // remove all elements
    a.removeAll(ar);
    System.out.println(a);

    a.clear();
    System.out.println(a);




    
  }
}

/// Collections - grp of elements in a single entity, predefined interface
/// Collections(I) - 1. List (I)   2. Set (I)
/// 1. List --> ArrayList (C)
/// 2. Set ---> HashSet (C)
/// 
/// Map(I) --> HashMap(C)
/// 
/// ArrayList is a class which implements List Interface
/// 1. Heterogeneous data - allowed
/// 2. Insertion allowed
/// 3. Duplicate elements
/// 4. multiple nulls -- allowed
