package programming_with_classes.simplest_classes_and_objects.classes_8;

/* Создать класс Customer, спецификация которого приедена ниже. Определить конструкторы,
set-,get- методы и метод toString(). Создать второй класс,агрегирующий массив типа Customer,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 Класс Customer: id,фамилия, имя, отчество, адрес, номер кредитной карточки,номер банковского счета.
 Найти и вывести:
 а) список покупателей в алфавитном порядке.
 б) список покупателей, у которых номер кредитной карточки находится в заданном интервале. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

    private int id;
    private String lastName;
    private String name;
    private String patronymic;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    // Вводим информацию о новом клиенте.

    public Customer() throws IOException {
        System.out.println("Enter customer's id: ");
        setId(Integer.parseInt(reader.readLine()));
        System.out.println("Enter customer's lastName: ");
        setLastName(reader.readLine());
        System.out.println("Enter customer's name: ");

        setName(reader.readLine());
        System.out.println("Enter customer's patronymic: ");

        setPatronymic(reader.readLine());
        System.out.println("Enter customer's address: ");

        setAddress(reader.readLine());
        System.out.println("Enter customer's credit card number: ");

        setCreditCardNumber(Long.parseLong(reader.readLine()));
        System.out.println("Enter customer's bank account number: ");

        setBankAccountNumber(Long.parseLong(reader.readLine()));
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
