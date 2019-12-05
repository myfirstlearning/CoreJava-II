package com.collections;

public class Employee implements Comparable<Employee>{

    private String empId;
    private String name;
    private String city;

    public Employee(String empId, String name, String city){
        this.empId = empId;
        this.name = name;
        this.city = city;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int compareTo(Employee emp) {
        int x = this.getName().compareTo(emp.getName());
        if (x == 0) {
            return this.getCity().compareTo(emp.getCity());
        } else {
            return x;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
