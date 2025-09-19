/*
* Enumeration in Java
* --------------------
* - Introduced in JDK 1.0 (Legacy).
* - Works only on Legacy classes like Vector, Stack, Hashtable.
* - It can only move in Forward direction.
* - Methods:
*      1) boolean hasMoreElements() → check if next element exists
*      2) Object nextElement() → returns next element
* - Limitations:
*      ❌ Cannot remove elements
*      ❌ Cannot add elements
*      ❌ Works only on legacy classes
*/
 
import java.util.*;
 
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Python");
        v.add("C++");
 
        // Create Enumeration cursor
        Enumeration<String> e = v.elements();
       
 
        System.out.println("Using Enumeration:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
 
 
