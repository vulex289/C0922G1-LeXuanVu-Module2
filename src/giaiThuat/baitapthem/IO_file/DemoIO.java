package giaiThuat.baitapthem.IO_file;

import ss15_io_file.Read_file.FileUtils;

import java.io.*;

public class DemoIO {
    public static final String FILE_NAME="D:\\codegym\\module02\\src\\giaiThuat\\baitapthem\\IO_file\\File.csv";
    public static void main(String[] args) {
        File file=new File(FILE_NAME);
//        BufferedWriter bufferedWriter=null;
//        try {
//            FileWriter fileWriter=new FileWriter(file);
//            fileWriter.write("Hello\n");
//            fileWriter.write("Hi\n");
//            fileWriter.write("abc\n");
//             bufferedWriter=new BufferedWriter(fileWriter);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                bufferedWriter.close();
//
//
//            } catch (IOException e) {
//              e.printStackTrace();
//            }
//        }
        FileUtils.writeLine(FILE_NAME,"abc\nacd\n");
        BufferedReader bufferedReader=null;
        FileReader fileReader=null;
        try {
           fileReader=new FileReader(file);
             bufferedReader=new BufferedReader(fileReader);
             String line="";
             while (true) {

                 line = bufferedReader.readLine();
                 if (line == null) {
                     break;
                 }
                 System.out.println(line);
             }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileReader!=null) {
                    fileReader.close();
                }
                if(bufferedReader!=null) {

                    bufferedReader.close();
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
        }


    }
}
