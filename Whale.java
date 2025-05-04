package animal;

import java.util.ArrayList;
import java.util.List;

public class Whale extends Animal implements Swimable{
    public Whale(String name, int age) {
        super(name, age);
    }

    List<String> whaleLog = new ArrayList<>();

    @Override
    void eat(String time) {
        whaleLog.add(time + ": " + name + "가 밥을 먹음");
    }

    @Override
    void sleep(String time) {
        whaleLog.add(time + ": " + name + "가 잠을 잤음");
    }

    @Override
    public void swim(String time) {
        whaleLog.add(time + ": " + name + "가 헤엄을 침");
    }

    @Override
    public void nowLog() {
        System.out.println(whaleLog.getLast());
    }

    @Override
    void showLog() {
        for (String s : whaleLog) {
            System.out.println(s);
        }
    }
}
