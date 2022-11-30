package ss16.Product_Management.Exception;

public class ExistedProductException extends Exception{
    public ExistedProductException(){
        super("Product này đã tồn tại");
    }
}
