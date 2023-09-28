package lesson07;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer observer: observers) {
            observer.receiveOffer(companyName, salary);
        }
    }
    
    @Override
    public void sendOffer(Vacancy vacancy){
        for (Observer observer : observers) {
            if (observer.getLFJ() && vacancy.getVacant()) {
                observer.receiveOffer(vacancy);
                if (observer.getLFJ() == false) vacancy.setQuantityWorkers();
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
