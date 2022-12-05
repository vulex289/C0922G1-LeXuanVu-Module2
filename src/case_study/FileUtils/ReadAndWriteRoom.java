package case_study.FileUtils;

import case_study.models.Facility.Room;
import case_study.models.Facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteRoom {
    public void write(String pathFile, Map<Room,Integer> roomIntegerMap){
        BufferedWriter bufferedWriter=null;
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(pathFile);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (Map.Entry<Room,Integer>element:roomIntegerMap.entrySet()) {
                bufferedWriter.write(element.getKey().getLine()+","+element.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public Map<Room,Integer> read(String pathFile){
        Map<Room,Integer>roomIntegerMap = new LinkedHashMap<>();
        FileReader fileReader= null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String []item=line.split(",");
                Room room=new Room(item[0],item[1],Integer.parseInt(item[2]),Double.parseDouble(item[3])
                        ,Integer.parseInt(item[4]),item[5],item[6]);
                roomIntegerMap.put(room,Integer.parseInt(item[7]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return roomIntegerMap;

    }
}
