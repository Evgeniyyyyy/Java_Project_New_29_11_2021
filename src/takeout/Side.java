package takeout;

public class Side {
    private String sideName;
    private double sidePrice;

    Side (String name, double price) {
        this.sideName = name;
        this.sidePrice = price;
    }

    public String getSideNames() {
        return sideName;
    }

    public double getSidePrice() {
        return sidePrice;
    }

    public void getSideName(String sideName) {
        this.sideName = sideName;
    }

    public void setSidePrice(double sidePrice) {
        this.sidePrice = sidePrice;
    }
}
