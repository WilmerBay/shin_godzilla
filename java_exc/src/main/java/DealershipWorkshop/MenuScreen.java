package DealershipWorkshop;

import java.util.List;
import java.util.Scanner;

public class MenuScreen {
    private final Scanner scanner = new Scanner(System.in);
    private final VehicleDao dao = new VehicleDao();
    private final SalesDao salesDao = new SalesDao();
    private final LeaseDao leaseDao = new LeaseDao();

    public void launch() {
        while (true) {
            System.out.println("\n=== Car Dealership Menu ===");
            System.out.println("1. Show All Vehicles");
            System.out.println("2. Search Vehicles by Price");
            System.out.println("3. Search Vehicles by Make/Model");
            System.out.println("4. Search Vehicles by Year Range");
            System.out.println("5. Search Vehicles by Color");
            System.out.println("6. Add a Vehicle");
            System.out.println("7. Remove a Vehicle by VIN");
            System.out.println("8. Record a Sale");
            System.out.println("9. Record a Lease");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1" -> showAllVehicles();
                case "2" -> searchByPrice();
                case "3" -> searchByMakeModel();
                case "4" -> searchByYearRange();
                case "5" -> searchByColor();
                case "6" -> addVehicle();
                case "7" -> removeVehicle();
                case "8" -> recordSale();
                case "9" -> recordLease();
                case "0" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void showAllVehicles() {
        printVehicles(dao.getByPriceRange(0, Double.MAX_VALUE));
    }

    private void searchByPrice() {
        try {
            System.out.print("Min price: ");
            double min = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Max price: ");
            double max = Double.parseDouble(scanner.nextLine().trim());
            printVehicles(dao.getByPriceRange(min, max));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered. Please try again.");
        }
    }

    private void searchByMakeModel() {
        System.out.print("Make: ");
        String make = scanner.nextLine().trim();
        System.out.print("Model: ");
        String model = scanner.nextLine().trim();
        printVehicles(dao.getByMakeModel(make, model));
    }

    private void searchByYearRange() {
        try {
            System.out.print("Min year: ");
            int min = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Max year: ");
            int max = Integer.parseInt(scanner.nextLine().trim());
            printVehicles(dao.getByYearRange(min, max));
        } catch (NumberFormatException e) {
            System.out.println("Invalid year entered. Please enter whole numbers.");
        }
    }

    private void searchByColor() {
        System.out.print("Color: ");
        String color = scanner.nextLine().trim();
        printVehicles(dao.getByColor(color));
    }

    private void addVehicle() {
        try {
            System.out.print("VIN: ");
            String vin = scanner.nextLine().trim();
            System.out.print("Make: ");
            String make = scanner.nextLine().trim();
            System.out.print("Model: ");
            String model = scanner.nextLine().trim();
            System.out.print("Year: ");
            int year = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Color: ");
            String color = scanner.nextLine().trim();
            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Sold (true/false): ");
            boolean sold = Boolean.parseBoolean(scanner.nextLine().trim());

            dao.addVehicle(new Vehicle(vin, make, model, year, color, price, sold));
            System.out.println("Vehicle added.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please check that all numeric fields are correct.");
        }
    }

    private void removeVehicle() {
        System.out.print("Enter VIN to remove: ");
        String vin = scanner.nextLine().trim();
        dao.removeVehicleByVin(vin);
        System.out.println("Vehicle removed if it existed.");
    }

    private void recordSale() {
        try {
            System.out.print("VIN: ");
            String vin = scanner.nextLine().trim();
            System.out.print("Customer Name: ");
            String customer = scanner.nextLine().trim();
            System.out.print("Sale Date (yyyy-MM-dd): ");
            String date = scanner.nextLine().trim();
            System.out.print("Sale Price: ");
            double price = Double.parseDouble(scanner.nextLine().trim());

            salesDao.saveSale(vin, customer, date, price);
        } catch (Exception e) {
            System.out.println("Invalid input. Please double-check all fields.");
        }
    }

    private void recordLease() {
        try {
            System.out.print("VIN: ");
            String vin = scanner.nextLine().trim();
            System.out.print("Customer Name: ");
            String customer = scanner.nextLine().trim();
            System.out.print("Lease Start Date (yyyy-MM-dd): ");
            String start = scanner.nextLine().trim();
            System.out.print("Lease End Date (yyyy-MM-dd): ");
            String end = scanner.nextLine().trim();
            System.out.print("Monthly Payment: ");
            double payment = Double.parseDouble(scanner.nextLine().trim());

            leaseDao.saveLease(vin, customer, start, end, payment);
        } catch (Exception e) {
            System.out.println("Invalid input. Please double-check all fields.");
        }
    }

    private void printVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        for (Vehicle v : vehicles) {
            System.out.printf("VIN: %s | %s %s (%d) | %s | $%.2f | Sold: %b\n",
                    v.getVin(), v.getMake(), v.getModel(), v.getYear(),
                    v.getColor(), v.getPrice(), v.isSold());
        }
    }
}
