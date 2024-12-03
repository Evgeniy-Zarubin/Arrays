import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] threeNumbers = new int[3];
        threeNumbers[0] = 1;
        threeNumbers[1] = 2;
        threeNumbers[2] = 3;
        double[] numbers = {1.57, 7.654, 9.986};

        //Задача 2
        for (int i = 0; i < threeNumbers.length; i++) {
            if (i < threeNumbers.length - 1) {
                System.out.print(threeNumbers[i] + ", ");
            } else System.out.println(threeNumbers[i]);

        }
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else System.out.print(numbers[i]);
        }

        //Задача 3
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(threeNumbers[i] + ", ");
            } else System.out.print(threeNumbers[i]);

        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else System.out.print(numbers[i]);
        }

        //Задача 4
        System.out.println();
        for (int i = 0; i < threeNumbers.length; i++) {
            if (threeNumbers[i] % 2 == 1) {
                threeNumbers[i] += 1;
            }
        }
            System.out.println(Arrays.toString(threeNumbers));

    }
}