package Generics;

import OOP2.Car;

public class Main {

    public static void main(String[] args) {

        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.add(new Laptop("Apple"));
        laptopBag.add(new Laptop("Dell"));
        laptopBag.add(new Laptop("Lenovo"));

        System.out.println("Laptops in the bag:");
        laptopBag.printContents();

        System.out.println();

        Bag<Chihuahua> chihuahuaBag = new Bag<>();

        chihuahuaBag.add(new Chihuahua("Ryana"));
        chihuahuaBag.add(new Chihuahua("Winona"));
        chihuahuaBag.add(new Chihuahua("Alexa"));
        chihuahuaBag.add(new Chihuahua("Presephone"));
        chihuahuaBag.add(new Chihuahua("Paulina"));
        chihuahuaBag.add(new Chihuahua("Samuel L jackson"));

        System.out.println("Chihuahuas in the bag:");
        chihuahuaBag.printContents();
    }
}
