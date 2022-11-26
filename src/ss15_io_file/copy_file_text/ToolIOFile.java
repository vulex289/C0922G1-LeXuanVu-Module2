package ss15_io_file.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToolIOFile {
    public static void writeFile(String partFile,String line){
        try {
            FileWriter fileWriter=new FileWriter(partFile,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<String> readFile(String partFile){
        List<String>listLine=new ArrayList<>();
        try {

            FileReader fileReader=new FileReader(partFile);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                listLine.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return listLine;
    }
}