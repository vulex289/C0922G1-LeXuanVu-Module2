package ss16.Product_Management.controller;


import ss16.Product_Management.Exception.ExistedProductException;
import ss16.Product_Management.Exception.NotFoundProductException;
import ss16.Product_Management.model.Product;
import ss16.Product_Management.service.IProductService;
import ss16.Product_Management.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {

    private final IProductService productService = new ProductServiceImpl();


    public void add(Product product) {
        try {
            this.productService.add(product);
        } catch (ExistedProductException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Product product) {
        this.productService.update(product);
    }


    public List<Product> getProducts(){
        return this.productService.getProducts();
    }
    public void delete(String id) {
        try {
            this.productService.delete(id);
        } catch (NotFoundProductException e) {
            System.out.println(e.getMessage());
        }
    }

}
