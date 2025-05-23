package Generics;

import java.util.ArrayList;
import java.util.List;

public class ChihuahuaBag {
    private final List<Chihuahua> items = new ArrayList<>();

    public void add(Chihuahua chihuahua) {
        items.add(chihuahua);
    }

    public void printContents() {
        for (Chihuahua chihuahua : items) {
            System.out.println(chihuahua);
        }
    }
}
