package ss16.Product_Management.service.impl;

import ss16.Product_Management.Exception.ExistedProductException;
import ss16.Product_Management.Exception.NotFoundProductException;
import ss16.Product_Management.model.Product;
import ss16.Product_Management.service.IProductIOFile;
import ss16.Product_Management.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductServiceImpl implements IProductService {
    private static final String FILE_NAME = "D:\\codegym\\module02\\src\\ss16\\Product_Management\\data\\file.csv";
    IProductIOFile iProductIOFile=new ProductIOFileImpl();

    @Override
    public void add(Product product) throws ExistedProductException {
        List<Product> productList = new ArrayList<>();
        iProductIOFile.writeFile(FILE_NAME, productList);
        for (Product product1:productList) {
            if(Objects.equals(product.getId(), product1.getId())){
                throw new ExistedProductException();
            }
        }
        productList.add(product);
        iProductIOFile.writeFile(FILE_NAME,productList);
    }

    @Override
    public void update(Product product) {
        List<Product>products=iProductIOFile.readFile(FILE_NAME);
        for(Product product1:products){
            if(Objects.equals(product1.getId(), product.getId())){
                product1.setName(product.getName());
                product1.setMaker(product.getMaker());
                product1.setPrice(product.getPrice());
                break;
            }
            iProductIOFile.writeFile(FILE_NAME,products);
        }
    }

    @Override
    public List<Product> getProducts() {
        List<Product>products=null;
        products=iProductIOFile.readFile(FILE_NAME);
        return products;
    }

    @Override
    public void delete(String id) throws NotFoundProductException {
        List<Product>products=iProductIOFile.readFile(FILE_NAME);
        Product product=null;
        for(Product product1:products) {
            if (Objects.equals(product1.getId(), id)) {
                product = product1;
                break;
            }
        }
            if (product==null){
                throw new NotFoundProductException();
        }
            products.remove(product);
    }
}





