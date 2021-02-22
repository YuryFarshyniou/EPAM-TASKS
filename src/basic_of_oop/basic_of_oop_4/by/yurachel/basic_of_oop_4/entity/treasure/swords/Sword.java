package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.swords;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;

public class Sword extends Treasure {

    public Sword(int price, String description) {
        super(price, description);

    }


    public String toString() {
        return "Sword: " + "price = " + getPrice() +
                ", description = " + getDescription() + '.';
    }
}
