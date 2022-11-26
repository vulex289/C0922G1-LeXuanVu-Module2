package ss15_io_file.copy_file_text;

public class Main {
    public static final String FILE_NAME="D:\\codegym\\module02\\src\\ss15_io_file\\copy_file_text\\Source";
    public static void main(String[] args) {
        String line="1: John 10/10/2022\n2: Nick 21/10/2022";
        ToolIOFile.writeFile(FILE_NAME,line);
        ToolIOFile.readFile(FILE_NAME);
    }
}
