package basic_of_oop.basicOfOOP_4.factories.scroll;

import basic_of_oop.basicOfOOP_4.factories.TreasureFactory;
import basic_of_oop.basicOfOOP_4.treasure.Treasure;
import basic_of_oop.basicOfOOP_4.treasure.scrolls.Scroll;

import java.util.Random;

public class ScrollFactory implements TreasureFactory {

    @Override
    public Treasure create() {
        String[] adjective = {"Old", "Fire", "Death", "Magic", "Powerful", "Divine", "Incredible"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1)];

        return new Scroll(r.nextInt(9000), firstAdjective + " Scroll");
    }
}
