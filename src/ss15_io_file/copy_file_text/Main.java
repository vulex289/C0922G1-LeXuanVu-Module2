package ss15_io_file.copy_file_text;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String FILE_NAME_1="D:\\codegym\\module02\\src\\ss15_io_file\\copy_file_text\\target.csv";
    public static final String FILE_NAME_2="D:\\codegym\\module02\\src\\ss15_io_file\\copy_file_text\\source.csv";
    public static void main(String[] args) {
            ToolIOFile.copyFile(FILE_NAME_1,ToolIOFile.readFile(FILE_NAME_2));
    }
}
