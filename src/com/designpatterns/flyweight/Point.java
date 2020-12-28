package com.designpatterns.flyweight;

public class Point {
    private int x;
    private int y;
    private PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", pointIcon=" + pointIcon +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PointIcon getPointIcon() {
        return pointIcon;
    }
}
