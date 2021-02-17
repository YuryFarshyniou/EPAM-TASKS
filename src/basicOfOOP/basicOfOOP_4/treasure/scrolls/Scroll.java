package basicOfOOP.basicOfOOP_4.treasure.scrolls;

import basicOfOOP.basicOfOOP_4.treasure.Treasure;

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
