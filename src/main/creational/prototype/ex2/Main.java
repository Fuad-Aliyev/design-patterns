package main.creational.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();
        Employees employees_1 = (Employees) employees.clone();
        Employees employees_2 = (Employees) employees.clone();
        List<String> employees_1_list = employees_1.getEmployees();
        employees_1_list.add("fuad");
        List<String> employees_2_list = employees_2.getEmployees();
        employees_2_list.add("test");

        System.out.println("employees list: " + employees.getEmployees());
        System.out.println("employees_1 list: " + employees_1_list);
        System.out.println("employees_2 list: " + employees_2_list);
    }
}
