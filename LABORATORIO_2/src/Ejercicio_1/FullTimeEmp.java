package Ejercicio_1;

public class FullTimeEmp extends Employee {
    private double salary;

    public FullTimeEmp(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salario: " + salary);
    }
}
