package Ejercicio_3;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public boolean performTask(Task task) {
        System.out.println(name + "  está realizando la tarea: " + task.getName());
        return true;
    }
}