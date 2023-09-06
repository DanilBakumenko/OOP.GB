package lesson02;

// Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
// Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
// Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
// Достаточно выполнить первые 2 подпункта задачи.

public class Cat {

    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getFull(){
        return full;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void CatInfo(){
        System.out.printf("Name %s, appetite %d, cat is full %b\n",name, appetite, full);
    }

    public void eat(int food) {
        if (appetite <= food) {
            full = true;
        }
    }
}
