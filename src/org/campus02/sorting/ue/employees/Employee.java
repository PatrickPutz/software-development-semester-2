package org.campus02.sorting.ue.employees;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int empNumber;
    private String name;
    private double salary;
    private String department;

    public Employee(int empNumber, String name, double salary, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, name, salary, department);
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empNumber, o.getEmpNumber());
    }
}
