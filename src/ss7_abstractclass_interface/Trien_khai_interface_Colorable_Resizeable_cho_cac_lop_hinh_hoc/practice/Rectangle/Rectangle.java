package ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Rectangle;

import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Colorable;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.shape.Shape;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Resizeable;

public class Rectangle extends Shape implements Resizeable, Colorable {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
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
    public double getArea(){
        return this.length*this.width;
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

    @Override
    public void reside(double percent) {
     length*=length*percent/100;
     width*=width*percent/100;
    }

    @Override
    public String howToColor() {
        return "Retangle:fill blue";
    }
}
