package entity;

public class Employee {
    private int empNo;
    private String firstName;
    private String lastName;
    private String city;
    private double salary;

    public Employee(int empNo, String firstName, String lastName, String city, double salary) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.salary = salary;
    }

    public int getEmpNo() { return empNo; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }

    public void showDetails() {
        System.out.println("Employee No: " + empNo + ", Name: " + firstName + " " + lastName +
                ", City: " + city + ", Salary: " + salary);
    }
}
