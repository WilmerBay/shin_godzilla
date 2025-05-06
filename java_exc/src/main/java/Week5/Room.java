package Week5;

public class Room {
    private final int numberOfBeds;
    private final double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {

        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void isDirty(boolean dirtyRoom) {
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public boolean checkIn() {

        if (isAvailable()) {
            occupied = true;
            dirty = true;
            return true;
        }
        return false;
    }


    public void checkOut() {
        isDirty(true);

    }
}
