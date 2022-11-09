package ss4LopVaDoiTuongTrongJava.exercise.QuadraticEquation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta;
    double x1;
    double x2;

    public QuadraticEquation(){}
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double value) {
        this.a = value;
    }

    public double getB() {
        return b;
    }

    public void setB(double value) {
        this.b = value;
    }

    public double getC() {
        return c;
    }

    public void setC(double value) {
        this.c = value;
    }

    public double getDiscriminant(){
        return delta = b*b - 4*a*c;
    }
    public double getX1(){
        return x1=(-b+Math.sqrt(delta))/(2*a);
    }
    public double getX2(){
        return x2=(-b-Math.sqrt(delta))/(2*a);
    }
    @Override
    public String toString(){
        return "a:\n"+a+"\n"+"b:\n"+b+"\n"+"c:\n"+c+"\n"+"delta\n"+getDiscriminant();
    }
}
