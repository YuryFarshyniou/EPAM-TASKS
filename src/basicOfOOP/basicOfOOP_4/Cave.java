package basicOfOOP.basicOfOOP_4;

import basicOfOOP.basicOfOOP_4.factories.TreasureFactory;
import basicOfOOP.basicOfOOP_4.factories.armor.ArmorFactory;
import basicOfOOP.basicOfOOP_4.factories.gem.GemFactory;
import basicOfOOP.basicOfOOP_4.factories.random.RandomFactories;
import basicOfOOP.basicOfOOP_4.factories.scroll.ScrollFactory;
import basicOfOOP.basicOfOOP_4.factories.sword.SwordFactory;
import basicOfOOP.basicOfOOP_4.treasure.Treasure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cave {

    private ArrayList<Treasure> treasuresList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public ArrayList<Treasure> getTreasuresList() {
        return treasuresList;
    }

    public void setTreasuresList(ArrayList<Treasure> treasuresList) {
        this.treasuresList = treasuresList;
    }

    // Добавляем сокровища в список.

    public void addTreasures() {
        RandomFactories r = new RandomFactories(new TreasureFactory[]{
                new ArmorFactory(), new GemFactory(), new SwordFactory(),
                new ScrollFactory()
        });
        for (int i = 0; i < 100; i++) {
            Treasure treasure = r.create();
            treasuresList.add(treasure);
        }
    }

    // Выводим все сокровища.

    public void showAllTreasures() {
        for (Treasure treasures : treasuresList) {
            System.out.println(treasures);
        }
    }

    // Выбор самого дорогого по стоимости сокровища.

    public Treasure mostExpensive() {

        Treasure expensive = null;
        int price = Integer.MIN_VALUE;
        for (int i = 0; i < treasuresList.size(); i++) {
            if (treasuresList.get(i).getPrice() > price) {
                price = treasuresList.get(i).getPrice();
                expensive = treasuresList.get(i);
            }
        }
        return expensive;
    }

    // Выбор сокровищ на заданную сумму.

    public void treasuresWorth(int sum) throws IOException {
        int index1 = 1;
        Map<Integer, Treasure> treasuresWorthList = new HashMap<>();

        while (true) {
            System.out.println("Sum is " + sum + ":");
            Map<Integer, Treasure> treasuresList = new HashMap<>();
            int index = 1;
            for (Treasure treasure : this.treasuresList) {
                if (treasure.getPrice() < sum) {
                    treasuresList.put(index, treasure);
                    index++;
                }
            }
            if (treasuresList.size() == 0) {
                break;
            } else {
                for (Map.Entry treasure : treasuresList.entrySet()) {
                    System.out.println(treasure.getKey() + " " + treasure.getValue());
                }
                System.out.println("Enter treasure number: ");
                int number = Integer.parseInt(reader.readLine());
                treasuresWorthList.put(index1, treasuresList.get(number));
                index1++;
                sum -= treasuresList.get(number).getPrice();
            }
        }

        // Выводим выбранные сокровища.

        System.out.println("Our treasures list: ");
        for (Map.Entry treasure : treasuresWorthList.entrySet()) {
            System.out.println(treasure.getKey() + " " + treasure.getValue());
        }
    }
}


