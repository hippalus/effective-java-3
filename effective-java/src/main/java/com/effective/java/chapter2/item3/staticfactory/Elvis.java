package com.effective.java.chapter2.item3.staticfactory;

public class Elvis {
    private final static Elvis INSTANCE=new Elvis();

    private Elvis(){
    }
    public static Elvis getInstance(){
        return INSTANCE;
    }
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis.getInstance().leaveTheBuilding();
    }
}
