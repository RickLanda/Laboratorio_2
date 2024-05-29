package Ejercicio_2;

public abstract class Customer {
    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    public void pay(Order order) {

        System.out.println(name + " ha pagado " + order.getPrice() + " por el pedido realizado en " + order.getDate());
    }

    public String getName() {
        return name;
    }
}