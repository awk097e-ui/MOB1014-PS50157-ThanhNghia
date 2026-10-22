
package com.poly.lab7;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> list = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
        if (findById(e.getId()) != null) {
            return false;
        }

        list.add(e);
        return true;
    }

    @Override
    public Employee findById(String id) {
        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }

        return null;
    }

    @Override
    public List<Employee> getAll() {
        return list;
    }

    @Override
    public double getTotalSalary() {
        double total = 0;

        for (Employee e : list) {
            total += e.getSalary();
        }

        return total;
    }
}
