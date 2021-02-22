package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.sword;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.TreasureFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.swords.Sword;

import java.util.Random;

public class SwordFactory implements TreasureFactory {

    public Treasure create() {
        String[] adjective = {"Bronze", "Iron", "Magic", "Powerful", "Divine", "Incredible", "Silver"};
        String[] adjective2 ={"Long", "Short", "Heavy", "Easy"};
                Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length-1) ];
        String secondAdjective2 = adjective2[r.nextInt(adjective2.length-1) ];

        return new Sword(r.nextInt(9000), firstAdjective + " " + secondAdjective2 +  " Sword");
    }
}
