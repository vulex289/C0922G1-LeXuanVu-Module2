package case_study.FileUtils.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexFacility {
    public static final String REGEX_VILLA = "^SVVL-\\d{4}$";
    public static final String REGEX_ROOM = "^SVRO-\\d{4}$";
    public static final String REGEX_NAME_SERVICE = "^Villa|Room$";
    public static final String REGEX_NAME_RENTYPE = "^Month|Day|Year$";
    public static final String REGEX_NAME_UPPER = "^[A-Z][a-z0-9]+$";


    private static final Scanner scanner = new Scanner(System.in);

    public String inputIdVilla() {

        String idVilla = scanner.nextLine();
        while (!(Pattern.matches(REGEX_VILLA, idVilla))) {
            System.out.println("Bạn đã nhập sai,mời bạn nhập lại đúng định dạng SVVL-XXXX(number)");
            idVilla = scanner.nextLine();
        }
        return idVilla;
    }

    public String inputIdRoom() {
        String idRoom = scanner.nextLine();
        while (!(Pattern.matches(REGEX_ROOM, idRoom))) {
            System.out.println("Bạn đã nhập sai,mời bạn nhập lại đúng định dạng SVRO-XXXX(number)");
            idRoom = scanner.nextLine();
        }
        return idRoom;
    }

    public String inputNameService() {
        String nameService = scanner.nextLine();
        while (!(Pattern.matches(REGEX_NAME_SERVICE, nameService))) {
            System.out.println("Bạn đã nhập sai,mời bạn nhập lại đúng tên dịch vụ là Villa hoặc Room");
            nameService = scanner.nextLine();
        }
        return nameService;
    }
    public double inputAreaPool() {
        double areaPool;
        while (true) {
            try {
                areaPool = Double.parseDouble(scanner.nextLine());
                if (areaPool > 30) {
                    break;
                } else {
                    System.out.println("Bạn phải nhập diện tích hơn 30m2");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return areaPool;
    }

    public String inputRentType() {
        String rentType = scanner.nextLine();
        while (!(Pattern.matches(REGEX_NAME_RENTYPE, rentType))) {
            System.out.println("Bạn đã nhập sai,mời bạn nhập lại");
            rentType = scanner.nextLine();
        }
        return rentType;
    }

    public int inputMaxPeople() {
        int maxPeople;
        while (true) {
            try {
                maxPeople = Integer.parseInt(scanner.nextLine());
                if (maxPeople > 0 && maxPeople < 20) {
                    break;
                } else {
                    System.out.println("Số người phải lớn hơn 0 và nhỏ hơn 20 người");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return maxPeople;
    }

    public int inputArea() {
        int area;
        while (true) {
            try {
                area = Integer.parseInt(scanner.nextLine());
                if (area > 0) {
                    break;
                } else {
                    System.out.println("Diện tích phải lớn hn 0");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return area;
    }

    public int inputNumfloor() {
        int numFloor;
        while (true) {
            try {
                numFloor = Integer.parseInt(scanner.nextLine());
                if (numFloor > 0 && numFloor < 5) {
                    break;
                } else {
                    System.out.println("Số tầng lớn hơn 0 và nhỏ hơn 5 ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return numFloor;
    }
    public String inputFreeService() {
        String freeService = scanner.nextLine();
        while (!(Pattern.matches(REGEX_NAME_UPPER, freeService))) {
            System.out.println("Bạn đã nhập sai,mời bạn nhập lại");
            freeService = scanner.nextLine();
        }
        return freeService;
    }
    public int inputCost() {
        int cost;
        while (true) {
            try {
                cost = Integer.parseInt(scanner.nextLine());
                if (cost > 0 ) {
                    break;
                } else {
                    System.out.println("Giá tiền phải lớn hơn 0 ");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return cost;
    }
    public String inputStandardService() {
        String standardService = scanner.nextLine();
        while (!(Pattern.matches(REGEX_NAME_UPPER, standardService))) {
            System.out.println("Bạn đã nhập sai,mời bạn nhập lại");
            standardService = scanner.nextLine();
        }
        return standardService;
    }
}