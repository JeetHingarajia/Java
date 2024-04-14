import java.util.Scanner;

public class Search_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a main string: ");
        String ms = sc.nextLine();
        System.out.println("Enter a substring: ");
        String ss = sc.nextLine();
        int l = ms.length();
        int i, p = 0, freq = 0;

        for (i = 0; i < l; i++) {
            char ch = ms.charAt(i);
            if (ch == ' ') {
                String word = ms.substring(p, i);
                if (word.equalsIgnoreCase(ss)) {
                    freq++;
                }
                p = i + 1;
            }
        }
        System.out.println("No of times substring is present in the main string: " + freq);
        sc.close();
    }
}