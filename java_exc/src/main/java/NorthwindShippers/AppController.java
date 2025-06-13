package NorthwindShippers;

import java.util.List;
import java.util.Scanner;

public class AppController {
    private final Scanner scanner = new Scanner(System.in);
    private final ShipperService service = new ShipperService();

    public void run() {
        // 1. Create new shipper
        System.out.print("Enter new shipper name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        int newId = service.createShipper(name, phone);
        System.out.println("New shipper inserted with ID: " + newId);

        // 2. Show all
        displayAll();

        // 3. Update phone
        System.out.print("\nEnter shipper ID to update phone: ");
        int updateId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new phone number: ");
        String newPhone = scanner.nextLine();

        if (service.updatePhone(updateId, newPhone)) {
            System.out.println("Phone updated.");
        } else {
            System.out.println("Update failed.");
        }

        displayAll();

        // 4. Delete shipper
        System.out.print("\nEnter shipper ID to delete: ");
        int deleteId = Integer.parseInt(scanner.nextLine());

        if (deleteId <= 3) {
            System.out.println("⚠ Cannot delete protected IDs 1–3.");
        } else if (service.deleteShipper(deleteId)) {
            System.out.println("Shipper deleted.");
        } else {
            System.out.println("Delete failed.");
        }

        displayAll();
    }

    private void displayAll() {
        List<Shipper> shippers = service.getAllShippers();
        System.out.println("\nCurrent Shippers:");
        for (Shipper s : shippers) {
            System.out.println(s);
        }
    }
}
