package animal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ZooManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Animal[] zoo = {new Dog("강아지", 12),
                new Eagle("독수리", 14),
                new Penguin("펭귄", 6),
                new Frog("개구리", 2),
                new Whale("고래", 27)
        };

        while (true) {
            String now = sdf.format(new Date());

            System.out.print("동물의 이름을 입력하세요: ");
            String name = scanner.next();

            System.out.print(name + "의 행동을 입력하세요: ");
            String action = scanner.next();

            Animal target = null;
            for (Animal a : zoo) {
                if (a.name.equals(name)) {
                    target = a;
                    break;
                }
            }

            if (target == null) {
                System.out.println("해당 동물이 존재하지 않습니다.");
                continue;
            }

            if (action.equals("eat")) {
                target.eat(now);
                target.nowLog();
            } else if (action.equals("sleep")) {
                target.sleep(now);
                target.nowLog();
            } else if (action.equals("sound") && target instanceof Soundable) {
                ((Soundable) target).sound(now);
                target.nowLog();
            } else if (action.equals("swim") && target instanceof Swimable) {
                ((Swimable) target).swim(now);
                target.nowLog();
            } else if (action.equals("fly") && target instanceof Flyable) {
                ((Flyable) target).fly(now);
                target.nowLog();
            } else {
                System.out.println("알 수 없는 행동입니다. 종료합니다.");
                break;
            }
        }

        for (Animal animal : zoo) {
            animal.showLog();
        }

    }



}
