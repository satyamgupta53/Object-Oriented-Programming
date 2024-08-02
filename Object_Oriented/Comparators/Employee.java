package Comparators;

public class Employee implements Comparable<Employee> {
    static int employeeCount = 0;
    private String id;
    private String name;
    int salary;

    public Employee(String name, int salary) {
        this.id = "IND0" + (employeeCount = employeeCount + 1);
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return (int)(this.salary - employee.salary);
    }
}
