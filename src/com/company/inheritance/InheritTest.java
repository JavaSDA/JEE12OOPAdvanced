package com.company.inheritance;

public class InheritTest {
    public static void main(String[] args) {
        Person person = new Person("Johnson", 23);
        System.out.println(person.getName());

        Employee employee = new Employee("Davidson", 23, "Writer", "J222");
        System.out.println(employee.getName());
        System.out.println(employee.getOccupation());
    }

    // TODO: encapsulation and enums.
}
