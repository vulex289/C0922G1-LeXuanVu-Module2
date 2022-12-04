package case_study.view;

import java.util.Scanner;

public class FuramaView {
    int optionMenu;
    boolean isExit;
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeManagementMenu employeeManagementMenu = new EmployeeManagementMenu();
    private final CustomerManagementMenu customerManagementMenu = new CustomerManagementMenu();
    private final FacilityManagementMenu facilityManagementMenu = new FacilityManagementMenu();
    private final BookingManagementMenu bookingManagementMenu = new BookingManagementMenu();
    private final PromotionManagementMenu promotionManagementMenu = new PromotionManagementMenu();

    public void displayMainMenu() {
        isExit = true;
        while (true) {
            showMenu();
            optionMenu = Integer.parseInt(scanner.nextLine());
            switch (optionMenu) {
                case 1:
                    employeeManagementMenu.showEmployeeManagement();
                    break;
                case 2:
                    customerManagementMenu.showCustomerManagement();
                    break;
                case 3:
                    facilityManagementMenu.showFacilityManagement();
                    break;
                case 4:
                    bookingManagementMenu.showBookingManagement();
                    break;
                case 5:
                    promotionManagementMenu.showPromotionManagement();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bạn nhập sai số trong menu");
            }
        }
    }

    public void showMenu() {
        System.out.println("Welcome to Furama resort!!!");
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Exit");
    }
}
