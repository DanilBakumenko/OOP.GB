package lesson07;

public class Freelancer implements Observer {

    private String name;

    private int salary = 35000;

    private boolean LFJ = true;

    public Freelancer(String name) {
        this.name = name;
    }

    public boolean getLFJ() {
        return LFJ;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (LFJ) {
            if (this.salary <= salary) {
                System.out.printf("Фрилансер: %s: Беру этот проект! (Компания: %s; Заработная плата: %d)\n",
                        name, companyName, salary);
                LFJ = false;
            } else {
                System.out.printf("Фрилансер: %s: Поищу проект получше! (Компания: %s; Заработная плата: %d)\n",
                        name, companyName, salary);
            }

        } else
            System.out.println("Фрилансер: Я не ищу работу!");
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (LFJ) {
            if (this.salary <= vacancy.getSalary()) {
                System.out.printf("Фрилансер: %s: Беру этот проект! (Компания: %s; Заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
                LFJ = false;
            } else {
                System.out.printf("Фрилансер: %s: Поищу проект получше! (Компания: %s; Заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
            }
        } else
            System.out.println("Фрилансер: Я не ищу работу!");
    }

}
