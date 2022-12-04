package case_study.FileUtils;

import case_study.models.Facility.Room;
import case_study.models.Person.Employee;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteRoom {
//    public void write(String pathFile, Map<Room,Integer> rooms){
//        BufferedWriter bufferedWriter=null;
//        FileWriter fileWriter=null;
//        try {
//            fileWriter=new FileWriter(pathFile);
//            bufferedWriter=new BufferedWriter(fileWriter);
//            for () {
//                bufferedWriter.write(employee.getLine());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }


    public Map<Room,Integer> read(String pathFile){
        Map<Room,Integer>roomMap =new LinkedHashMap<>();
        FileReader fileReader= null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String []item=line.split(",");
                Room room=new Room(Integer.parseInt(item[0]),item[1],item[2],Double.parseDouble(item[3]),
                        Integer.parseInt(item[4]),item[5],item[6]);

                roomMap.put(room,0);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return roomMap;

    }

}
