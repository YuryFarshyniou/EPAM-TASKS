package programmingWithClasses.simplestCLassesAndObjects.Classes_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CustomersList {
    ArrayList<Customer> customers = new ArrayList<>();

    // Добавляем клиента.

    void addCustomers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many customers do you want to add? ");
        int number = Integer.parseInt(reader.readLine());
        if (number <= 0) return;
        for (int i = 0; i < number; i++) {
            customers.add(new Customer());
        }
    }

    // Выводим список клиентов на консоль.

    void show(ArrayList<Customer> list) {
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    // Сортируем пофамильно по алфавиту.

    void alphabeticSort(ArrayList<Customer>customers){
        LastNameCompare l = new LastNameCompare();
        customers.sort(l);
    }


}