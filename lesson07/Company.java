package lesson07;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    // колличеесвто вакантных мест
    private int vacancies;

    public Company(String name, Publisher jobAgency, int maxSalary, int vacancies) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.vacancies = vacancies;
        
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    public void weHaveVacancy(){
        jobAgency.sendOffer(new Vacancy(name, random.nextInt(maxSalary), vacancies));
    }
}
