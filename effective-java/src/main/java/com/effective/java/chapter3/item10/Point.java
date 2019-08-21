package com.effective.java.chapter3.item10;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

  /*  // One-line hashCode method - mediocre performance
   @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }*/

    @Override
    public int hashCode() {
        return 31*x+y;
    }
}
