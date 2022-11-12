package ss6inheritance.excercise.CircleAndCylinder.Cirlce;

public class Circle {
    private double radius=1.0;
    private String color="black";
    public Circle(){}
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

