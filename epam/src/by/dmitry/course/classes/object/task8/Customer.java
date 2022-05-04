package by.dmitry.course.classes.object.task8;

public class Customer {
    private static int idCounter;
    private final int accountId;
    private String name;
    private String Surname;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int bankAccountNumber;

    public Customer(String name, String surname, String patronymic, String address, int cardNumber, int bankAccountNumber) {
        this.accountId = ++idCounter;
        this.name = name;
        Surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                "}\n";
    }
}
