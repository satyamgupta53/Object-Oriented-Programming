package Interfaces;

public interface Engine {

    static final int PRICE = 57000;
    static final String MANUFACTURER = "Toyota";
    
    void start();
    void stop();
    void increaseSpeed();
    void decreaseSpeed();
}   
