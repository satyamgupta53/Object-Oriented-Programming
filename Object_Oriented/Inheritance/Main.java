package Object_Oriented.Inheritance;

public class Main {
    public static void main(String[] args) {
        /* Single level inheritance */
        Humans humans = new Humans(false, "Human", 20, 5, 2);
        System.out.println('\n' + humans.toString());

        Humans humans1 = new Humans(humans);
        System.out.println('\n' + humans1.toString());
    }
}
