package Object_Oriented.Static_Block;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am in the main method !");
        System.out.println("Population: " + StaticBlock.population);
        System.out.println("Income Tax: " + StaticBlock.incomeTax);

        Singleton singleton1 = Singleton.get();
        Singleton singleton2 = Singleton.get();
        Singleton singleton3 = Singleton.get();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
