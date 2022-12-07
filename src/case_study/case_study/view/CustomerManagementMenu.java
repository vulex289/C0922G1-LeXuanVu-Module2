package case_study.case_study.view;

import case_study.controller.CustomerManagementController;
import case_study.models.Person.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerManagementMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final CustomerManagementController customerManagementController=new CustomerManagementController();
    int option = -1;
    public void showCustomerManagement() {
        boolean isExit2 = true;
        while (isExit2) {
            while (true) {
                System.out.println("1.Display list customers");
                System.out.println("2.Add new customer");
                System.out.println("3.Edit customer");
                System.out.println("4.Return main menu");
                try {
                    option = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (option) {
                case 1:
                    List<Customer> customers=customerManagementController.getInfor();
                    for (Customer customer:customers) {
                        if (customer==null){
                            break;
                        }
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào id khách hàng");
                    int idCard=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tên khách hàng");
                    String name=scanner.nextLine();
                    System.out.println("Nhập vào ngày sinh nhật");
                    String birthday=scanner.nextLine();
                    System.out.println("Nhập vào giới tính");
                    String gender=scanner.nextLine();
                    System.out.println("Nhập vào số CMND");
                    int CMND=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào số điện thoại");
                    int phoneNumber=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào email");
                    String email=scanner.nextLine();
                    System.out.println("Nhập vào loại khách");
                    String guestType=scanner.nextLine();
                    System.out.println("Nhập vào địa chỉ của khách");
                    String address=scanner.nextLine();
                    System.out.println("Nhập vào mức lương");
                   Customer customer=new Customer(idCard,name,birthday,gender,CMND,phoneNumber,email,guestType,address);
                   customerManagementController.add(customer);
                    break;
                case 3:
                    System.out.println("Nhập vào id khách hàng");
                    int newIdCard=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tên khách hàng");
                    String newName=scanner.nextLine();
                    System.out.println("Nhập vào ngày sinh nhật");
                    String newBirthday=scanner.nextLine();
                    System.out.println("Nhập vào giới tính");
                    String newGender=scanner.nextLine();
                    System.out.println("Nhập vào số CMND");
                    int newCMND=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào số điện thoại");
                    int newPhoneNumber=Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào email");
                    String newEmail=scanner.nextLine();
                    System.out.println("Nhập vào loại khách");
                    String newGuestType=scanner.nextLine();
                    System.out.println("Nhập vào địa chỉ của khách");
                    String newAddress=scanner.nextLine();
                    System.out.println("Nhập vào mức lương");
                    Customer newCustomer=new Customer(newIdCard,newName,newBirthday,newGender,newCMND,newPhoneNumber,newEmail,
                            newGuestType,newAddress);
                    customerManagementController.update(newCustomer);
                    break;
                case 4:
                    isExit2 = false;
                    break;
                default:
                    System.out.println("Vui lòng bạn nhập đúng số trong menu");
            }
        }
    }
}
