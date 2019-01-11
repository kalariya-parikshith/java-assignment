package com.parikshith.assignment.singleton;

public class Singleton{

    String strVariable;
    private static Singleton obj;

    private Singleton() {}

    public static Singleton getInstance(){
        if(obj == null)
            obj = new Singleton();
        return obj;
    }

    public static Singleton objectOfThisClass(String strVariable){
        obj.strVariable = strVariable;
        return obj;
    }

    public void printString(){
        System.out.println("String: " + this.strVariable);
    }
}