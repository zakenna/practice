package animal;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat(String time);
    abstract void sleep(String time);
    abstract void nowLog();
    abstract void showLog();
    abstract void performAction(String action, String time);
}
