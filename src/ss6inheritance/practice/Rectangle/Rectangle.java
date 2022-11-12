package ss6inheritance.practice.Rectangle;

import ss6inheritance.practice.shape.Shape;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;

    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
@Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'+",which is a subclass of"+super.toString();
    }
    public void method(){
        System.out.println("Hi");
    }
}
