package Object_Oriented.Student_Example;

public class Student {
    int studentId;
    String name;
    int age;
    String nickname;
    int phoneNumber;
    String email;
    String address;
    static long classStrength = 0;

    public Student() {
        this(0, "None", 0, 0, "None");
        // this way of calling the constructor is called constructor chaining
    }

    public Student(int studentId, 
            String name, 
            int age, 
            int phoneNumber,
            String address) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        Student.classStrength += 1; // use class name to access static variable, as it is shared among all objects
    }

    public Student(int studentId, 
            String name, 
            int age, 
            String nickname,
            int phoneNumber,
            String email,
            String address) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        Student.classStrength += 1;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                "\nName: " + name +
                "\nAge: " + age +
                "\nNickname: " + nickname +
                "\nPhone Number: " + phoneNumber +
                "\nEmail: " + email +
                "\nAddress: " + address + "\n";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing this object");
    }
}

