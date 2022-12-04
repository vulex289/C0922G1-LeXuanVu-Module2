package giaiThuat.baitapthem;

import java.util.ArrayList;
import java.util.List;

public class ControllerCat {
    public static void main(String[] args) {
        List<MyCat> catList = new ArrayList<>();
//        List<MyCat> list = new ArrayList<>();
        MyCat myCat1 = new MyCat("tom", "1");
        MyCat myCat2 = new MyCat("ki", "2");
        MyCat myCat3 = new MyCat("sen", "3");
        catList.add(myCat1);
        catList.add(myCat2);
        catList.add(myCat3);
        String id = "1";
//        for (int i=0;i<3;i++) {
//            if (id.equals(catList.get(i).getId())) {
//                catList.remove(catList.get(i));
//                break;
//            }
//        }
        for (int i=0;i<catList.size();i++) {
            System.out.println(catList.get(i).getId()+catList.get(i).getName());
        }
    }
}