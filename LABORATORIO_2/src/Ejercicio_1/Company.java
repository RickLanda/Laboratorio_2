package Ejercicio_1;

public class Company {
    private String name;
    private Employee[] employees;
    private int nbEmployees;

    public Company(String name, int size) {
        this.name = name;
        employees = new Employee[size];
        nbEmployees = 0;
    }

    public void addEmployee(Employee e) {
        employees[nbEmployees++] = e;
    }

    public Employee getEmployee(String name) {
        for (Employee e : employees) {
            if (e != null && e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public double calculatePayRoll() {
        double payRoll = 0.0;
        for (Employee e : employees) {
            if (e != null) {
                payRoll += e.calculatePay();
            }
        }
        return payRoll;
    }
}