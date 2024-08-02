package Comparators;

import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Jane", 60000));

        // using lambda expression to sort employees by salary
        employees.sort((Employee e1, Employee e2) -> (int)(e1.salary - e2.salary));
        employees.forEach((Employee e) -> System.out.println(e));

        System.out.println("------------------------");

        // using lambda expression to perform operations
        Operation add = (int a, int b) -> a + b;
        Operation subtract = (int a, int b) -> a - b;
        Operation multiply = (int a, int b) -> a * b;
        Operation divide = (int a, int b) -> a / b;

        System.out.println("Addition: " + add.operator(5, 3));
        System.out.println("Subtraction: " + subtract.operator(5, 3));
        System.out.println("Multiplication: " + multiply.operator(5, 3));
        System.out.println("Division: " + divide.operator(5, 3));
    }

    @FunctionalInterface // this is functional interface, because, it has only one abstract method
    public interface Operation {
        int operator(int a, int b);
    }
}
