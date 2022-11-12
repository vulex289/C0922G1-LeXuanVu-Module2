package ss6inheritance.excercise.Point2DAndPoint3D.Poidt2D;
import java.util.Arrays;
public class TestPoint2D {
    public static void main(String[] args) {
     Point2D point2D1=new Point2D(2.0f,3.0f);
        System.out.println(Arrays.toString(point2D1.getXY()));
        point2D1.setXY(5.0f,4.0f);
        System.out.println(Arrays.toString(point2D1.getXY()));
    }
}
