package basicOfOOP.basicOfOOP_4.factories.sword;

import basicOfOOP.basicOfOOP_4.factories.TreasureFactory;
import basicOfOOP.basicOfOOP_4.treasure.Treasure;
import basicOfOOP.basicOfOOP_4.treasure.swords.Sword;

import java.util.Random;

public class SwordFactory implements TreasureFactory {


    @Override
    public Treasure create() {
        String[] adjective = {"Bronze", "Iron", "Magic", "Powerful", "Divine", "Incredible", "Silver"};
        String[] adjective2 ={"Long", "Short", "Heavy", "Easy"};
                Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length-1) ];
        String secondAdjective2 = adjective2[r.nextInt(adjective2.length-1) ];

        return new Sword(r.nextInt(9000), firstAdjective + " " + secondAdjective2 +  " Sword");
    }
}
