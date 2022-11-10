package ss5acessmodifiedandstatic.excercise.xaydunglopchighitrongjava;

public class TestOfStudent {
    public static void main(String[] args) {
        Student st2=new Student("VU","C12");
        Student st3=new Student("VU","C12",31);
       st3.setName("HOA");
       st3.setClasses("C09");
        System.out.println(st3.toString());
    }
}
