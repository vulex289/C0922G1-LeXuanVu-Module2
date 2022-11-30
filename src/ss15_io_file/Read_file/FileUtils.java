package ss15_io_file.Read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void writeLine(String partFile, String line) {
        BufferedWriter bufferedWriter=null;
        try {
            FileWriter fileWriter = new FileWriter(partFile, true);
             bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<String> readLine(String partFile) {
        List<String> listLine = new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            FileReader fileReader = new FileReader(partFile);
             bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return listLine;
    }
}
