package case_study.FileUtils;

import case_study.models.Facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndWriteVilla {
    public void write(String pathFile, Map<Villa,Integer> villaIntegerMap){
        BufferedWriter bufferedWriter=null;
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(pathFile);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("ID,nameService,rentType,roomStandard,areaPool,floorNumber");
            bufferedWriter.newLine();
            for (Map.Entry<Villa,Integer>element:villaIntegerMap.entrySet()) {
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
    public Map<Villa,Integer> read(String pathFile){
        Map<Villa,Integer>villaIntegerMap= new LinkedHashMap<>();
        FileReader fileReader= null;
        BufferedReader bufferedReader=null;

        try {
            fileReader = new FileReader(pathFile);
            bufferedReader=new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String []item=line.split(",");
                Villa villa=new Villa(item[0],item[1],Integer.parseInt(item[2]),Double.parseDouble(item[3])
                        ,Integer.parseInt(item[4]),item[5],item[6],Double.parseDouble(item[7]),Integer.parseInt(item[8]));
                villaIntegerMap.put(villa,Integer.parseInt(item[9]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return villaIntegerMap;

    }
}

