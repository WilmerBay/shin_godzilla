package AssetManager;

    public class House extends Asset {

        private String address;
        private int condition;
        private int squareFoot;
        private int lotSize;

        public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {

            super(description, dateAcquired, originalCost);  // Calls Asset constructor
            this.address = address;
            this.condition = condition;
            this.squareFoot = squareFoot;
            this.lotSize = lotSize;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getCondition() {
            return condition;
        }

        public void setCondition(int condition) {
            this.condition = condition;
        }

        public int getSquareFoot() {
            return squareFoot;
        }

        public void setSquareFoot(int squareFoot) {
            this.squareFoot = squareFoot;
        }

        public int getLotSize() {
            return lotSize;
        }

        public void setLotSize(int lotSize) {
            this.lotSize = lotSize;
        }
        @Override
        public double getValue() {

            double ratePerSquareFoot;
            switch (condition) {
                case 1 -> ratePerSquareFoot = 180.0;
                case 2 -> ratePerSquareFoot = 130.0;
                case 3 -> ratePerSquareFoot = 90.0;
                case 4 -> ratePerSquareFoot = 80.0;
                default -> ratePerSquareFoot = 0.0;
            }
            return (squareFoot * ratePerSquareFoot) + (lotSize * 0.25);
        }
    }

