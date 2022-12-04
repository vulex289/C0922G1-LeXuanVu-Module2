package case_study.models.Person;

public class Customer extends Person{
    private String guestType;
    private String address;
    public Customer(int idCard, String name, String birthday, String gender, int CMND,
                    int phoneNumber, String email, String guestType,String address) {
        super(idCard, name, birthday, gender, CMND, phoneNumber, email);
        this.guestType=guestType;
        this.address=address;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "guestType='" + guestType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String getLine(){
        return this.getIdCard()+","+this.getName()+","+this.getBirthday()+","+this.getGender()
                +","+this.getCMND()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getGuestType()+","+this.getAddress();
    }
}
