package Sakila;

public class Actor {
    private int id;
    private String firstName;
    private String lastName;

    public Actor(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return id + ": " + firstName + " " + lastName;
    }
}
