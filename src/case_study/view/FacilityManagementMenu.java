package case_study.view;

import case_study.FileUtils.Regex.RegexFacility;
import case_study.controller.FacilityManagementController;
import case_study.models.Facility.Facility;
import case_study.models.Facility.Room;
import case_study.models.Facility.Villa;

import java.util.Map;
import java.util.Scanner;

public class FacilityManagementMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final FacilityManagementController facilityManagementController = new FacilityManagementController();
    int option = -1;
    private final RegexFacility regexFacility=new RegexFacility();

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
                    Map<Facility, Integer> facilityIntegerMap = facilityManagementController.getInfor1();
                    for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                        System.out.println(element.getKey() + "Used" + element.getValue());
                    }
                    break;
                case 2:
                    showAddRoomAndVilla();
                    break;
                case 3:
                    facilityManagementController.showFacilityMaintenance();
                    break;
                case 4:
                    isExit3 = false;
                    break;
                default:
                    System.out.println("Vui lòng bạn nhập đúng số trong menu");
            }
        }
    }

    public void showAddRoomAndVilla() {
        boolean isExit4 = true;
        while (isExit4) {
            System.out.println("1.Add new Villa");
            System.out.println("2.Add new Room");
            System.out.println("3.Return");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Nhập vào id");
                    String idVilla=regexFacility.inputIdVilla();
                    System.out.println("Mời bạn nhập dịch vụ ");
                    String nameService=regexFacility.inputNameService();
                    System.out.println("Mời bạn nhập diện tích phòng ");
                   int areaVillaRoom = regexFacility.inputArea();
                    System.out.println("Mời bạn nhập giá phòng");
                    double cost = regexFacility.inputCost();
                    System.out.println("Mời bạn nhập số lượng người");
                    int maxPeople =regexFacility.inputMaxPeople();
                    System.out.println("Mời bạn nhập kiểu thuê");
                    String rentType=regexFacility.inputRentType();
                    System.out.println("Mời bạn nhập tiêu chuẩn phòng");
                    String standardRoom=regexFacility.inputStandardService();
                    System.out.println("Mời bạn nhập diện tích hồ bơi");
                    double areaPool = regexFacility.inputAreaPool();
                    System.out.println("Số tầng");
                    int floorNumber = regexFacility.inputNumfloor();
                    Villa villa = new Villa(idVilla,nameService, areaVillaRoom, cost, maxPeople, rentType,standardRoom, areaPool, floorNumber);
                    facilityManagementController.addNewVilla(villa);
                    break;
                case 2:
                    System.out.println("Nhập vào id");
                    String idRoom = regexFacility.inputIdRoom();
                    System.out.println("Mời bạn nhập dịch vụ ");
                    String nameSericeRoom = regexFacility.inputNameService();
                    System.out.println("Mời bạn nhập diện tích phòng ");
                    int areaRoom = Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời bạn nhập giá phòng");
                    double costRoom = Double.parseDouble(scanner.nextLine());
                    System.out.println("Mời bạn nhập số lượng người");
                    int maxPeopleRoom = Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời bạn nhập kiểu thuê");
                    String renTypeRoom = regexFacility.inputRentType();
                    System.out.println("Mời bạn nhập tiêu chuẩn phòng");
                    String freeService = regexFacility.inputFreeService();
                    Room room = new Room(idRoom, nameSericeRoom, areaRoom, costRoom, maxPeopleRoom, renTypeRoom, freeService);
                    facilityManagementController.addNewRoom(room);
                    break;
                case 3:
                    isExit4 = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập đúng sô");
            }
        }
    }
}
