package basic_of_oop.basicOfOOP_4.treasure.scrolls;

import basic_of_oop.basicOfOOP_4.treasure.Treasure;

public class Scroll extends Treasure {
    public Scroll(int price, String description) {
        super(price, description);
    }
    @Override
    public String toString() {
        return "Scroll: " +
                "price = " + getPrice() +
                ", description = " + getDescription() +'.'
                ;
    }
}
