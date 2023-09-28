package lesson07;

public class Student implements Observer {

    private String name;

    private int salary = 2000;

    private boolean LFJ;

    public Student(String name) {
        this.name = name;
        LFJ = true;
    }

    public boolean getLFJ() {
        return LFJ;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (LFJ) {
            if (this.salary <= salary) {
                System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
                        name, companyName, salary);
                this.salary = salary;
                LFJ = false;
            } else {
                System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                        name, companyName, salary);
            }
        } else
            System.out.println("Студент: Я не ищу работу!");
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (LFJ) {
            if (this.salary <= vacancy.getSalary()) {
                System.out.printf("Студент: %s: Мне нужна эта работа! (Компания: %s; Заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
                this.salary = vacancy.getSalary();
                LFJ = false;
            } else {
                System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Заработная плата: %d)\n",
                        name, vacancy.getCompanyName(), vacancy.getSalary());
            }
        } else
            System.out.println("Студент: Я не ищу работу!");
    }
}
