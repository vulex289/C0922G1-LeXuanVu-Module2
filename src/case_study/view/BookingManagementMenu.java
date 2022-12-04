package case_study.view;

import java.util.Scanner;

public class BookingManagementMenu {
    private final Scanner scanner=new Scanner(System.in);
    int option=-1;
    public void showBookingManagement() {
       boolean isExit4 = true;
        while (isExit4) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tReturn main menu\n");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    isExit4 = false;
                    break;
                default:
                    System.out.println("Vui lòng bạn nhập đúng số trong menu");
            }
        }
    }
}
