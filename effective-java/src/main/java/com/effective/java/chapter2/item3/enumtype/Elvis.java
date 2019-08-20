package com.effective.java.chapter2.item3.enumtype;
//a single-element enum  type is often the best way to implement a singleton
public enum Elvis {

    INSTANCE;
    public void leaveTheBuilding(){
   System.out.println("Whoa baby, I'm outta here!");

    }

    public static void main(String[] args) {
        Elvis.INSTANCE.leaveTheBuilding();
    }
}
