package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_5;

public class Voucher {
    private String voucherType;
    private String transport;
    private String food;
    private int amountOfDay;
    private int price;


    public String getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAmountOfDay() {
        return amountOfDay;
    }

    public void setAmountOfDay(int amountOfDay) {
        this.amountOfDay = amountOfDay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Voucher(String voucherType, String transport, String food, int amountOfDay, int price) {
        this.voucherType = voucherType;
        this.transport = transport;
        this.food = food;
        this.amountOfDay = amountOfDay;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "voucherType='" + voucherType + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", amountOfDay=" + amountOfDay +
                ", price=" + price +
                '}';
    }
}
