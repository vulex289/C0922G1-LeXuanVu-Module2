package case_study.services.impl;

import case_study.FileUtils.ReadAndWriteCustomer;
import case_study.models.Person.Customer;
import case_study.services.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final ReadAndWriteCustomer readAndWriteCustomer=new ReadAndWriteCustomer();
public static final String FILE_NAME="src/case_study/data/Customer.csv";
    @Override
    public List<Customer> getInfor(){
        return readAndWriteCustomer.read(FILE_NAME);
    }

    @Override
    public void add(Customer o)  {
    List<Customer>customers=readAndWriteCustomer.read(FILE_NAME);
        customers.add(o);
        readAndWriteCustomer.write(FILE_NAME,customers);
    }

    @Override
    public void update(Customer o)  {
        List<Customer>customers=readAndWriteCustomer.read(FILE_NAME);
        for (Customer customer : customers) {
            if (customer.getIdCard() == o.getIdCard()) {
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
    public void delete(int idCard) {
        List<Customer>customers=readAndWriteCustomer.read(FILE_NAME);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdCard()==idCard){
                customers.remove(customers.get(i));
                break;
            }
        }
        readAndWriteCustomer.write(FILE_NAME,customers);
    }
}
