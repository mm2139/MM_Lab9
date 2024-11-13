import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int valuesArray[] = new int[100];

        for (int i = 0; i < 100; i++) {
            valuesArray[i] = rand.nextInt(101);
        }

        int numListIndex = 0;
        int sum = 0;
        int max = 0;
        int min = 100;

        for (int number : valuesArray) {
            numListIndex++;
            System.out.printf("%-9s", "Value " + numListIndex);
            System.out.println(" | " + number + "\n");
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        int average = sum / 100;
        System.out.println("Sum of all values: " + sum);
        System.out.println("Average of all values: " + average);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min + "\n");


        int userNum = InputHelper.getRangedInt(scan, "Please input an integer within the following range", 1, 100);
        int checker = 0;
        for (int i = 0; i<valuesArray.length; i++) {
            if (valuesArray[i]==userNum) {
                checker++;
            }
        }
        System.out.println("The number " + userNum + " appeared in the list of values " + checker + " times.\n");

        checker = -1;

        userNum = InputHelper.getRangedInt(scan, "Please input another integer within the following range", 1, 100);
        for (int i = 0; i<valuesArray.length; i++) {
            if (valuesArray[i]==userNum) {
                checker = i;
                break;
            }
        }

        if (checker == -1) {
            System.out.println("The number " + userNum + " does not appear in the list of values.");
        } else {
            System.out.println("The value Value " + (checker+1) + " appears in the array at index " + checker + ".");
        }

    }

}