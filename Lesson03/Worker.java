public class Worker extends Employee {
    
    public Worker(String surName, String name, double salary) {
        super(surName, name, salary);
        this.hours = 160;
    }

    @Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f",
                surName, name, calculateSalary());
    }
}
