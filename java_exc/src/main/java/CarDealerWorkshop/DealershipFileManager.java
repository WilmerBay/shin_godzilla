package CarDealerWorkshop;

import java.io.*;

public class DealershipFileManager {

    private static final String FILE = "vehicles.csv";

    public Dealership getDealership() {

        Dealership dealership = new Dealership("Locked & Loaded Motors", "1 Prison Road, Alcatraz Island, CA 94133", "415-252-8729");

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                if (parts.length == 8) {
                    String vin = parts[0];
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String type = parts[4];
                    String color = parts[5];
                    double odometer = Double.parseDouble(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);

                    dealership.addVehicle(vehicle);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return dealership;
    }
}