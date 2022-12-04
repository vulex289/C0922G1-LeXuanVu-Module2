package case_study.controller;

import case_study.models.Person.Customer;
import case_study.services.CustomerService;
import case_study.services.impl.CustomerServiceImpl;

import java.io.IOException;
import java.util.List;

public class CustomerManagementController {
    private final CustomerService customerService=new CustomerServiceImpl();
    public void add(Customer customer){
            customerService.add(customer);
    }
    public List<Customer>getInfor(){

            return customerService.getInfor();

    }
    public void update(Customer customer){

            this.customerService.add(customer);

    }
    public void delete(int idCard){
            this.customerService.delete(idCard);
    }

}
