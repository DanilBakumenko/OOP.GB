public abstract class Employee implements Comparable<Employee> {
    
    protected String surName;

    protected String name;

    protected double salary;
    
    protected double hours;

    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }
}
