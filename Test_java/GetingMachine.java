package Test_java;

import java.util.ArrayList;
import java.util.Random;

public class GetingMachine {
    private ArrayList<Toy> box = new ArrayList<>();
    public Integer totalQnt = 0;
    private ArrayList<Integer> qantityOf = new ArrayList<>();
    private ArrayList<Double> weight = new ArrayList<>();

    public void add(Toy toy,int qantity){
        this.totalQnt += qantity;
        if (box.contains(toy)) {
            setQantityOf(qantity,toy.getId());
            setWeight();
        }
        else {
            setQantityOf(qantity);
            weight.add(null);
            setWeight();
        }
        for (int i = 0; i < qantity; i++) {
            box.add(toy);
        }
    }

    private void setQantityOf(Integer qantity) {
        qantityOf.add(qantity);
    }

    private void setQantityOf(Integer qantity, Integer id){
        qantityOf.set(id,qantityOf.get(id)+qantity);
    }

    private void setQantityOf(Toy toy){
        qantityOf.set(toy.getId(),qantityOf.get(toy.getId())-1);
    }

    public void setWeight() {
        for (int i = 0; i < weight.size(); i++) {
            weight.set(i, (double)qantityOf.get(i)/totalQnt);
        }
    }
    
    public Toy getRandomToy(){
        Toy toy = box.get(randomNum());
        totalQnt--;
        setQantityOf(toy);
        setWeight();
        box.remove(toy);
        return toy;
    }

    private int randomNum(){
        Random rnd = new Random();
        return rnd.nextInt(totalQnt); 
    }
}
