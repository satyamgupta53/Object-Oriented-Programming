package Abstraction;

public class Main {
    static public void main(String[] args) {
        // instance of Son class
        Son son = new Son("John", true, 2);
        Daughter daughter = new Daughter("Jane", false, 3);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println();

        // calling the methods
        son.career("John");
        son.marriage(true, "Jane");
        son.children(2);

        System.out.println();
        daughter.career("Jane");
        daughter.marriage(false, "John");
        daughter.children(3);

        // instance of Parent class
        Parent parent = new Son("John", true, 2);
        System.out.println();
        System.out.println(parent);
        parent.career("John");
        parent.marriage(true, "Jane");
        parent.children(2);

        parent = new Daughter("Jane", false, 3);
        System.out.println();
        System.out.println(parent);
        parent.career("Jane");
        parent.marriage(false, "John");
        parent.children(3);
    }
}
