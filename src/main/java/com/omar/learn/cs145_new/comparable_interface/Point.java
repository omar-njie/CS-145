package com.omar.learn.cs145_new.comparable_interface;

/**
 * @author omar
 * @version 5/19/23
 */
public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        setLocation(x, y);
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }


    @Override
    public int compareTo(Point o) {
        double distanceToOrigin = distance(new Point());
        double otherDistanceToOrigin = o.distance(new Point());
        return Double.compare(distanceToOrigin, otherDistanceToOrigin);
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
