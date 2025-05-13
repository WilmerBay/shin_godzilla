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
                1,
                2200,
                6000
        );

        House house2 = new House(
                "Vacation Home",
                "2020-07-15",
                320000.00,
                "30 Cilantro Ave, San Francisco, CA",
                3,
                1800,
                4000
        );
        myAssets.add(jetta);
        myAssets.add(supra);
        myAssets.add(house1);
        myAssets.add(house2);

    }
}
