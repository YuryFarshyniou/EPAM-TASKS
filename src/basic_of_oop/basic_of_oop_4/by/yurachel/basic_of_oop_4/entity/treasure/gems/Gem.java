package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.gems;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;

public class Gem extends Treasure {
    public Gem(int price, String description) {
        super(price, description);
    }


    public String toString() {
        return "Gem: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
