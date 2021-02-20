package programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.main;

import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.entity.Queue;
import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.logic.Add;
import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.logic.Sort;
import programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.view.Show;

import java.io.IOException;
import java.math.BigInteger;

public class CustomersRunner {

    public static void main(String[] args) throws IOException {
        Queue l = new Queue();
        Add add = new Add();
        Sort sort = new Sort();
        Show show = new Show();

        add.addCustomers(l.getCustomers(), 1, "Farshinev", "Yura", "Gennadievich", "Mogilev",
                new BigInteger("7545453512346445"), new BigInteger("41234645768745232"));
        add.addCustomers(l.getCustomers(), 2, "Ivanov", "Gleb", "Nickolaevich", "Minsk",
                new BigInteger("1234567832569867"), new BigInteger("41234645768745232"));
        add.addCustomers(l.getCustomers(), 3, "Petrov", "Sasha", "Evgenievich", "Mogilev",
                new BigInteger("1500432300516754"), new BigInteger("41234645768745232"));
        add.addCustomers(l.getCustomers(), 4, "Sidorov", "Dima", "Aleksandrovich", "Brest",
                new BigInteger("9876407879764323"), new BigInteger("41234645768745232"));
        add.addCustomers(l.getCustomers(), 5, "Momonov", "Vania", "Nickolaevich", "Mogilev",
                new BigInteger("7689234512345555"), new BigInteger("41234645768745232"));


//        show.showCustomers(l.getCustomers());

//        sort.alphabeticSort(l.getCustomers(),"descending");
//        System.out.println("**********************************************");
//        show.showCustomers(l.getCustomers());

        show.customersIntervalCards(l.getCustomers(), 4444_4444_4444_4444L, 9000_0000_0000_0000L);

    }
}
