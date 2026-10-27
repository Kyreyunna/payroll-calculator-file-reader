package com.pluralsight;

public class Employee {
    int employeeId;
    String name;
    double hoursWorked;
    double payRate;

    //derived getter

    //constructors
// method used to construct class
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    //getter setter


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
//  derived getter calculated, computed
    public double calculateGrossPay() {
        double grossPay= hoursWorked * payRate;
        return hoursWorked * payRate;
    }
}
