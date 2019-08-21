package com.effective.java.chapter3.item10.inheritance;

import com.effective.java.chapter3.item10.Color;
import com.effective.java.chapter3.item10.Point;

import java.util.HashMap;
import java.util.Objects;

public class ColorPoint extends Point {

    private final Color color;
    public ColorPoint(int x, int y,Color color) {
        super(x, y);
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        if (!super.equals(o)) return false;
        ColorPoint that = (ColorPoint) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }


    public static void main(String[] args) {

        // First equals function violates symmetry (Page 42)
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp) + " " + cp.equals(p));

        // Second equals function violates transitivity (Page 42)
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.printf("%s %s %s%n",
                p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }
}
