package com.java.test;

//class Test {
//    public static void main(String[] args) {
//        Test t = new Test();
//        System.out.println(t instanceof Test);
//    }
//}
//class Animal {
//    void sound() { System.out.println("Animal sound"); }
//}
//class Dog extends Animal {
//    void sound() { System.out.println("Dog barks"); }
//}
//public class Main {
//    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.sound();
//    }
//}
//class Demo {
//    int x;
//    Demo(int i) {
//    	int x=0;
//      this. x = i;
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Demo d = new Demo(5);
//        System.out.println(d.x);
//    }
//}
//interface A {
//    void display();
//}
//class B implements A {
//    public void display() {
//        System.out.println("Hello Interface");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        A obj = new B();
//        obj.display();
//    }
//}
//class Parent {
//    void show() { System.out.println("Parent class"); }
//}
//class Child extends Parent {
//    void show() { System.out.println("Child class"); }
//}
//public class Test {
//    public static void main(String[] args) {
//        Parent p = new Parent();
//        Child c = new Child();
//        p.show();
//        c.show();
//    }
//}
//class Sample {
//    Sample() {
//        System.out.println("Constructor called");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Sample s = new Sample();
//    }
//}
//class Student {
//    static int count = 0;
//    Student() {
//        count++;
//    }
//    void showCount() {
//        System.out.println(count);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        new Student().showCount();
//        new Student().showCount();
//    }
//}
//abstract class Base {
//    abstract void show();
//}
//class Derived extends Base {
//    void show() {
//        System.out.println("Show method called");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Base b = new Derived();
//        b.show();
//    }
//}
//class A {
//    A() { System.out.println("A Constructor"); }
//}
//class B extends A {
//    B() { System.out.println("B Constructor"); }
//}
//public class Test {
//    public static void main(String[] args) {
//        new B(); 
//    }
//}
class Person {
    private String name = "John";
    public String getName() {
        return name;
    }
}
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getName());
    }
}






