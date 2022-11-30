//package ss16.Product_Management.service;
//
//import ss16.Product_Management.model.Product;
//import ss16.Product_Management.service.FileUtils;
//import ss16.Product_Management.service.IProductService;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class ProductService implements IProductService {
//    public static final String FILE_NAME = "D:\\codegym\\module02\\src\\ss16\\Product_Management\\reponsitory\\file.csv";
//    private final FileUtils fileUtils=new FileUtils();
//
//    @Override
//    public void add(Product product) {
//       List<Product>products=fileUtils.readFile(FILE_NAME);
////       for(Product product1:products){
////           if(Objects.equals(product1.getId(), product.getId())){
////
////           }
////       }
//       products.add(product);
//        fileUtils.writeFile(FILE_NAME,products);
//    }
//
//    @Override
//    public void update(Product product) {
//    List<Product>products=fileUtils.readFile(FILE_NAME);
//        for (Product product1:products) {
//            if(Objects.equals(product1.getId(), product.getId())){
//                product1.setName(product.getName());
//                product1.setMaker(product.getMaker());
//                product1.setPrice(product.getPrice());
//            }
//        break;
//        }
//
//    @Override
//    public List<Product> getProducts() {
//        return productList;
//    }
//
//    public  void delete(String id) {
//        Product product = null;
//        for (int i = 0; i < productList.size(); i++)
//            if (productList.get(i).getId() == id) {
//                product = productList.get(i);
//                break;
//            }
//        if (product != null) {
//            productList.remove(product);
//            FileUtils.writeFile(FILE_NAME, productList);
//        } else {
//            System.out.println("Bạn đã nhập sai");
//        }
//    }
//}
