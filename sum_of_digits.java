import java.util.Scanner;

public class sum_of_digits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a collection of numbers:");
        int numbers = sc.nextInt();
        int a = numbers;
        int s = 0;
        while(a!=0){
            int r = a% 10;
            s = s+r;
            a = a/10;

        }
        System.out.println(s);

    }

        
}