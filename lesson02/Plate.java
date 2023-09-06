package lesson02;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
    
    public void setFood(int food) {
        if(enoughFood(food)){
            System.out.println("Ам!");
            this.food = food;
        }
        else{
            System.out.println("Еды не хватит");
        }
    }

    public void addFood(int food){
        this.food += food;
    }

    private boolean enoughFood(int a){
        boolean flag = true;
        if(a < 0 ){
            flag = false;
        } 
        return flag;
    }
}
