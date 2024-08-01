package Abstraction;

public class Son extends Parent {
    private String name;
    private boolean married;
    private int numOfChildrens;

    public Son(String name, boolean married, int numOfChildrens) {
        this.name = name;
        this.married = married;
        this.numOfChildrens = numOfChildrens;
    }

    @Override
    void career(String professionName) {
        System.out.println(professionName + " is a professinal architect.");
    }

    @Override
    boolean marriage(Boolean married, String namePartner) {
        if (married) {
            System.out.println("He is married.");
        } else {
            System.out.println("He is not married.");
        }
        return married;
    }

    @Override
    int children(int numOfChildrens) {
        System.out.println("He has " + numOfChildrens + " children.");
        return numOfChildrens;
    }

    @Override
    public String toString() {
        return "Son [Is married=" + married + ", Name=" + name + ", Number of childs=" + numOfChildrens + "]";
    }
}
