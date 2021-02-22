package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.armors;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;

public class Armor extends Treasure {
    public Armor(int price, String description) {
        super(price, description);
    }


    public String toString() {
        return "Armor: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
