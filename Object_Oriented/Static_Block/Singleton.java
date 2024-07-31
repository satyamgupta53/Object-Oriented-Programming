package Object_Oriented.Static_Block;

public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton get() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
