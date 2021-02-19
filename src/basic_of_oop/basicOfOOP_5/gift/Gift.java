package basic_of_oop.basicOfOOP_5.gift;

import basic_of_oop.basicOfOOP_5.factories.sweets.CandyFactory;
import basic_of_oop.basicOfOOP_5.factories.sweets.ChocolateFactory;
import basic_of_oop.basicOfOOP_5.factories.sweets.SweetsFactory;
import basic_of_oop.basicOfOOP_5.factories.wrapping.BoxFactory;
import basic_of_oop.basicOfOOP_5.factories.wrapping.WrappingFactory;
import basic_of_oop.basicOfOOP_5.factories.wrapping.WrappingPaperFactory;
import basic_of_oop.basicOfOOP_5.gift.sweets.Sweets;
import basic_of_oop.basicOfOOP_5.gift.wrapping.Wrapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Gift {
    private Wrapping wrapping;
    private Sweets sweets;
    private int price;
    private BufferedReader reader;

    public int getPrice() {
        return price;
    }

    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    public Sweets getSweets() {
        return sweets;
    }

    public void setSweets(Sweets sweets) {
        this.sweets = sweets;
    }

    // Создаем новый подарок

    public void createGift() throws IOException {
        this.reader = new BufferedReader(new InputStreamReader(System.in));

        // Создаем сладости

//        System.out.println("Enter type of sweet, you want see in your present: ");
//        String typeOfSweets = reader.readLine();

        String typeOfSweets = "Chocolate";
        SweetsFactory sweetsFactory = createSweets(typeOfSweets);

//        System.out.println("Enter " + typeOfSweets + " name.");
//        String name = reader.readLine();
//        System.out.println("Enter " + typeOfSweets + " price.");
//        int price = Integer.parseInt(reader.readLine());
//        System.out.println("Enter " + typeOfSweets + " shape.");
//        String shape = reader.readLine();
//        System.out.println("Enter " + typeOfSweets + " taste.");
//        String taste = reader.readLine();

        this.sweets = sweetsFactory.createSweets("Snikers", 10, "Rectangle", "Milk chocolate with nuts");

        // Создаем обертку.

//        System.out.println("Enter type of wrapping, you want to wrap your gift: ");
//        String wrappingType = reader.readLine();
        String wrappingType = "Box";
        WrappingFactory wrappingFactory = createWrapping(wrappingType);

//        System.out.println("Enter " + wrappingType + " color.");
//        String wrapColor = reader.readLine();
//        System.out.println("Enter " + wrappingType + " price.");
//        int wrapPrice = Integer.parseInt(reader.readLine());

        this.wrapping = wrappingFactory.createWrapping("Black", 4);

        this.price = this.sweets.getPrice() + this.wrapping.getPrice();             // Цена подарка.
    }

    // Выбираем,какие сладости хотим положить в подарок.

    SweetsFactory createSweets(String sweetsType) {
        if (sweetsType.equalsIgnoreCase("Candy")) {
            return new CandyFactory();
        } else if (sweetsType.equalsIgnoreCase("Chocolate")) {
            return new ChocolateFactory();
        }
        return null;
    }

    // Выбираем,какую обертку хотим положить в подарок.

    WrappingFactory createWrapping(String wrappingType) {
        if (wrappingType.equalsIgnoreCase("Box")) {
            return new BoxFactory();
        } else if (wrappingType.equalsIgnoreCase("Wrapping paper")) {
            return new WrappingPaperFactory();
        }
        return null;
    }

    // Подарок.

    @Override
    public String toString() {
        return "Your gift: \n" +
                wrapping + '.' +
                "\n" + sweets +
                ".\nPrice = " + price + '.';
    }

    // Для проверки,одинаковые подарки или нет.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(wrapping, gift.wrapping) && Objects.equals(sweets, gift.sweets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wrapping, sweets);
    }
}
