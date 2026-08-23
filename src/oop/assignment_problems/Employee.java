package oop.assignment_problems;

public class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }

    void printProfile(){
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args){

        Employee E1 = new Employee("E-101", "Divya", 65000);
        Employee E2 = new Employee("E-102", "Arjun");

        E1.printProfile();
        E2.printProfile();
    }
}