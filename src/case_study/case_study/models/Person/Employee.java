package case_study.case_study.models.Person;

import case_study.models.Person.Person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee(int id, String name, String birthday, String gender, int CMND, int phoneNumber,
                    String email, String level, String position, double salary) {
        super(id, name, birthday, gender, CMND, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public String getLine(){
        return this.getId()+"," +this.getName()+","+this.getBirthday()+","+this.getGender() +","+
                this.getCMND() +","+this.getPhoneNumber()
        +","+ this.getEmail()+","+this.getLevel()+","+this.getPosition()+","+this.getSalary();
    }
}
