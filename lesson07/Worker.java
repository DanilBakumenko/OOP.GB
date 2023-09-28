package lesson07;

public class Worker implements Observer {

    private String name;

    private int salary = 80000;

    private boolean LFJ = true;

    public Worker(String name) {
        this.name = name;
    }

    public boolean getLFJ(){
        return LFJ;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (LFJ) {
            if (this.salary <= salary) {
                System.out.printf("Работник: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
                        name, companyName, salary);
                LFJ = false;
            } else {
                System.out.printf("Работник: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                        name, companyName, salary);
            }
        } else
            System.out.println("Работник: Я не ищу работу!");
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (LFJ) {
            if (this.salary <= vacancy.getSalary()) {
                System.out.printf("Работник: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
                LFJ = false;
            } else {
                System.out.printf("Работник: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
            }
        } else
            System.out.println("Работник: Я не ищу работу!");
    }
}
