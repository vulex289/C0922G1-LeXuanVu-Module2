//package ss16.Product_Management.View;
//
//import ss16.Product_Management.controller.ProductController;
//import ss16.Product_Management.model.Product;
//import ss16.Product_Management.service.ProductService;
//
//import java.util.Scanner;
//
//public class View {
//
//    private final ProductController productController = new ProductController();
//    private final Scanner sc = new Scanner(System.in);
//    public void displayMenu() {
//        showMenu();
//        int choose = 0;
//        boolean isExit = true;
//        while (isExit) {
//            System.out.println("Mời bạn nhập lựa chọn");
//            choose = Integer.parseInt(sc.nextLine());
//            switch (choose) {
//                case 1:
//                    for (Product product:) {
//
//                    }
//                   productController.add(Product product);
//                    break;
//                case 2:
//                    //productController.update(); // Product
//                    break;
//
//                case 3:
//                    productController.delete(ProductService.inputID());
//                    break;
//                case 4:
//                    productController.getProducts();
//                    break;
//                case 5:
//                    System.out.println("Exited...");
//                    isExit = false;
//                    break;
//                default:
//                    System.out.println("Bạn đã nhập sai");
//            }
//        }
//    }
//
//    public static void showMenu() {
//        System.out.println("-----Menu-----");
//        System.out.println("1.Mời bạn thêm sản phẩm");
//        System.out.println("2.Sửa sản phẩm theo id");
//        System.out.println("3.Xóa sản phẩm theo id");
//        System.out.println("4.Hiển thị sản phẩm");
//        System.out.println("5.Exit");
//    }
//}
