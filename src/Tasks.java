import java.util.Random;

public class Tasks {

    public static void Task1(Random rand) {

        int numList[] = new int [100];

        for (int i = 0; i<100; i++) {
            numList[i]=rand.nextInt(101);
        }

        int numListIndex = 0;
        int sum = 0;
        int max = 0;
        int min = 100;

        for (int number : numList) {
            numListIndex++;
            System.out.printf("%-9s", "Value " + numListIndex);
            System.out.println(" | " + number + "\n");
            sum += number;
            if (number>max) {
                max = number;
            }
            if (number<min) {
                min = number;
            }
        }

        int average = sum/100;
        System.out.println("Sum of all values: " + sum);
        System.out.println("Average of all values: " + average);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);


    }

}
