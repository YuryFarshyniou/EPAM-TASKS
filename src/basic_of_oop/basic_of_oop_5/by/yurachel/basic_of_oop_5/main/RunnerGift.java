package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.main;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.Gift;

import java.io.IOException;

public class RunnerGift {
    public static void main(String[] args) throws IOException {
        Gift gift = new Gift();
        gift.createCandies("Candy","Alenka",10,"rectangle","With nuts");
        gift.createWrapping("Box","Black",5);
        gift.calculatePrice();
        System.out.println(gift);

        Gift gift2 = new Gift();
        gift2.createCandies("Candy","Alenka",10,"rectangle","With nuts");
        gift2.createWrapping("Box","Black",5);
        gift2.calculatePrice();
        System.out.println(gift2);

        System.out.println(gift.equals(gift2));
    }
}
