package com.deepdive.section6.queues.vo;

import java.util.Objects;

public class Employee {
    private int empno;
    private String empName;
    private String role;
    private double salary;

    public Employee(int empno, String empName, String role, double salary) {
        this.empno = empno;
        this.empName = empName;
        this.role = role;
        this.salary = salary;
    }

    public Employee() {
        super();
    }
    // Getters and setters

    public int getEmpno() {
        return empno;
    }

    public String getEmpName() {
        return empName;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    // setters

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString
    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", empName='" + empName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    //hash code and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpno() == employee.getEmpno() &&
                Double.compare(employee.getSalary(), getSalary()) == 0 &&
                getEmpName().equals(employee.getEmpName()) &&
                Objects.equals(getRole(), employee.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpno(), getEmpName(), getRole(), getSalary());
    }
}
