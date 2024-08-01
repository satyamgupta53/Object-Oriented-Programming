package Interfaces;

public interface Brake {

    static final int PRICE = 15000;
    static final String MANUFACTURER = "Brembo";
    
    void apply();
    void release();
}
