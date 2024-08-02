package Inheritance;

public class Species {
    private boolean isAlive;
    private String name;
    private int age;
    private boolean isExtinct;
    private boolean isEndangered;

    public Species() {
        this.isAlive = true;
        this.name = "Unknown";
        this.age = 0;
        this.isExtinct = false;
        this.isEndangered = false;
    }

    public Species(String name,
            int age) {
        this.isAlive = true;
        this.name = name;
        this.age = age;
        this.isExtinct = false;
        this.isEndangered = false;
    }

    public Species(boolean isAlive,
            String name,
            int age) {
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
    }

    public Species(boolean isAlive,
            String name,
            int age,
            boolean isExtinct,
            boolean isEndangered) {
        this.isAlive = isAlive;
        this.name = name;
        this.age = age;
        this.isExtinct = isExtinct;
        this.isEndangered = isEndangered;
    }

    public Species(Species species) {
        this.isAlive = species.isAlive;
        this.name = species.name;
        this.age = species.age;
        this.isExtinct = species.isExtinct;
        this.isEndangered = species.isEndangered;
    }

    @Override
    public String toString() {
        return "Species { " +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isExtinct=" + isExtinct +
                ", isEndangered=" + isEndangered +
                " } ";
    }
}
