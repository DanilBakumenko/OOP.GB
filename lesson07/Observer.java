package lesson07;

public interface Observer {

    void receiveOffer(String companyName, int salary);

    void receiveOffer(Vacancy vacancy);

    boolean getLFJ();

}
