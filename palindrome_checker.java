import java.util.Scanner;
public class palindrome_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = sc.next();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("the word is palinderome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
