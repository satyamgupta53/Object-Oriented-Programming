package Interfaces;

public class Audi implements Brake, MediaPlayer, Engine {

    private String model;
    private String color;
    private int year;

    public Audi(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    
    @Override
    public void apply() {
        System.out.println("Audi Brake applied");
    }
    
    @Override
    public void release() {
        System.out.println("Audi Brake released");
    }
    
    @Override
    public void play() {
        System.out.println("Audi Music playing");
    }
    
    @Override
    public void pause() {
        System.out.println("Audi Music paused");
    }
    
    @Override
    public void start() {
        System.out.println("Audi Engine started");
    }
    
    @Override
    public void stop() {
        System.out.println("Audi Engine stopped");
    }
    
    @Override
    public void increaseSpeed() {
        System.out.println("Audi Speed increased");
    }
    
    @Override
    public void decreaseSpeed() {
        System.out.println("Audi Speed decreased");
    }

    @Override
    public String toString() {
        return "Model: " + model + "\nColor: " + color + "\nYear: " + year;
    }
}
