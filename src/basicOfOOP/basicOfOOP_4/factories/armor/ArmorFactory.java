package basicOfOOP.basicOfOOP_4.factories.armor;

import basicOfOOP.basicOfOOP_4.factories.TreasureFactory;
import basicOfOOP.basicOfOOP_4.treasure.Treasure;
import basicOfOOP.basicOfOOP_4.treasure.armors.Armor;

import java.util.Random;

public class ArmorFactory implements TreasureFactory {


    @Override
    public Treasure create() {
        String []adjective = {"Magic", "Powerful", "Divine", "Incredible"};
        String [] adjective2 = {"Iron", "Bronze", "Silver", "Leather"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length-1) ];
        String secondAdjective2 = adjective2[r.nextInt(adjective2.length-1) ];

        return new Armor(r.nextInt(9000) , firstAdjective + " " + secondAdjective2 +  " Armor");
    }
}
