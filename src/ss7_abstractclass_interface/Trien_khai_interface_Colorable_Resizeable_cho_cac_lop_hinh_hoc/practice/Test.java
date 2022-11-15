package ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice;


import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.shape.Shape;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Rectangle.Rectangle;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.Square.Square;
import ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.circle.Circle;

public class Test {
    public static void main(String[] args) {
        double percent = Math.random() * 100 + 1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(4);
        for (int i=0;i<shapes.length;i++) {
            if (shapes[i] instanceof Circle) {
                Circle c1 = (Circle) shapes[i];
                c1.reside(percent);
                System.out.println("Area of Circle:");
                System.out.println(c1.getArea());
                System.out.println(c1.howToColor());
            }
            else if(shapes[i] instanceof Rectangle){
                Rectangle r1 = (Rectangle) shapes[i];
                r1.reside(percent);
                System.out.println("Area of Rectangle");
                System.out.println(r1.getArea());
                System.out.println(r1.howToColor());
            }
            else {
                Square sq1=(Square) shapes[i];
                sq1.reside(percent);
                System.out.println("Area of Square:");
                System.out.println(sq1.getArea());
                System.out.println(sq1.howToColor());
            }

        }
    }
}

