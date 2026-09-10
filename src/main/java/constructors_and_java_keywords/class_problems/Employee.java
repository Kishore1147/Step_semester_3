package constructors_and_java_keywords.class_problems;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    public void printDetails() {
        System.out.println(name + " " + this.salary);
    }

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Arun", 30000),
                new Employee("Priya", 35000),
                new Employee("Rahul", 40000)
        };

        double bonus = 5000;

        for (Employee employee : employees) {
            employee.raiseSalary(bonus);
        }

        for (Employee employee : employees) {
            employee.printDetails();
        }
    }
}
