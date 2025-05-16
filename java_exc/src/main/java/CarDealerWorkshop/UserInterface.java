package CarDealerWorkshop;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private static final Scanner scanner = new Scanner(System.in);

    private Dealership dealership;

    public void display() {

        displayWelcomeMessage();
        initializeDealership();

        boolean running = true;

        while (running) {
            String menu = """
                \n--- Car Dealership Menu ---
                1  - Find vehicles within price range
                2  - Find vehicles by make/model
                3  - Find vehicles by year range
                4  - Find vehicles by color
                5  - Find vehicles by mileage range
                6  - Find vehicles by type
                7  - List all vehicles
                8  - Add a vehicle
                9  - Remove a vehicle
                x - Quit
                """;

            System.out.print(menu);
            System.out.print("Select an option: ");

            String choice = scanner.nextLine().trim().toLowerCase();

            switch (choice) {
                case "1" -> processGetByPriceRequest();
                case "2" -> processGetByMakeModelRequest();
                case "3" -> processGetByYearRequest();
                case "4" -> processGetColorRequest();
                case "5" -> processGetMileageRequest();
                case "6" -> processGetVehicleTypeRequest();
                case "7" -> processGetAllVehiclesRequest();
                case "8" -> processGetAddVehicleRequest();
                case "9" -> processGetRemoveVehicleRequest();
                case "x" -> running = false;
                default -> System.out.println("Invalid choice.");
            }
        }
        System.out.println("Exiting...");
    }

    private void initializeDealership() {

        dealership = new Dealership("Locked & Loaded Motors", "1 Prison Road, Alcatraz Island, CA 94133", "415-252-8729");

        //Sedans
        dealership.addVehicle(new Vehicle("VIN1112", 2015, "Toyota", "Camry", "Sedan", "Red", 85000, 10995));
        dealership.addVehicle(new Vehicle("VIN1011", 2015, "Toyota", "Camry", "Sedan", "Beige", 85000, 10995));
        dealership.addVehicle(new Vehicle("VIN2015", 2015, "Volkswagen", "GLI", "Sedan", "Charcoal", 80000, 13000));
        //Coupes
        dealership.addVehicle(new Vehicle("VIN2020", 2020, "Toyota", "GR Supra", "Coupe", "Grey", 100000, 45000));
        dealership.addVehicle(new Vehicle("VIN2018", 2018, "Mazda", "Miata MX5", "Coupe", "Red", 30000, 22000));
        //SUVs
        dealership.addVehicle(new Vehicle("VIN3746", 2019, "Honda", "CR-V", "SUV", "White", 55000, 16995));
        dealership.addVehicle(new Vehicle("VINSUV1", 2018, "Ford", "Explorer", "SUV", "Blue", 90000, 21000));
        dealership.addVehicle(new Vehicle("VINSUV2", 2021, "Toyota", "RAV4", "SUV", "Silver", 45000, 27500));
        //Trucks
        dealership.addVehicle(new Vehicle("VINTRK1", 2016, "Chevrolet", "Silverado 1500", "Truck", "Red", 120000, 18000));
        dealership.addVehicle(new Vehicle("VINTRK2", 2022, "Ram", "1500 Big Horn", "Truck", "Black", 20000, 35000));
    }

    private void displayWelcomeMessage() {

        System.out.println("\nWelcome to Locked & Loaded Motors,");
        System.out.println("where you can’t solitary conFIND better deals!");
        System.out.println("You won't find great deals locked away!");
        System.out.println();
    }

    private void processGetAllVehiclesRequest() {

        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    private void displayVehicles(List<Vehicle> vehicles) {

        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void processGetByPriceRequest() {

        System.out.print("Enter minimum price: ");
        double minPrice = readDouble();

        System.out.print("Enter maximum price: ");
        double maxPrice = readDouble();

        List<Vehicle> vehicles = dealership.getVehiclesByPrice(minPrice, maxPrice);
        displayVehicles(vehicles);
    }

    private double readDouble() {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
    public void processGetByMakeModelRequest() {

        System.out.print("Enter vehicle make: ");
        String make = scanner.nextLine().trim();

        System.out.print("Enter vehicle model: ");
        String model = scanner.nextLine().trim();

        List<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicles);
    }
    public void processGetByYearRequest() {

        System.out.print("Enter minimum year: ");
        int minYear = readInt();

        System.out.print("Enter maximum year: ");
        int maxYear = readInt();

        List<Vehicle> vehicles = dealership.getVehiclesByYear(minYear, maxYear);
        displayVehicles(vehicles);
    }

    private int readInt() {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid whole number: ");
            }
        }
    }
    public void processGetColorRequest() {
        System.out.print("Enter vehicle color: ");
        String color = scanner.nextLine().trim();

        List<Vehicle> vehicles = dealership.getVehiclesByColor(color);
        displayVehicles(vehicles);
    }
    public void processGetMileageRequest() {
        System.out.print("Enter minimum mileage: ");
        int minMileage = readInt();

        System.out.print("Enter maximum mileage: ");
        int maxMileage = readInt();

        List<Vehicle> vehicles = dealership.getVehiclesByMileage(minMileage, maxMileage);
        displayVehicles(vehicles);
    }

    public void processGetVehicleTypeRequest() {
        System.out.print("Enter vehicle type (Car, SUV, Truck, etc.): ");
        String type = scanner.nextLine().trim();

        List<Vehicle> vehicles = dealership.getVehiclesByType(type);
        displayVehicles(vehicles);
    }

    public void processGetAddVehicleRequest() {

        System.out.print("Enter VIN: ");
        String vin = scanner.nextLine().trim();

        System.out.print("Enter year: ");
        int year = readInt();

        System.out.print("Enter make: ");
        String make = scanner.nextLine().trim();

        System.out.print("Enter model: ");
        String model = scanner.nextLine().trim();

        System.out.print("Enter type: ");
        String type = scanner.nextLine().trim();

        System.out.print("Enter color: ");
        String color = scanner.nextLine().trim();

        System.out.print("Enter odometer: ");
        double odometer = readDouble();

        System.out.print("Enter price: ");
        double price = readDouble();

        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        dealership.addVehicle(vehicle);
        System.out.println("\nVehicle added successfully!");
    }
    public void processGetRemoveVehicleRequest() {
        System.out.print("Enter VIN of vehicle to remove: ");
        String vin = scanner.nextLine().trim();

        Vehicle remove = null;
        for (Vehicle v : dealership.getAllVehicles()) {
            if (v.getVin().equalsIgnoreCase(vin)) {
                remove = v;
                break;
            }
        }

        if (remove != null) {
            dealership.removeVehicle(remove);
            System.out.println("\nVehicle removed successfully!");
        } else {
            System.out.println("Vehicle not found.");
        }
    }
}