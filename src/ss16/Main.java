package ss16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME="D:\\codegym\\module02\\src\\ss16\\person.txt";
    public static void main(String[] args) {
        List<Person>listLine=new ArrayList<>();
        listLine.add(new Person(1,"Vũ","C22"));
        listLine.add(new Person(2,"Bão","C23"));
        listLine.add(new Person(3,"Mão","C24"));
        writeFile(FILE_NAME,listLine);
        System.out.println(readFile(FILE_NAME));

        }

    public static void writeFile(String partFile,List<Person>people){

        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
           fileOutputStream=new FileOutputStream(partFile);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
          objectOutputStream.writeObject(people);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static  List<Person> readFile(String partFile){
        List<Person>people=new ArrayList<>();

        try {
            FileInputStream fileInputStream=new FileInputStream(partFile);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
                  people=(List<Person>)objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
            }
         catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return people;
    }
}
