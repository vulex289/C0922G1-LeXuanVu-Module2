package ss16.Product_Management.View;

import ss16.Product_Management.Exception.InputPriceException;
import ss16.Product_Management.controller.ProductController;
import ss16.Product_Management.model.Product;


import java.util.List;
import java.util.Scanner;

public class View {

    private final ProductController productController = new ProductController();
    private final Scanner sc = new Scanner(System.in);
    public void displayMenu() {
        int choose = -1;
        while (true) {
            showMenu();
            try {
            System.out.println("Mời bạn nhập lựa chọn");
                choose = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
            switch (choose) {
                case 1:
                    System.out.println("Mời bạn nhập vào id");
                    String id= sc.nextLine();
                    System.out.println("Mời bạn vào tên");
                    String name= sc.nextLine();
                    System.out.println("Mời bạn nhập vào hãng");
                    String maker=sc.nextLine();
                    System.out.println("Mời bạn nhập vào giá");
                    double price ;
                    while (true) {
                        try {
                            price = inputPrice();
                            Product product=new Product(id,name,maker,price);
                            productController.add(product);
                            break;
                        } catch (InputPriceException e) {
                            System.out.println(e.getMessage());
                        }catch (NumberFormatException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mời bạn nhập vào id");
                    String newId= sc.nextLine();
                    System.out.println("Mời bạn vào tên");
                    String newName= sc.nextLine();
                    System.out.println("Mời bạn nhập vào hãng");
                    String newMaker=sc.nextLine();
                    System.out.println("Mời bạn nhập vào giá");
                    double newPrice=Double.parseDouble(sc.nextLine());
                   Product product1=new Product(newId,newName,newMaker,newPrice);
                   productController.update(product1);
                    break;
                case 3:
                    System.out.println("Mời bạn nhập vào id");
                    String deleteId= sc.nextLine();
                    productController.delete(deleteId);
                    break;
                case 4:
                    List<Product>products=productController.getProducts();
                    for (Product p:products) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.println("Exited...");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bạn đã nhập sai");
            }
        }
    }

    public void showMenu() {
        System.out.println("-----Menu-----");
        System.out.println("1.Mời bạn thêm sản phẩm");
        System.out.println("2.Sửa sản phẩm theo id");
        System.out.println("3.Xóa sản phẩm theo id");
        System.out.println("4.Hiển thị sản phẩm");
        System.out.println("5.Exit");
    }
    public double inputPrice() throws InputPriceException,NumberFormatException {
        double price=Double.parseDouble(sc.nextLine());
        if(price<=0){
            throw new InputPriceException();
        }
        return price;
    }
}
