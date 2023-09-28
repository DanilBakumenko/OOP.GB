package lesson07;

public class Vacancy {
    String companyName;
    int salary;
    int quantityWorkers;

    boolean vacant;

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public boolean getVacant() {
        return vacant;
    }

    public void setQuantityWorkers() {
        quantityWorkers = quantityWorkers - 1;
        if (quantityWorkers == 0) setVacant();
    }

    private void setVacant() {
        vacant = false;
    }

    Vacancy(String companyName, int salary, int quantityWorkers){
        this.companyName = companyName;
        this.salary = salary;
        this.quantityWorkers = quantityWorkers;
        vacant = true;
    }
}
