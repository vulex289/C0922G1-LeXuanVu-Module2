package case_study.services.impl;

import case_study.Exception.ExistException;
import case_study.FileUtils.ReadAndWriteCustomer;
import case_study.models.Person.Customer;
import case_study.models.Person.Employee;
import case_study.services.ICustomerService;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final ReadAndWriteCustomer readAndWriteCustomer = new ReadAndWriteCustomer();
    public static final String FILE_NAME = "src/case_study/data/Customer.csv";

    @Override
    public List<Customer> getInfor() {
        return readAndWriteCustomer.read(FILE_NAME);
    }

    @Override
    public void add(Customer o) throws ExistException {
        List<Customer> customers = readAndWriteCustomer.read(FILE_NAME);
        for (Customer e : customers) {
            if (o.getId() == e.getId()) {
                throw new ExistException("Id is existed");
            }
            customers.add(o);
            readAndWriteCustomer.write(FILE_NAME, customers);
        }
    }

    @Override
    public void update(Customer o) {
        List<Customer> customers = readAndWriteCustomer.read(FILE_NAME);
        for (Customer customer : customers) {

            if (customer.getId() == o.getId()) {
                customer.setName(o.getName());
                customer.setBirthday(o.getBirthday());
                customer.setGender(o.getGender());
                customer.setCMND(o.getCMND());
                customer.setPhoneNumber(o.getPhoneNumber());
                customer.setEmail(o.getEmail());
                customer.setGuestType(o.getGuestType());
                customer.setAddress(o.getAddress());
                break;
            }
        }
        readAndWriteCustomer.write(FILE_NAME, customers);
    }

    @Override
    public void delete(int id) throws ExistException {
        List<Customer> customers = readAndWriteCustomer.read(FILE_NAME);
        Customer customer = null;
        for (Customer customer1 : customers) {
            if (id == customer1.getId()) {
                customer = customer1;
            }
        }
        if (customer == null) {
            throw new ExistException("Customer is not exist");
        }
        customers.remove(customer);
        readAndWriteCustomer.write(FILE_NAME, customers);
    }
    public boolean checkId(Customer e){
        List<Customer>customers=readAndWriteCustomer.read(FILE_NAME);
        for (Customer customer: customers ) {
            if(e.getId()!=customer.getId()){
                return false;
            }
        }
        return true;
    }
}
