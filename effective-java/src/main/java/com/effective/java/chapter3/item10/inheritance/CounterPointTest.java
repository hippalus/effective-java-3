package com.effective.java.chapter3.item10.inheritance;

import com.effective.java.chapter3.item10.Point;

import java.util.Set;

public class CounterPointTest {


    // Initialize unitCircle to contain all Points on the unit circle

    private static  final Set<Point> unitCircle=Set.of( new Point( 1,  0), new Point( 0,  1),
            new Point(-1,  0), new Point( 0, -1));


    public static void main(String[] args) {
        Point p1=new Point(1,0);
        Point p2=new CounterPoint(1,0);

        // Prints true
        System.out.println(unitCircle.contains(p1));
        System.out.println(unitCircle.contains(p2));
    }
}
