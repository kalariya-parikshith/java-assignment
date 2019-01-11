package com.parikshith.assignment.main;

import com.parikshith.assignment.data.DataVariable;
import com.parikshith.assignment.singleton.Singleton;

public class Main {
    public static void main(String a[]){
        System.out.println("HI");
        DataVariable dataVariable = new DataVariable();
        dataVariable.printMemberVariables();
        dataVariable.printLocalVariables();
        Singleton singleton = Singleton.getInstance();
        singleton.printString();

    }
}
