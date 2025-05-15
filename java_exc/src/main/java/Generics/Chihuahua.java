package Generics;

public class Chihuahua {
    private String name;

    public Chihuahua(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chihuahua: " + name;
    }

    // Optional: getter
    public String getName() {
        return name;
    }
}
