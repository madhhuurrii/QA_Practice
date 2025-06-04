package code.oops;

// import java.util.*;
import java.util.HashMap;

public class HashMap1 {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();

    hm.put("amdhuri", 1);
    System.out.println(hm);
    System.out.println(hm.size());

    // remove using key
    hm.remove(1);

    // Acces value using key
    hm.get(1);

    System.out.println(hm.keySet());
    System.out.println(hm.values());

    for (String k : hm.keySet()) {
      System.out.println(k + " " + hm.get(k));
    }

  }
}

/// HashMap - a class implemented Map Interface
/// Data can be stored in key, value pair
/// Key is unique but we can duplicate value
/// Insertion order not preserved
///
///
