package NorthwindShippers;

public class Shipper {
    private int id;
    private String name;
    private String phone;

    public Shipper(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return String.format("Shipper ID: %d | Name: %s | Phone: %s", id, name, phone);
    }
}
