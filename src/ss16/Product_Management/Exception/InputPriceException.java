package ss16.Product_Management.Exception;

public class InputPriceException extends Exception{
    public InputPriceException(){
        super("Mời bạn nhập lại giá lớn hơn 0");
    }
}
