package ss16.Product_Management.service;

import ss16.Product_Management.model.Product;

import java.util.List;

public interface IProductIOFile {
    List<Product> readFile(String pathFile);
    void writeFile(String pathFile,List<Product> products);
}
