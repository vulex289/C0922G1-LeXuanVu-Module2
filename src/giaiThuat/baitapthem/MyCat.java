package giaiThuat.baitapthem;

import java.util.Arrays;
import java.util.Scanner;

public class MyCat {
    private String name;

    public MyCat(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

            MyCat myCat = new MyCat("Kitty");
            System.out.println("Before call process: " + myCat.getName());
            process(myCat);
            System.out.println("After call process: " + myCat.getName());
        }
        public static void process(MyCat myCat) {

            myCat.setName("Doraemon");
            myCat=new MyCat("DOraemon");      }
    }

