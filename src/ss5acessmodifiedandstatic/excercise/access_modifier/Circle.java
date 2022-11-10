package ss5acessmodifiedandstatic.excercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    String color = "red";

    Circle() {
    }


    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return  2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
