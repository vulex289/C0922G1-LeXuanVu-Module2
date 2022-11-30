package ss16.Product_Management.service;

import ss16.Product_Management.model.Product;

import java.util.List;

public interface IProductService {
    public void add(Product product);

    public void update(Product product) ;


    public List<Product> getProducts() ;
    public void delete(String id);
}
