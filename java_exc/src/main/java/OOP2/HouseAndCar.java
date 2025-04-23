package OOP2;

public class HouseAndCar {
    public static void main(String[] args) {

        Car firstCar = new Car();

        firstCar.color = "Silver";
        firstCar.make = "Toyota";
        firstCar.model = "Supra";
        firstCar.numWheels = 4;
        firstCar.registered = true;

        firstCar.honks();

        Car secondCar = new Car();

        secondCar.color = "Black";
        secondCar.make = "VW";
        secondCar.model = "Jetta";
        secondCar.numWheels = 3;
        secondCar.registered = false;

        secondCar.honks();

        House firstHouse = new House();

        firstHouse.owner = "Wilmer";
        firstHouse.houseColor = "Blue";
        firstHouse.hasGarage = false;
        firstHouse.numRooms = 6;

        firstHouse.unlockedTheDoor();

        System.out.println();


    }




}
