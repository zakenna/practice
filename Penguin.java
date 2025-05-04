package animal;

import java.util.ArrayList;
import java.util.List;

public class Penguin extends Animal implements Swimable{
    public Penguin(String name, int age) {
        super(name, age);
    }

    List<String> penguinLog = new ArrayList<>();

    @Override
    void eat(String time) {
        penguinLog.add(time + ": " + name + "가 밥을 먹음");
    }

    @Override
    void sleep(String time) {
        penguinLog.add(time + ": " + name + "가 잠을 잤음");
    }

    @Override
    public void swim(String time) {
        penguinLog.add(time + ": " + name + "가 헤엄을 침");
    }

    @Override
    public void nowLog() {
        System.out.println(penguinLog.getLast());
    }

    @Override
    void showLog() {
        for (String s : penguinLog) {
            System.out.println(s);
        }
    }
}
