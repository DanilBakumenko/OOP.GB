import java.util.Comparator;

public class HourseComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        
        return Double.compare(o2.getHours(), o1.getHours());

        // return o1.getHours() == o2.getHours() ? 0 :
        //             o1.getHours() < o2.getHours() ? 1 : -1;
    }
    
}
