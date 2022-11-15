package ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Square;

import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Colorable;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Resizeable;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.shape.Shape;

public class Square extends Shape implements Resizeable, Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){}
    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public double getArea(){
        return this.side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString();
    }

    @Override
    public void reside(double percent) {
        side=side*percent/100;

    }

    @Override
    public String howToColor() {
        return "Square:fill red";
    }
}

