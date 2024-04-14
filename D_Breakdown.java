import java.util.Scanner;

class BankDenomination {
    String[] WORDS = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    int[] DENOMINATIONS = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

    BankDenomination() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        System.out.println("====================================");

        // Convert number to words
        System.out.print("Output: ");
        String words = numberToWords(num);
        System.out.println(words);
        System.out.println("====================================");

        // Display denomination breakdown
        System.out.println("DENOMINATION:");
        System.out.println("====================================");
        for (int denomination : DENOMINATIONS) {
            int count = num / denomination;
            if (count > 0) {
                System.out.println(denomination + " X " + count + " = " + (denomination * count));
                num %= denomination;
            }
        }
    }

    String numberToWords(int num) {
        if (num == 0) {
            return "";
        }
        return numberToWords(num / 10) + WORDS[num % 10] + " ";
    }
}

class D_Breakdown {
    public static void main(String[] args) {
        BankDenomination bank = new BankDenomination();
    }
}
