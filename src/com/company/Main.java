package com.company;

// abstract class means existing in thought  or as  an ideA WITHOUT actual existence  || the sub-class actually provides implementation for all of the methods in parent class
// abstract method is that which is declared without any implementation

abstract class Parent{

    public Parent(){

        System.out.println("I am constructor of Base2");
    }

    public  void sayHello(){

        System.out.println("Hello");

    }

    abstract public void greet();
    abstract public void greet2();

}
    class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good AfterNoon!");
    }

}
  class Child2{
    public void good(){
        System.out.println("Hello good morning");
    }
  }

public class Main {

    public static void main(String[] args) {
	// write your code here

        Child c = new Child();        // this and below objects only executes only methods present inside parent abstract class
        Child cc = new Child();        // this and above objects only executes only methods present inside parent abstract class



//        Parent p = new Parent();        // NOT-ALLOWED Because we cannot create method of parent abstract class as it is just template it is not for implementation

    }
}
