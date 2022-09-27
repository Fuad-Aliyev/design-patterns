package main.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> employees;

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void loadData() {
        employees.add("Pankaj");
        employees.add("Raj");
        employees.add("David");
        employees.add("Lisa");
    }

    public List<String> getEmployees() {
        return this.employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> tmpEmployees = new ArrayList<>();
        for (String employee : this.getEmployees()) {
            tmpEmployees.add(employee);
        }
        return new Employees(tmpEmployees);
    }
}
