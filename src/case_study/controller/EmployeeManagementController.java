package case_study.controller;

import case_study.models.Person.Employee;
import case_study.services.EmployeeService;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeManagementController {
   EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
    public void add(Employee employee){
        this.employeeService.add(employee);
    }
    public List<Employee> getInfor(){
        return this.employeeService.getInfor();
    }
    public void update(Employee employee){
        this.employeeService.update(employee);
    }
    public void delete(int idCard){
        this.employeeService.delete(idCard);
    }
}

