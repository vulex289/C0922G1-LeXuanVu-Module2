package case_study.FileUtils.Regex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexFacility {
    public static final String REGEX_VILLA = "^SVVL-\\d{4}$";
    public static final String REGEX_ROOM = "^SVRO-\\d{4}$";
    public static final String REGEX_NAME_SERVICE = "^Villa|Room$";
    public static final String REGEX_NAME_RENTYPE = "^Month|Day|Year$";
    public static final String REGEX_NAME_UPPER = "^[A-Z][a-z0-9]+$";
    public static final String REGEX_MAX_PEOPLE = "^[1-9]|1[0-9]{1}$";
    public static final String REGEX_AREA_POOL = "^[1-9]+$";
    public static final String REGEX_AREA_ROOM = "^([0-9]|\\d+.\\d+){1,2}$";
    public static final String REGEX_COST = "^([0-9]|\\d+.\\d+){1,2}$";
    public static final String REGEX_NUM_FLOOR = "^[1-9]+$";

    public static final String REGEX_BIRTHDAY = "^([1-9]|1\\d|2\\d|3[0-1]){1}[-|/]([1-9]|1[0-2]){1}[-|/]202[2-9]{1}$";
    static Map<String, String> mapRegex = new LinkedHashMap<>();

    static {
        mapRegex.put(REGEX_VILLA, "Bạn đã nhập sai,mời bạn nhập lại đúng định dạng SVVL-XXXX(number)");
        mapRegex.put(REGEX_ROOM, "Bạn đã nhập sai,mời bạn nhập lại đúng định dạng SVRO-XXXX(number)");
        mapRegex.put(REGEX_NAME_SERVICE, "Bạn đã nhập sai,mời bạn nhập lại đúng định dạng (Villa|Room)");
        mapRegex.put(REGEX_NAME_RENTYPE, "Bạn đã nhập sai,mời bạn nhập lại đúng định dạng (Day|Month|Year)");
        mapRegex.put(REGEX_NAME_UPPER, "Bạn đã nhập sai,mời bạn nhập lại đúng định dạng viết hoa chữ đầu");
        mapRegex.put(REGEX_MAX_PEOPLE, "Bạn đã nhập sai,mời bạn nhập lại số người lớn hơn 0 và nhỏ hơn 20 ");
        mapRegex.put(REGEX_AREA_POOL, "Bạn đã nhập sai,mời bạn nhập lại diện tích hồ bơi lớn hơn 30 ");
        mapRegex.put(REGEX_COST, "Bạn đã nhập sai,mời bạn nhập lại giá lớn hơn 0");
        mapRegex.put(REGEX_NUM_FLOOR, "Bạn đã nhập sai,mời bạn nhập lại số tầng lớn hơn 0");
        mapRegex.put(REGEX_BIRTHDAY, "Bạn đã nhập sai,mời bạn nhập lại ngày sinh nhật ");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputValue(String regex) {
        String value = scanner.nextLine();
        while (!(Pattern.matches(regex, value))) {
            System.out.println(mapRegex.get(regex));
            value = scanner.nextLine();
        }
        return value;
    }
}
