import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double maxNumber = 0;
        double minNumber = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();

            try {
                double validNumber = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNumber < minNumber) {
                    minNumber = validNumber;
                }
                if (loopCount == 0 || validNumber > maxNumber) {
                    maxNumber = validNumber;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                System.out.println("you typed: " + nextEntry);
                break;
            }
        }
        System.out.println("loopCount = " + loopCount);
        if (loopCount > 0) {
            System.out.println("min = " + minNumber + ", max = " + maxNumber);
        }
        else {
            System.out.println("No valid data entered");
        }

    }
}