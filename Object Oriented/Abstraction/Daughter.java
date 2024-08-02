package Abstraction;

public class Daughter extends Parent {
    private String name;
    private boolean married;
    private int numOfChildrens;

    public Daughter(String name, boolean married, int numOfChildrens) {
        this.name = name;
        this.married = married;
        this.numOfChildrens = numOfChildrens;
    }

    @Override
    void career(String nameProfession) {
        System.out.println(nameProfession + " is a professional doctor.");
    }

    @Override
    boolean marriage(Boolean married, String namePartner) {
        if (married) {
            System.out.println("She is married.");
        } else {
            System.out.println("She is not married.");
        }
        return married;
    }

    @Override
    int children(int numOfChildrens) {
        System.out.println("She has " + numOfChildrens + " children.");
        return numOfChildrens;
    }

    @Override
    public String toString() {
        return "Daughter [Is married=" + married + ", Name=" + name + ", Number of childs=" + numOfChildrens + "]";
    }
}
