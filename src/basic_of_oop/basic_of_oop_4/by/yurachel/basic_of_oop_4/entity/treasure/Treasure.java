package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure;

public abstract class Treasure {
    private int price;
    private String description;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Treasure(int price, String description) {
        this.price = price;
        this.description = description;
    }


}
