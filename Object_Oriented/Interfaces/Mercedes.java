package Interfaces;

public class Mercedes implements Brake, MediaPlayer, Engine {

    private String model;
    private String color;
    private int year;

    public Mercedes(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public void apply() {
        System.out.println("Mercedes Brake applied");
    }

    @Override
    public void release() {
        System.out.println("Mercedes Brake released");
    }

    @Override
    public void play() {
        System.out.println("Mercedes Music playing");
    }

    @Override
    public void pause() {
        System.out.println("Mercedes Music paused");
    }

    @Override
    public void start() {
        System.out.println("Mercedes Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes Engine stopped");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Mercedes Speed increased");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Mercedes Speed decreased");
    }

    @Override
    public String toString() {
        return "Model: " + model + "\nColor: " + color + "\nYear: " + year;
    }
}
