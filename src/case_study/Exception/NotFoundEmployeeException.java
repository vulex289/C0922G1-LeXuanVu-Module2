package case_study.Exception;

public class NotFoundEmployeeException extends Exception{
   public NotFoundEmployeeException(){
        super("Employee is not exist");
    }
}
