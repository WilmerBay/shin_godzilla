package VehicleParentExercise;

public class Vehicle {
    // Protected: accessible by child classes
    protected String vinNumber;
    protected String licensePlate;
    protected String licenseType;
    protected int speed;
    protected int capacity;
    protected String fuelType;
    protected String make;
    protected String model;
    protected double weight;
    protected boolean hasGPS;
    protected boolean engineType; // Consider using enum in future
    protected int maxCapacity;
    protected String color;
    protected String terrain;
    protected double fuelCapacity;
    protected double speedometer;

    public Vehicle(String vinNumber, String licensePlate, String licenseType, int speed,
                   int capacity, String fuelType, String make, String model, double weight,
                   boolean hasGPS, boolean engineType, int maxCapacity, String color,
                   String terrain, double fuelCapacity, double speedometer) {

        this.vinNumber = vinNumber;
        this.licensePlate = licensePlate;
        this.licenseType = licenseType;
        this.speed = speed;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.hasGPS = hasGPS;
        this.engineType = engineType;
        this.maxCapacity = maxCapacity;
        this.color = color;
        this.terrain = terrain;
        this.fuelCapacity = fuelCapacity;
        this.speedometer = speedometer;

    }

    public Vehicle() {

    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    public void accelerate(int increment) {
        speed += increment;
    }

    public void decelerate(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0; // Prevent negative speed
        }
    }

    public void electronicBrake(int strength) {
        speed -= strength;
        if (speed < 0) {
            speed = 0;
        }
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vin) {
        this.vinNumber = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String plate) {
        this.licensePlate = plate;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String type) {
        this.licenseType = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuel) {
        this.fuelType = fuel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean hasGps() {
        return hasGPS;
    }

    public void setGps(boolean value) {
        this.hasGPS = value;
    }

    public boolean isEngineType() {
        return engineType;
    }

    public void setEngineType(boolean type) {
        this.engineType = type;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int max) {
        this.maxCapacity = max;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuel) {
        this.fuelCapacity = fuel;
    }

    public double getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(double speedo) {
        this.speedometer = speedo;
    }
}
