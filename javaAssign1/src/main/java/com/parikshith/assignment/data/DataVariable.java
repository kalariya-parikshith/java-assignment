package com.parikshith.assignment.data;

public class DataVariable{
    int integerVariable;
    char charVariable;

    public void printMemberVariables(){
        System.out.println("Integer: " + integerVariable);
        System.out.println("Character: " + charVariable);
    }

    public void printLocalVariables(){
        // int localInt;
        // char localChar;
        // System.out.println("Local integer: " + localInt);
        // System.out.println("Local character: " + localChar);
        System.out.println("Error when declaring uninitialized variabels inside method");
    }
}