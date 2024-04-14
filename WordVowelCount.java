import java.util.Scanner;

class WordVowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String str = scanner.nextLine();
        str += " ";
        int length = str.length();
        String word = "";
        int vowels = 0;

        System.out.println("---------------------------");
        System.out.println("Word\tVowel");
        System.out.println("---------------------------");

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = 0; j < word.length(); j++) {
                    char k = word.charAt(j);
                    if (k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' || k == 'A' || k == 'E' || k == 'I'
                            || k == 'O' || k == 'U')
                        vowels++;
                }
                System.out.println(word + "\t" + vowels);
                word = "";
                vowels = 0;
            }
        }
        scanner.close();
    }
}
