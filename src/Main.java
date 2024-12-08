import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] payMonth = new int[5];
        payMonth[0] = 22300;
        payMonth[1] = 18241;
        payMonth[2] = 78960;
        payMonth[3] = 33431;
        payMonth[4] = 148202;
        int sum = 0;
        int sum2 = 0;

        for (int element : payMonth) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        int[] payWeak = {32441, 150112, 553111, 240760, 225877};
        int maxPayWeak = 0;
        int minPayWeak = payWeak[0];

        for (int s : payWeak) {
            if (s < minPayWeak) {
                minPayWeak = s;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayWeak + " рублей");

        for (int i = 0; i < payWeak.length; i++) {
            if (payWeak[i] > maxPayWeak) {
                maxPayWeak = payWeak[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayWeak + " рублей");

        //Задача 3
        int[] payMiddle = {5461123, 235003, 24001, 125301, 800127};
        double middle;

        for (int element : payMiddle) {
            sum2 = sum2 + element;
        }
        middle = sum2 / payMiddle.length;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = tmp;
        }
        for (int i = 0; i<reverseFullName.length; i++){
            System.out.print(reverseFullName [i]);
        }
    }
}