package Ejercicio_2;

public class IndividualCustomer extends Customer {
    private String card;

    public IndividualCustomer(String name, String card) {
        super(name);
        this.card = card;
    }

    public String getCard() {
        return card;
    }
}
