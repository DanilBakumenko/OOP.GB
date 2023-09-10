public class Freelancer extends Employee {

    public Freelancer(String surName, String name, double salary, double hours) {
        super(surName, name, salary);
        this.hours = hours;
    }

    @Override
    public double calculateSalary(){
        return salary*hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (не фиксированная): %.2f; Часов отработано (за месяц): %.2f",
                surName, name, calculateSalary(), hours);
    }
}
