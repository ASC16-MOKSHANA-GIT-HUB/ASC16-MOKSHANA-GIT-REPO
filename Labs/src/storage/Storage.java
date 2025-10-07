package storage;

import entity.Employee;

public interface Storage {
    void addEmployee(Employee e);
    Employee getEmployee(int empno);
}
