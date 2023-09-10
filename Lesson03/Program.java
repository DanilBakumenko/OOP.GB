import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee, метод должен генерировать
     *   случайного сотрудника типа Worker или Freelancer
     * @return
     */

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(500, 900);
        double freelancerHours = random.nextDouble(0,200);
        int employeeType = random.nextInt(2);

        if(employeeType == 1){
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex,freelancerHours);
        }

        return 
                new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex);
    }

    public static Employee[] generateEmployees(int counter){
        Employee[] employees = new Employee[counter];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }
    public static void main(String[] args) {
        
        Employee[] employees = generateEmployees(12);

        for (Employee employee: employees) {
            System.out.println(employee);
        }


        Arrays.sort(employees, new HourseComparator());

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
