package Student_Example;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[10];
        student[0] = new Student(1, "John", 20, 1234567890, "123 Main St.");
        student[1] = new Student(2, "Jane", 21, "JJ", 1234567890, "jane@gmail.com", "456 Main St.");
        student[2] = new Student(3, "Jim", 22, "JJ", 1234567890, "jim@gmail.com", "789 Main St.");
        student[3] = new Student(); // default constructor is called
        System.out.println("\nThe class strength is : " + Student.classStrength);

        for (int i = 0; i < student.length; i++) {
            if (student[i] == null)
                break;
            System.out.println(student[i]);
        }

        Student obj = null; // finalise method is only called when there is load on the memory
        for (int i = 0; i < 60000; i++)
            obj = new Student();
            obj.toString();
    }
}
