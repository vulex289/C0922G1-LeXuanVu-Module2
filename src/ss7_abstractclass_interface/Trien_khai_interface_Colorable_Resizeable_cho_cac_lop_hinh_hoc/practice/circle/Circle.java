package ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.circle;

import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Colorable;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Resizeable;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.shape.Shape;

public class Circle extends Shape implements Resizeable, Colorable {
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius()*Math.PI*getRadius();
    }
    public double getPerimeter() {
        return 2*getRadius()*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius="+getRadius()+"" +
                ",which is a subclass of"+super.toString();
    }

    @Override
    public void reside(double percent) {
     this.radius=this.radius*percent/100;
    }

    @Override
    public String howToColor() {
        return "Circle:fill pink";
    }
}
