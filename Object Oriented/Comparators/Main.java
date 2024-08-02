package Comparators;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 50000);
        Employee employee2 = new Employee("Jane", 60000);
        Employee employee3 = new Employee("Jack", 55000);
        Employee employee4 = new Employee("Jill", 70000);
        Employee employee5 = new Employee("Joe", 45000);

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);
        System.out.println("Employee 3: " + employee3);
        System.out.println("Employee 4: " + employee4);
        System.out.println("Employee 5: " + employee5);

        System.out.println("------------------------");

        System.out.println("Employee 1 compared to Employee 2: " + employee1.compareTo(employee2));
        System.out.println("Employee 2 compared to Employee 3: " + employee2.compareTo(employee3));
        System.out.println("Employee 3 compared to Employee 4: " + employee3.compareTo(employee4));
        System.out.println("Employee 4 compared to Employee 5: " + employee4.compareTo(employee5));
        System.out.println("Employee 5 compared to Employee 1: " + employee5.compareTo(employee1));

        System.out.println("------------------------");

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        System.out.println("Before sorting:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("------------------------");

        java.util.Arrays.sort(employees);
        System.out.println("After sorting:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
