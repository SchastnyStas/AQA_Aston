package org.example.lesson2;

public class Employee {
    String fio;
    String position;
    String email;
    String phoneNumber;
    String salary;
    int age;

    Employee(String fio, String position, String email, String phoneNumber, String salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("ФИО сотрудника: " + this.fio);
        System.out.println("Должность сотрудника: " + this.position);
        System.out.println("Email сотрудника: " + this.email);
        System.out.println("Номер телефона сотрудника: " + this.phoneNumber);
        System.out.println("Зарплата сотрудника: " + this.salary);
        System.out.println("Возраст сотрудника: " + this.age);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Employee anna1 = new Employee("Федотова Анна Васильевна", "AQA", "anna.f@gmail.com", "+375-29-555 77 66", "1500 EUR", 25);
        Employee anna2 = new Employee("Федотова Анна Васильевна", "AQA", "anna.f@gmail.com", "+375-29-555 77 66", "1500 EUR", 25);
        Employee anna3 = new Employee("Федотова Анна Васильевна", "AQA", "anna.f@gmail.com", "+375-29-555 77 66", "1500 EUR", 25);
        Employee anna4 = new Employee("Федотова Анна Васильевна", "AQA", "anna.f@gmail.com", "+375-29-555 77 66", "1500 EUR", 25);
        Employee anna5 = new Employee("Федотова Анна Васильевна", "AQA", "anna.f@gmail.com", "+375-29-555 77 66", "1500 EUR", 25);
        Employee[] employees = new Employee[5];
        employees[0] = anna1;
        employees[1] = anna2;
        employees[2] = anna3;
        employees[3] = anna4;
        employees[4] = anna5;
        for (Employee employee : employees) {
            employee.printEmployeeInfo();
        }
    }
}
