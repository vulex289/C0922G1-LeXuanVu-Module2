package ss6inheritance.excercise.CircleAndCylinder.Cylinder;

import ss6inheritance.excercise.CircleAndCylinder.Cirlce.Circle;

public class Cylinder extends Circle {
    private double length = 1.0;

    public Cylinder() {
    }

    public Cylinder(double length, double radius, String color) {
        super(radius, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getAreaCylinder() {
        return Math.PI * getRadius() * getRadius() * length;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +""+","+
                 "areaCylinder="+""+getAreaCylinder()+"which is a subclass"+super.toString()+"}";
    }
}
