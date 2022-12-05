package case_study.services.impl;

import case_study.Exception.ExistException;
import case_study.FileUtils.ReadAndWriteCustomer;
import case_study.models.Person.Customer;
import case_study.models.Person.Employee;
import case_study.services.CustomerService;

import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private final ReadAndWriteCustomer readAndWriteCustomer=new ReadAndWriteCustomer();
public static final String FILE_NAME="src/case_study/data/Customer.csv";
    @Override
    public List<Customer> getInfor(){
        return readAndWriteCustomer.read(FILE_NAME);
    }

    @Override
    public void add(Customer o) throws ExistException {
        List<Customer> customers = readAndWriteCustomer.read(FILE_NAME);
        for (Customer e : customers) {
            if (o.getId() == e.getId()) {
                throw new ExistException();
            }
            customers.add(o);
            readAndWriteCustomer.write(FILE_NAME, customers);
        }
    }
    @Override
    public void update(Customer o)  {
        List<Customer>customers=readAndWriteCustomer.read(FILE_NAME);
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
        readAndWriteCustomer.write(FILE_NAME,customers);
    }

    @Override
    public void delete(int id) {
        List<Customer>customers=readAndWriteCustomer.read(FILE_NAME);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId()==id){
                customers.remove(customers.get(i));
                break;
            }
        }
        readAndWriteCustomer.write(FILE_NAME,customers);
    }

    @Override
    public Map<Customer, Integer> getFacilityMap() {
        return null;
    }
}
