package Test_java;

public class Toy {
    private static Integer counter = 0;
    private Integer id;
    private String name;
    
    public Toy(String name){
        this.id = counter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    // public void setWeight(Integer totalQnt) {
    //     this.weight = (double)qantity/totalQnt;
    // }

    // public void setQantity() {
    //     this.qantity -= 1 ;
    // }


    // public double getWeight() {
    //     return weight;
    // }

    // public Integer getQantity() {
    //     return qantity;
    // }
    @Override
    public String toString(){
        return String.format("Name of toy: %s", name);
    }

    public void print(){
        System.out.println(" "+id + " " + name);
    }
}
