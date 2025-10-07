package storage;

import entity.Employee;
import java.util.ArrayList;

public class StorageImpl implements Storage {
    private ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    @Override
    public Employee getEmployee(int empno) {
        for (Employee e : employees) {
            if (e.getEmpNo() == empno) {
                return e;
            }
        }
        return null;
    }
}
