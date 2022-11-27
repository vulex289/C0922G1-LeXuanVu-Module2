package ss15_io_file.Read_file;

import java.util.List;

public class Test {
    public static final String FILE_NAME = "D:\\codegym\\module02\\src\\ss15_io_file\\Read_file\\file.csv";

    public static void main(String[] args) {
        List<String> listLine = FileUtils.readLine(FILE_NAME);
        String list[] = listLine.get(0).split(",");
        Country country = new Country(list[0], list[1], list[2]);
        System.out.println(country.getId() + " " + country.getCode() + " " + country.getName());
    }
}