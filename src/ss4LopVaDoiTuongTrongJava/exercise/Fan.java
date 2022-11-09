package ss4LopVaDoiTuongTrongJava.exercise;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed=SLOW;
    private boolean on=true;
    private double radian;
    private String color;
    String result;

    public Fan(int speed, boolean on, double radian, String color) {
        this.speed = speed;
        this.on = on;
        this.radian = radian;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadian() {
        return radian;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int value) {
        this.speed = value;
    }

    public void setOn(boolean value) {
        this.on = value;
    }

    public void setRadian(double value) {
        this.radian = value;
    }

    public void setColor(String value) {
        this.color = value;
    }

    @Override
    public String toString() {
        if (on==false) {
            result= "Fan{" +
                    "on=" + on +
                    ", radian=" + radian +
                    ", color='" + color + '\'' +
                    "Fan is off" +
                    '}';
        } else {
            result= "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radian=" + radian +
                    ", color='" + color + '\'' +
                    "Fan is on" + '}';
        }
        return result;
    }
}

