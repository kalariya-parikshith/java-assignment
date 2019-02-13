package com.parikshith.assignment.singleton;

public class Singleton{

    String str;
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public static Singleton objectOfThisClass(String str){
        singleton.str = str;
        return singleton;
    }

    public void printString(){
        System.out.println("String: " + this.str);
    }
}
