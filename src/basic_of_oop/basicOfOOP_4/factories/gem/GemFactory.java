package basic_of_oop.basicOfOOP_4.factories.gem;

import basic_of_oop.basicOfOOP_4.factories.TreasureFactory;
import basic_of_oop.basicOfOOP_4.treasure.Treasure;
import basic_of_oop.basicOfOOP_4.treasure.gems.Gem;

import java.util.Random;

public class GemFactory implements TreasureFactory {

    @Override
    public Treasure create() {
        String[] adjective = {"Diamond", "Ruby", "Emerald", "Quartz", "Amethyst", "Topaz", "Tanzanite"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1)];

        return new Gem(r.nextInt(9000), firstAdjective + " Gem");
    }
}
