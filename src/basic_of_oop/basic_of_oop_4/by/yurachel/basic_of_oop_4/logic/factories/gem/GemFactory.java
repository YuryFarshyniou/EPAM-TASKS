package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.gem;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.TreasureFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.gems.Gem;

import java.util.Random;

public class GemFactory implements TreasureFactory {

    public Treasure create() {
        String[] adjective = {"Diamond", "Ruby", "Emerald", "Quartz", "Amethyst", "Topaz", "Tanzanite"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1)];

        return new Gem(r.nextInt(9000), firstAdjective + " Gem");
    }
}
