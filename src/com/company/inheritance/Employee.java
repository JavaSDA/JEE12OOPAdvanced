package com.company.inheritance;

public class Employee extends Person{
    private String occupation;
    private String employeeId;

    public Employee(String name, int age, String occupation, String employeeId) {
        super(name, age);
        this.occupation = occupation;
        this.employeeId = employeeId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
