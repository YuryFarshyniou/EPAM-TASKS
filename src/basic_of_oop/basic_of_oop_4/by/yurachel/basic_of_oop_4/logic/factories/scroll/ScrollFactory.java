package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.scroll;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.TreasureFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.scrolls.Scroll;

import java.util.Random;

public class ScrollFactory implements TreasureFactory {


    public Treasure create() {
        String[] adjective = {"Old", "Fire", "Death", "Magic", "Powerful", "Divine", "Incredible"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length - 1)];

        return new Scroll(r.nextInt(9000), firstAdjective + " Scroll");
    }
}
