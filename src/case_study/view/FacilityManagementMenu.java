package case_study.view;

import java.util.Scanner;

public class FacilityManagementMenu {
    private final Scanner scanner=new Scanner(System.in);
    int option=-1;
    public void showFacilityManagement() {
       boolean isExit3 = true;
        while (isExit3) {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    isExit3 = false;
                    break;
                default:
                    System.out.println("Vui lòng bạn nhập đúng số trong menu");
            }
        }
    }
}
