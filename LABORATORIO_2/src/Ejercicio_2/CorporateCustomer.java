package Ejercicio_2;

public class CorporateCustomer extends Customer {
    private String account;

    public CorporateCustomer(String name, String account) {
        super(name);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}