package Object_Oriented.Inheritance;

public class Humans extends Species {
    private int numberOfLegs;
    private int numberOfArms;

    public Humans() {
        super();
        this.numberOfLegs = 2;
        this.numberOfArms = 2;
    }

    public Humans(String name,
                int age,
                int numberOfLegs, 
                int numberOfArms) {
        super(name, age);
        this.numberOfLegs = numberOfLegs;
        this.numberOfArms = numberOfArms;
    }

    public Humans(boolean isAlive, 
                String name, 
                int age, 
                int numberOfLegs, 
                int numberOfArms) {
        super(isAlive, name, age);
        this.numberOfLegs = numberOfLegs;
        this.numberOfArms = numberOfArms;
    }

    public Humans(boolean isAlive, 
                String name, 
                int age, 
                boolean isExtinct, 
                boolean isEndangered, 
                int numberOfLegs, 
                int numberOfArms) {
        super(isAlive, name, age, isExtinct, isEndangered);
        this.numberOfLegs = numberOfLegs;
        this.numberOfArms = numberOfArms;
    }

    public Humans(Humans humans) {
        super(humans);
        this.numberOfLegs = humans.numberOfLegs;
        this.numberOfArms = humans.numberOfArms;
    }

    @Override
    public String toString() {
        return "Humans{ " +
                super.toString() +
                " numberOfLegs=" + numberOfLegs +
                ", numberOfArms=" + numberOfArms +
                '}';
    }
}
