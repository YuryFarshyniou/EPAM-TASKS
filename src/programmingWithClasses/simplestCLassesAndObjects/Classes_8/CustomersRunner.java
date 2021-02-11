package programmingWithClasses.simplestCLassesAndObjects.Classes_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class CustomersRunner {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomersList l = new CustomersList();
        l.addCustomers();
        System.out.println("List of our customers: ");
        l.show(l.customers);

        System.out.println("Do you want sort customers in alphabetic sort or by credit card interval?(a//i)");
        String answer = reader.readLine();

        // Сортируем по алфавиту пофамильно в возрастающем или убывающем порядке.

        if (answer.equals("a")) {
            System.out.println("Do you want sort in ascending or descending order?(a//d)");
            String answerSort = reader.readLine();
            if (answerSort.equals("a")) {
                l.alphabeticSort(l.customers);
                System.out.println("Customers sorted in ascending order: ");
                l.show(l.customers);
            } else if (answerSort.equals("d")) {
                l.alphabeticSort(l.customers);
                Collections.reverse(l.customers);
                System.out.println("Customers sorted  in descending order: ");
                l.show(l.customers);
            } else {
                System.out.println("You chose wrong option.");
            }

            // Сортируем по интервалу карт.

        } else if (answer.equals("i")) {
            System.out.println("Enter min interval:");
            long min = Long.parseLong(reader.readLine());
            System.out.println("Enter max interval: ");
            long max = Long.parseLong(reader.readLine());
            l.customersIntervalCards(min, max);
        } else {
            System.out.println("You chose wrong option.Try again.");
        }
    }
}
