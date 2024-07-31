package Object_Oriented.Static_Block;

public class StaticBlock {
    static long population = 10;
    static long incomeTax;

    static {
        System.out.println("I am initializing my static variables !");
        incomeTax = population * 125;
    }

    /*
     * Do not confuse the static variable with final variable. 
     * We cannot modify the final variable once it is initialized.
     * But, we can modify the static variable. 
     */
}
