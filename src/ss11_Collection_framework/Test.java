package ss11_Collection_framework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        showMenu();
        int productId;
        String productName;
        boolean isStop=true;
        while (isStop) {
        System.out.println("Mời bạn nhập lựa chọn");
        int choose = Integer.parseInt(sc.nextLine());

        switch (choose) {
            case 1:
                productManager.add();
                break;
            case 2:
                productId = productManager.inputId();
                productManager.edit(productId);
                break;
            case 3:
                productId = productManager.inputId();
                productManager.delete(productId);
                break;
            case 4:
                productName = productManager.inputName();
                productManager.findName(productName);
                break;
            case 5:
                productManager.sortProductByPriceToUp();
                break;
            case 6:
                productManager.sortProductByPriceToDown();
                break;
            case 7:
                productManager.show();
                break;
            case 8:
                isStop=false;
                System.out.println("Exit");
                break;
            default:
                System.out.println("Mời bạn nhập đúng số trong menu");
        }

    }

    }
    public static void showMenu() {
        System.out.println("--------Menu--------+\n1.Add product\n2.Edit product by id\n4.Find product by name" +
                "\n5.Display products by ascending price\n6.Display products by descending price\n7.Show all product");
    }
}
