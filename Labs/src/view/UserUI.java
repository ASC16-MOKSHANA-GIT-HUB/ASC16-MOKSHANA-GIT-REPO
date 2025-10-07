package view;

import entity.Employee;
import storage.Storage;
import storage.StorageFactory;
import java.util.Scanner;

public class UserUI {
    private Storage storage;

    public UserUI() {
        storage = StorageFactory.getStorage();
    }

    public void acceptEmpDetailsAndStore() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee No: ");
        int empNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter First Name: ");
        String fname = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lname = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(empNo, fname, lname, city, salary);
        storage.addEmployee(e);
        System.out.println("✅ Employee added successfully.");
    }

    public void displayEmpByEmpno() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee No to Search: ");
        int empNo = sc.nextInt();

        Employee e = storage.getEmployee(empNo);
        if (e != null) {
            e.showDetails();
        } else {
            System.out.println("❌ Employee not found.");
        }
    }
}
