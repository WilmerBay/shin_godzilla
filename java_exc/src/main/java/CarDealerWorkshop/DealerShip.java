package CarDealerWorkshop;

import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    String name;
    String address;
    String phone;

    List<Vehicle> inventory = new ArrayList<>();


    List<Vehicle> GetVehicleByPrice = new ArrayList<>(); // making new list for (min, max)
    List<Vehicle> vehicleByMakeModel = new ArrayList<>();
    List<Vehicle> vehicleByYear = new ArrayList<>();
    List<Vehicle> vehicleByColor = new ArrayList<>();
    List<Vehicle> vehicleByMileage = new ArrayList<>();
    List<Vehicle> vehicleByType = new ArrayList<>(); // suv, truck, sedan, coupe, etc
    get all vehicles() : List <Vehicle>
    addVehicle(vehicle);
    removeVehicle(vehicle);
}
