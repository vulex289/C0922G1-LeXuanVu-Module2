package case_study.view;

import java.util.Scanner;

public class PromotionManagementMenu {
    private final Scanner scanner=new Scanner(System.in);
    int option=-1;
    public void showPromotionManagement() {
        boolean isExit5 = true;
        while (isExit5) {
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    isExit5 = false;
                    break;
                default:
                    System.out.println("Vui lòng bạn nhập đúng số trong menu");
            }
        }
    }
}
