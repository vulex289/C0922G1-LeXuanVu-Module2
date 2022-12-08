package case_study.controller;

import case_study.Exception.ExistException;
import case_study.Exception.NotFoundObjectException;
import case_study.models.Person.Customer;
import case_study.services.ICustomerService;
import case_study.services.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerManagementController {
    private final ICustomerService customerService = new CustomerServiceImpl();

    public void add(Customer customer) {
        try {
            customerService.add(customer);
        } catch (ExistException e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Customer> getInfor() {

        return customerService.getInfor();

    }

    public void update(Customer customer) {

        this.customerService.update(customer);

    }

    public void delete(int idCard) {
        try {
            this.customerService.delete(idCard);
        } catch (NotFoundObjectException e) {
            e.printStackTrace();
        } catch (ExistException e) {
            e.printStackTrace();
        }
    }

}
