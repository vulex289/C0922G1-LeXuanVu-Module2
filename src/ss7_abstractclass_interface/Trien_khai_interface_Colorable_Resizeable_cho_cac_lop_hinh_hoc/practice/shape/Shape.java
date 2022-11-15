package ss7_abstractclass_interface.Trien_khai_interface_Colorable_Resizeable_cho_cac_lop_hinh_hoc.practice.shape;

public abstract class  Shape  {
    private String color="green";
    private boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public Shape(String color){
        this.color=color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
@Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", filled=" + filled
                ;
    }


}

