import java.util.*;
public class Anagram {
    public static void main(String args[]) {
        String word1, word2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("First word is");
        word1 = scanner.nextLine();

        System.out.println("Second word is");
        word2 = scanner.nextLine();

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (String.valueOf(array1).equals(String.valueOf(array2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}