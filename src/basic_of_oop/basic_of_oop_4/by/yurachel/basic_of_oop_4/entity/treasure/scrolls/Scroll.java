package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.scrolls;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;

public class Scroll extends Treasure {
    public Scroll(int price, String description) {
        super(price, description);
    }

    public String toString() {
        return "Scroll: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
