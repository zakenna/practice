package animal;

import java.util.ArrayList;
import java.util.List;

public class Eagle extends Animal implements Soundable, Flyable{
    public Eagle(String name, int age) {
        super(name, age);
    }

    List<String> eagleLog = new ArrayList<>();

    @Override
    void eat(String time) {
        eagleLog.add(time + ": " + name + "가 밥을 먹음");
    }

    @Override
    void sleep(String time) {
        eagleLog.add(time + ": " + name + "가 잠을 잤음");
    }

    @Override
    public void sound(String time) {
        eagleLog.add(time + ": " + name + "가 울음소리를 냄");
    }

    @Override
    public void fly(String time) {
        eagleLog.add(time + ": " + name + "가 날아다님");
    }

    @Override
    public void nowLog() {
        System.out.println(eagleLog.getLast());
    }

    @Override
    void showLog() {
        for (String s : eagleLog) {
            System.out.println(s);
        }
    }
    @Override
    public void performAction(String action, String time) {
        switch (action) {
            case "eat": eat(time); break;
            case "sleep": sleep(time); break;
            case "sound": sound(time); break;
            case "fly": fly(time); break;
            default: System.out.println("알 수 없는 행동입니다.");
        }
    }
}
