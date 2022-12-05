package case_study.services.impl;

import case_study.Exception.ExistException;
import case_study.Exception.NotFoundEmployeeException;
import case_study.FileUtils.ReadAndWriteEmployee;
import case_study.models.Person.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private static final ReadAndWriteEmployee readAndWrite = new ReadAndWriteEmployee();
    public static final String FILE_NAME = "src/case_study/data/Employee.csv";
//    static {
//        List<Employee> employeeList = new ArrayList<>();
//        Employee employeeFirst = new Employee(1, "Phi NGoc Mai", "12/12/1987", "Nam", 192045602,
//                113115119, "Maipgi@gmail.com", "university", "Quản lí", 90000000);
//        employeeList.add(employeeFirst);
//        readAndWrite.write(FILE_NAME,employeeList);
//    }
    @Override
    public List<Employee> getInfor() {
        return readAndWrite.read(FILE_NAME);
    }

    @Override
    public void add(Employee employee) throws ExistException {
        List<Employee> employees = readAndWrite.read(FILE_NAME);
        for (Employee e:employees) {
            if(employee.getId()==e.getId()){
                    throw new ExistException();
                }
            }
        employees.add(employee);

        readAndWrite.write(FILE_NAME, employees);
    }
    @Override
    public void update(Employee employee) {
        List<Employee> employees = readAndWrite.read(FILE_NAME);
        for (Employee e : employees) {
            if (e.getId() == employee.getId()) {
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
            else{
                System.out.println("Bạn nhập id không nằm trong danh sách để sửa");
            }
        }
        readAndWrite.write(FILE_NAME, employees);

    }

    @Override
    public void delete(int id) throws NotFoundEmployeeException {
        List<Employee> employees = readAndWrite.read(FILE_NAME);
        Employee employee=null;
        for (Employee employee1:employees) {
            if(id== employee1.getId()){
                employee=employee1;
            }
        }
        if (employee == null) {
                throw new NotFoundEmployeeException();

        }
        employees.remove(employee);
        readAndWrite.write(FILE_NAME, employees);
    }

    @Override
    public Map<Employee, Integer> getFacilityMap() {
        return null;
    }
}

