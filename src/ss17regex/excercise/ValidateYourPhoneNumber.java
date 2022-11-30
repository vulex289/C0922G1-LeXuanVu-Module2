package ss17regex.excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateYourPhoneNumber {
    public static final String REGEX_NAME_PHONENUMBER="^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile(REGEX_NAME_PHONENUMBER);
        System.out.println("Nhập vào chuỗi cần kiểm tra");
        String name=scanner.nextLine();
        Matcher matcher= pattern.matcher(name);
        if(matcher.matches()){
            System.out.println("Bạn đã nhập đúng định dạng");
        }
        else{
            System.out.println("Bạn đã nhập sai định dạng");
        }
    }
}
