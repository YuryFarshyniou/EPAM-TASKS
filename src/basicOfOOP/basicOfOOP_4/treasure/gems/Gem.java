package basicOfOOP.basicOfOOP_4.treasure.gems;

import basicOfOOP.basicOfOOP_4.treasure.Treasure;

public class Gem extends Treasure {
    public Gem(int price, String description) {
        super(price, description);
    }

    @Override
    public String toString() {
        return "Gem: " +
                "price = " + getPrice() +
                ", description = " + getDescription() + '.'
                ;
    }
}
