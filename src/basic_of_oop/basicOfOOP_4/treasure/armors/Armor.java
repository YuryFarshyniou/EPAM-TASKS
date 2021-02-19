package basic_of_oop.basicOfOOP_4.treasure.armors;

import basic_of_oop.basicOfOOP_4.treasure.Treasure;

public class Armor extends Treasure {
    public Armor(int price, String description) {
        super(price, description);
    }

    @Override
    public String toString() {
        return "Armor: " +
                "price = " + getPrice() +
                ", description = " + getDescription() + '.'
                ;
    }
}
