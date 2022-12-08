package giaiThuat;

import java.util.*;

public class FindString {
    public static void main(String[] args) {
        // strs = ["flower","flow","flight"]
        //Viết hàm tìm chuỗi tiền tố chung dài nhất trong một mảng các chuỗi.
        //Nếu không có tiền tố chung, hãy trả về một chuỗi trống
        String[] arr = {"flower", "flow", "flight"};
        String a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        String[] line = a.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        int count[] = new int[128];
        for (int i = 0; i < line.length; i++) {
            if (map.containsKey(line[i])) {
                count[a.codePointAt(i)]++;
            } else {
                count[a.codePointAt(i)] = 1;
            }
            map.put(line[i], count[a.codePointAt(i)]);
        }
        int countS = 0;
        for (Map.Entry m : map.entrySet()) {
            if (m.getValue().equals(arr.length)) {
                System.out.print(m.getKey());
            } else {
                countS++;
            }
        }
        if (countS == map.size()) {
            System.out.println("''");
        }
    }
}
