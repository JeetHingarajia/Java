
//6.Write a Program Armstrong Number is a positive number if it is equal to the sum
//of cubes of its digits is called Armstrong number and if its sum is not equal to the
//number then it’s not a Armstrong number.
import java.util.Scanner;

class process {

    Scanner scanner = new Scanner(System.in);
    int originalNumber, remainder, result = 0;

    process() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)

            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

class Armstrong {

    public static void main(String[] args) {

        process p = new process();
    }
}