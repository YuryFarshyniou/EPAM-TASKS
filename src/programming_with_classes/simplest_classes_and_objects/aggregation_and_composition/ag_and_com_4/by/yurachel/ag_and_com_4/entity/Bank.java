package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.entity;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Client> clients;

    {
        clients = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Добавляем нового клиента.

    public void addNewClient(Client client) {
        clients.add(client);
    }

    // Блокировка счета.

    public void blockAccount(BigInteger bankAccountName) {
        boolean isExist = false;
        for (Client client : clients) {
            for (BankAccount account : client.getBankAccounts()) {
                if (account.getBankAccountName().compareTo(bankAccountName) == 0 && account.isAvailable()) {
                    account.setAvailable(false);
                    System.out.println("This account blocked");
                    isExist = true;
                } else if (account.getBankAccountName().compareTo(bankAccountName) == 0 && !account.isAvailable()) {
                    System.out.println("This account is already blocked.");
                    isExist = true;
                }
            }
        }
        if (!isExist) System.out.println("We can't find an account.");
    }


    // Разблокировка счета.

    public void unblockAccount(BigInteger bankAccountName) {
        boolean isExist = false;
        for (Client client : clients) {
            for (BankAccount account : client.getBankAccounts()) {
                if (account.getBankAccountName().compareTo(bankAccountName) == 0 && !account.isAvailable()) {
                    account.setAvailable(true);
                    System.out.println("This account unblocked.");
                    isExist = true;
                } else if (account.getBankAccountName().compareTo(bankAccountName) == 0 && account.isAvailable()) {
                    System.out.println("This account is already unblocked.");
                    isExist = true;
                }
            }
        }
        if (!isExist) System.out.println("We can't find account.");
    }


    // Поиск клиента по имени и фамилии.

    public Client searchClient(String name, String lastName) {
        Client client = null;
        for (Client client1 : clients) {
            if (client1.getName().equalsIgnoreCase(name) && client1.getLastName().equalsIgnoreCase(lastName)) {
                client = client1;
            }
        }
        return client;
    }

    // Поиск счета.

    public BankAccount findingAccount(BigInteger bankAccountName) {
        for (Client client : clients) {
            for (BankAccount account : client.getBankAccounts()) {
                if (account.getBankAccountName().compareTo(bankAccountName) == 0) {
                    return account;
                }
            }
        }
        return null;
    }

    // Вычисление общей суммы по счетам.

    public int accountSum(String customerName, String customerLastName) {
        int sum = 0;
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(customerName) &&
                    client.getLastName().equalsIgnoreCase(customerLastName)) {
                for (BankAccount account : client.getBankAccounts()) {
                    sum += account.getAmountOfMoney();
                }
            }
        }
        return sum;
    }

    // Вычисление общей суммы по счетам, имеющим положительный баланс.

    public int accountPosSum(String clientName, String clientLastName) {
        int positiveSum = 0;
        for (Client client : clients) {
            for (BankAccount bankAccount : client.getBankAccounts()) {
                if (client.getName().equalsIgnoreCase(clientName) &&
                        client.getLastName().equalsIgnoreCase(clientLastName) &&
                        bankAccount.getAmountOfMoney() > 0) {
                    positiveSum += bankAccount.getAmountOfMoney();
                }
            }
        }
        return positiveSum;
    }


    // Вычисление общей суммы по счетам, имеющим отрицательный баланс.

    public int accountNegSum(String clientName, String clientLastName) {
        int negativeSum = 0;
        for (Client client : clients) {
            for (BankAccount bankAccount : client.getBankAccounts()) {
                if (client.getName().equalsIgnoreCase(clientName) &&
                        client.getLastName().equalsIgnoreCase(clientLastName) &&
                        bankAccount.getAmountOfMoney() < 0) {
                    negativeSum += bankAccount.getAmountOfMoney();

                }
            }
        }
        return negativeSum;
    }

    @Override
    public String toString() {
        return "Bank: " + "bankName='" + bankName;
    }
}
