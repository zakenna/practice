package animal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dog extends Animal implements Soundable {
    public Dog(String name, int age) {
        super(name, age);
    }

    List<String> dogLog = new ArrayList<>();

    @Override
    void eat(String time) {
        dogLog.add(time + ": " + name + "가 밥을 먹음");
    }

    @Override
    void sleep(String time) {
        dogLog.add(time + ": " + name + "가 잠을 잤음");
    }

    @Override
    public void sound(String time) {
        dogLog.add(time + ": " + name + "가 왈왈 짖음");
    }

    @Override
    public void nowLog() {
        System.out.println(dogLog.getLast());
    }

    @Override
    public void showLog() {
        for (String s : dogLog) {
            System.out.println(s);
        }
    }
}
