package Interfaces;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("C-Class", "Black", 2021);
        System.out.println(mercedes);
        mercedes.start();
        mercedes.increaseSpeed();
        mercedes.decreaseSpeed();
        mercedes.stop();
        mercedes.apply();
        mercedes.release();
        mercedes.play();
        mercedes.pause();
        System.out.println();

        System.out.println("Engine Price: " + Engine.PRICE);
        System.out.println("Engine Manufacturer: " + Engine.MANUFACTURER);
        System.out.println("Media Player Price: " + MediaPlayer.PRICE);
        System.out.println("Media Player Manufacturer: " + MediaPlayer.MANUFACTURER);
        System.out.println("Brake Price: " + Brake.PRICE);
        System.out.println("Brake Manufacturer: " + Brake.MANUFACTURER);
        System.out.println();

        Audi audi = new Audi("A4", "White", 2021);
        System.out.println(audi);
        audi.start();
        audi.increaseSpeed();
        audi.decreaseSpeed();
        audi.stop();
        audi.apply();
        audi.release();
        audi.play();
        audi.pause();
    }
}
