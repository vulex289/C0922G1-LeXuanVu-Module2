package case_study.case_study.controller;

import case_study.Exception.ExistException;
import case_study.Exception.NotFoundEmployeeException;
import case_study.models.Person.Employee;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeManagementController {
   EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
    public void add(Employee employee){
        try {
            this.employeeService.add(employee);
        } catch (ExistException e) {
            System.err.println(e.getMessage());
        }
    }
    public List<Employee> getInfor(){
        return this.employeeService.getInfor();
    }
    public void update(Employee employee){
        this.employeeService.update(employee);
    }
    public void delete(int id){
        try {
            this.employeeService.delete(id);
        } catch (NotFoundEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}

