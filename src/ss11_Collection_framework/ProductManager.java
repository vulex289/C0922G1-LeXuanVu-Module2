package ss11_Collection_framework;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);

    List<Product> productArrayList = new ArrayList<>();

    public ProductManager() {
    }

    public int inputId() {
        System.out.println("Mời bạn nhập id");
        return Integer.parseInt(sc.nextLine());
    }

    public String inputName() {
        System.out.println("Mời bạn nhập name");
        return sc.nextLine();
    }

    public double inputPrice() {
        System.out.println("Mời bạn nhập price");
        return Double.parseDouble(sc.nextLine());
    }

    public void add() {
        int id = inputId();
        String name = inputName();
        double price = inputPrice();
        Product product = new Product(id, name, price);
        productArrayList.add(product);
    }

    public void edit(int id) {
        int size = productArrayList.size();
        for (int i = 0; i < size; i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.get(i).setId(inputId());
                productArrayList.get(i).setName(inputName());
                productArrayList.get(i).setPrice(inputPrice());
                break;
            }
        }
    }

    public void delete(int id) {
        int size = productArrayList.size();
        Product product = null;
        for (int i = 0; i < size; i++) {
            if (productArrayList.get(i).getId() == id) {
                product = productArrayList.get(i);
                break;
            }
        }
        if (product != null) {
            productArrayList.remove(product);
            show();
        }
    }

    public void show() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i));
        }

    }

    public void findName(String name) {
        boolean isExisted=true;
        int size = productArrayList.size();
        for (int i = 0; i < size; i++) {
            if (productArrayList.get(i).getName().equals (name)) {
                isExisted=false;
                System.out.println(productArrayList.get(i));
                break;
            }
        }
        if(isExisted){
            System.out.println("Your name is not excited");
        }
    }
        public void sortProductByPriceToUp () {
            Collections.sort(productArrayList, new SortProductsByAscendingPrice());
            show();
        }
        public void sortProductByPriceToDown () {
            Collections.sort(productArrayList, new SortProductsByDescendingPrice());
            show();
        }

    }
