package ss6inheritance.excercise.CircleAndCylinder.Cirlce;

import ss6inheritance.excercise.CircleAndCylinder.Cylinder.Cylinder;

public class Testcircle {
    public static void main(String[] args) {
        Circle c2=new Circle(5,"blue");
        Circle circle1 = new Cylinder(4.0, 5, "green");
        if (c2 instanceof Circle) {
            System.out.println(true);
        } else {
            System.out.println(circle1.toString());
        }
    }
}
