package animal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZooManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Map<String, Animal> zoo = new HashMap<>();
        zoo.put("강아지", new Dog("강아지", 5));
        zoo.put("펭귄", new Penguin("펭귄", 3));
        zoo.put("독수리", new Penguin("독수리", 13));
        zoo.put("고래", new Penguin("고래", 32));
        zoo.put("개구리", new Penguin("개구리", 1));

        while (true) {
            System.out.print("동물 이름 입력 (종료: exit): ");
            String name = scanner.next();
            if (name.equals("exit")) break;

            Animal animal = zoo.get(name);
            if (animal == null) {
                System.out.println("해당 동물이 없습니다.");
                continue;
            }

            System.out.print("동물 행동 입력 (eat/sleep/sound/swim): ");
            String action = scanner.next();
            String time = sdf.format(new Date());
            animal.performAction(action, time);
            animal.showLog();
        }
    }
}
