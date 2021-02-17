package basicOfOOP.basicOfOOP_4;

import java.io.IOException;

public class RunnerCave {
    public static void main(String[] args) throws IOException {

        Cave c = new Cave();
        c.addTreasures();
//        c.showAllTreasures();
//        System.out.println("Most expensive treasure is: " + c.mostExpensive());
        c.treasuresWorth(5000);

    }
}
