package case_study.services.impl;

import case_study.FileUtils.ReadAndWriteEmployee;
import case_study.models.Person.Employee;
import case_study.services.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final ReadAndWriteEmployee readAndWrite=new ReadAndWriteEmployee();
    public static final String FILE_NAME="src/case_study/data/Employee.csv";
    @Override
    public List<Employee> getInfor() {
        return readAndWrite.read(FILE_NAME);
    }
    @Override
    public void add(Employee employee) {
    List<Employee>employees=readAndWrite.read(FILE_NAME);
    employees.add(employee);
    readAndWrite.write(FILE_NAME,employees);
    }

    @Override
    public void update(Employee employee) {
        List<Employee>employees=readAndWrite.read(FILE_NAME);
        for (Employee e:employees) {
            if(e.getIdCard()==employee.getIdCard()) {
                e.setName(employee.getName());
                e.setLevel(employee.getLevel());
                e.setPosition(employee.getPosition());
                e.setSalary(employee.getSalary());
                e.setEmail(employee.getEmail());
                e.setCMND(employee.getCMND());
                e.setPhoneNumber(employee.getPhoneNumber());
                e.setGender(employee.getGender());
                e.setBirthday(employee.getBirthday());
                break;
            }
            readAndWrite.write(FILE_NAME,employees);

            }
        }
    @Override
    public void delete(int id) {
    List<Employee>employees=readAndWrite.read(FILE_NAME);
    for (int i=0;i<employees.size();i++) {
        if (id == employees.get(i).getIdCard()) {
            employees.remove(employees.get(i));
            break;
        }
    }
            readAndWrite.write(FILE_NAME,employees);
    }
    }


