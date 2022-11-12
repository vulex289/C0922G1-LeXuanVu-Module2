package ss6inheritance.excercise.Point2DAndPoint3D.Point3D;

import ss6inheritance.excercise.Point2DAndPoint3D.Poidt2D.Point2D;

public class Point3D extends Point2D {
    float z;
    public Point3D(){}
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(),getY(),getZ()};
    }


    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }

    @Override
    public String toString() {
        return "Point3D{" +super.toString()+
                "z=" + z +"}"
                ;
    }
}
