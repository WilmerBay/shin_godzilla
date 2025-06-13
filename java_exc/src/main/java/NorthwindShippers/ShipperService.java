package NorthwindShippers;

import java.util.List;

public class ShipperService {
    private final ShipperDAO dao = new ShipperDAO();

    public int createShipper(String name, String phone) {
        return dao.insert(name, phone);
    }

    public List<Shipper> getAllShippers() {
        return dao.getAll();
    }

    public boolean updatePhone(int id, String phone) {
        return dao.updatePhone(id, phone);
    }

    public boolean deleteShipper(int id) {
        return dao.delete(id);
    }
}
