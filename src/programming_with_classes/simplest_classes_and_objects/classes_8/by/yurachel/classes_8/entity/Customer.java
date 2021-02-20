package programming_with_classes.simplest_classes_and_objects.classes_8.by.yurachel.classes_8.entity;

import java.math.BigInteger;
import java.util.Objects;

public class Customer {

    private int id;
    private String lastName;
    private String name;
    private String patronymic;
    private String address;
    private BigInteger creditCardNumber;
    private BigInteger bankAccountNumber;


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

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(BigInteger creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public BigInteger getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(BigInteger bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(int id, String lastName, String name, String patronymic, String address, BigInteger creditCardNumber, BigInteger bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String toString() {
        return "Information about customer. " + "id: " + id + ", lastName: " + lastName +
                ", name: " + name + ", patronymic: " + patronymic + ", address: " + address +
                ", credit card number: " + creditCardNumber + ", bank account number: " + bankAccountNumber;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(lastName, customer.lastName) &&
                Objects.equals(name, customer.name) && Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(address, customer.address) && Objects.equals(creditCardNumber, customer.creditCardNumber)
                && Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    public int hashCode() {
        return Objects.hash(id, lastName, name, patronymic, address, creditCardNumber, bankAccountNumber);
    }
}
