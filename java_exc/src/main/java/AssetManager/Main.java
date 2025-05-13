package AssetManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>();

        Vehicle jetta = new Vehicle(
                "Wilmer's Jetta",
                "2012-05-10",
                5500.00,
                "Jetta GLI",
                2005,
                132000
        );

        Vehicle supra = new Vehicle(
                "Wilmer's Supra",
                "2021-03-15",
                43000.00,
                "Toyota Supra",
                2020,
                100000
        );

        House house1 = new House(
                "My House",
                "2018-09-30",
                480000.00,
                "17 Blossom Way, Blossom City, CA",
                3,
                2200,
                6000
        );

        House house2 = new House(
                "Vacation Home",
                "2020-07-15",
                320000.00,
                "30 Cilantro Ave, San Francisco, CA",
                1,
                1800,
                4000
        );
        myAssets.add(jetta);
        myAssets.add(supra);
        myAssets.add(house1);
        myAssets.add(house2);

        for (Asset asset : myAssets) {
            System.out.println("====================================");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            if (asset instanceof Vehicle ve) {
                Vehicle v = (Vehicle) asset;
                System.out.println("Vehicle: " + v.getYear() + " " + v.getMakeModel());
            } else if (asset instanceof House) {
                House h = (House) asset;
                System.out.println("House Address: " + h.getAddress());
            }
            System.out.println("====================================\n");
        }
    }
}
