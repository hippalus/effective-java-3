package com.effective.java.chapter2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;


public class Stack {

    private Object[] elements;
    private int size=0;
    private static final int DEFAULT_INITIAL_CAPACITY=16;

    public Stack() {

        elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++]=e;
    }
    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if(elements.length==size){
            elements= Arrays.copyOf(elements,2*size+1);
        }
    }

    public Object pop(){
        if (size==0) throw  new EmptyStackException();
        Object o= elements[--size];
        elements[size]=null; //Eliminate obsolete reference
        return o;

    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        int[] ints=new int[]{1,2,5,46,2,4,54,6,51,54};
        for ( int i=0;i<ints.length;i++){
            stack.push(ints[i]);
        }

        while (true){
            System.err.println(stack.pop());
        }
    }

}
