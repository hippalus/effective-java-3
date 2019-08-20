package com.effective.java.chapter2.item4;

//Non instantiable utility class
public class UtilityClass {
    //Suppress default constructor for noninstantiability
    private UtilityClass(){
        throw  new AssertionError();//  The AssertionError isn’t strictly required
    }

    public static void print(String message){
        System.out.println(message);
    }

}
class Main{
    public static void main(String[] args) {
        UtilityClass.print("Habip Hakan Isler");
    }
        }
