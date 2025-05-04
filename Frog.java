package animal;

import java.util.ArrayList;
import java.util.List;

public class Frog extends Animal implements Soundable, Swimable{

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat(String time) {
        System.out.println(name+"가 먹고 있습니다.");
    }

    @Override
    void sleep(String time) {
        System.out.println(name+"가 자고 있습니다.");
    }


    List<String> frogLog = new ArrayList<>();
    @Override
    public void sound(String time) {
        System.out.println(name+"가 개굴개굴 울고 있습니다.");
    }

    @Override
    public void swim(String time) {
        System.out.println(name+"가 헤엄을 치고 있습니다.");
    }

    @Override
    public void nowLog() {
        System.out.println(frogLog.getLast());
    }

    @Override
    void showLog() {
        for (String s : frogLog) {
            System.out.println(s);
        }
    }
}
