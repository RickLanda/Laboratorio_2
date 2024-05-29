package Ejercicio_1;

public class PartTimeEmp extends Employee {
    private int nbWorkingHours;
    private double payRate;

    public PartTimeEmp(String name, int id, int nbWorkingHours, double payRate) {
        super(name, id);
        this.nbWorkingHours = nbWorkingHours;
        this.payRate = payRate;
    }

    public int getNbWorkingHours() {
        return nbWorkingHours;
    }

    public double getPayRate() {
        return payRate;
    }

    @Override
    public double calculatePay() {
        return nbWorkingHours * payRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Horas trabajadas: " + nbWorkingHours + ", Pago por hora: " + payRate);
    }
}