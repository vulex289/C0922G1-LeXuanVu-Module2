package ss6inheritance.excercise.Point2DAndPoint3D.Point3D;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D1=new Point3D(2.0f,4.0f,5.0f);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }
}
