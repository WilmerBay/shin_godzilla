package VehicleParentExercise;

public class Car extends Vehicle {

    private boolean hasSunroof;
    private String transmissionType;

    public Car(String vinNumber, String licensePlate, String licenseType, int speed,
               int capacity, String fuelType, String make, String model, double weight,
               boolean hasGPS, boolean engineType, int maxCapacity, String color,
               String terrain, double fuelCapacity, double speedometer) {

        super();
        this.hasSunroof = false;
        this.transmissionType = "";
    }
}



