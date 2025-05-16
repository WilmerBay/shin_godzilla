package Generics;

import java.util.ArrayList;
import java.util.List;

public class LaptopBag {
    private final List<Laptop> items = new ArrayList<>();

    public void add(Laptop laptop) {
        items.add(laptop);
    }

    public void printContents() {
        for (Laptop laptop : items) {
            System.out.println(laptop);
        }
    }
}
