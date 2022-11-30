package ss16.Product_Management.service;

import ss16.Product_Management.model.Product;

import java.io.*;
import java.util.List;

public class FileUtils {
    public void writeFile(String pathFile, List<Product> products) {
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream(pathFile);
             objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  List<Product> readFile(String pathFile) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Product> products = null;
        try {
            fileInputStream = new FileInputStream(pathFile);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                objectInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return products;
    }
}