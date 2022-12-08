package case_study.view;

import case_study.controller.EmployeeManagementController;
import case_study.models.Person.Employee;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeManagementController employeeManagementController = new EmployeeManagementController();
    int option = -1;

    public void showEmployeeManagement() {
        boolean isExit1 = true;
        while (isExit1) {
            while (true) {
                System.out.println("1.Display list employees");
                System.out.println("2.Add new employee");
                System.out.println("3.Delete employee");
                System.out.println("4.Edit employee");
                System.out.println("5.Return main menu");
                try {
                    option = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            switch (option) {
                case 1:
                    List<Employee> employees = this.employeeManagementController.getInfor();
                    if (employees == null) {
                        break;
                    }
                    for (Employee e : employees) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào id");
                    int idCard = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào tên nhân viên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập vào ngày sinh nhật");
                    String birthday = scanner.nextLine();
                    System.out.println("Nhập vào giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập vào số CMND");
                    int CMND = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào số điện thoại");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào email");
                    String email = scanner.nextLine();
                    System.out.println("Nhập vào học vấn");
                    String level = scanner.nextLine();
                    System.out.println("Nhập vào vị trí");
                    String position = scanner.nextLine();
                    System.out.println("Nhập vào mức lương");
                    double salary = Double.parseDouble(scanner.nextLine());
                    Employee employee = new Employee(idCard, name, birthday, gender, CMND, phoneNumber, email, level, position, salary);
                    employeeManagementController.add(employee);
                    break;
                case 3:
                    System.out.println("Nhập vào id");
                    int deleteidCard = Integer.parseInt(scanner.nextLine());
                    employeeManagementController.delete(deleteidCard);
                    break;
                case 4:
                    System.out.println("Nhập vào id");
                    int newIdCard = Integer.parseInt(scanner.nextLine());
                    List<Employee> employees1 = employeeManagementController.getInfor();
                    int count = 0;
                    for (Employee emp : employees1) {
                        if (newIdCard != emp.getId()) {
                            count++;
                        }
                    }
                    if (count == employees1.size()) {
                        System.out.println("Bạn đã nhập sai id cần sửa");
                    } else {
                        System.out.println("Nhập vào tên nhân viên");
                        String newName = scanner.nextLine();
                        System.out.println("Nhập vào ngày sinh nhật");
                        String newBirthday = scanner.nextLine();
                        System.out.println("Nhập vào giới tính");
                        String newGender = scanner.nextLine();
                        System.out.println("Nhập vào số CMND");
                        int newCMND = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập vào số điện thoại");
                        int newPhoneNumber = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập vào email");
                        String newEmail = scanner.nextLine();
                        System.out.println("Nhập vào học vấn");
                        String newLevel = scanner.nextLine();
                        System.out.println("Nhập vào vị trí");
                        String newPosition = scanner.nextLine();
                        System.out.println("Nhập vào mức lương");
                        double newSalary = Double.parseDouble(scanner.nextLine());
                        Employee employee1 = new Employee(newIdCard, newName, newBirthday, newGender,
                                newCMND, newPhoneNumber, newEmail, newLevel, newPosition, newSalary);
                        this.employeeManagementController.update(employee1);
                    }
                    break;
                case 5:
                    isExit1 = false;
                    break;
                default:
                    System.out.println("Vui lòng bạn nhập đúng số trong menu");
            }
        }
    }
}
