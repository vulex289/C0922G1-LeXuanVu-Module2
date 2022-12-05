package case_study.FileUtils;

import case_study.models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    public void write(String pathFile, List<Employee> employees) {
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(pathFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees) {
                bufferedWriter.write(employee.getLine());
                bufferedWriter.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        public List<Employee> read (String pathFile){
            List<Employee> employees = new ArrayList<>();
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(pathFile);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] item = line.split(",");
                    Employee employee = new Employee(Integer.parseInt(item[0]), item[1], item[2], item[3],
                            Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8], Double.parseDouble(item[9]));
                    employees.add(employee);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return employees;
        }
    }


