import java.util.Scanner;
public class strings{
    public static void main(String[] args) {
        // String x = "bunda";
        // String y = "big";
        // System.out.println(x.indexOf("b"));
        // System.out.println(x.toUpperCase());
        // System.out.println(x.toLowerCase());
        // System.out.println(x.length());
        // System.out.println(x.contains("u"));
        // System.out.println(x.substring(1, 3));
        // System.out.println(x.charAt(4));
        // System.out.println(y.concat(x));
        // System.out.println(x.replace("u", "a"));

        // String z = "Hari";
        // int a = z.length();
        // for(int i = 0; i<a; i++){
        //     System.out.print(i+1);
        //     System.out.println(z.charAt(i));

        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        int name_length = name.length();
        String lowercase_name = name.toLowerCase();

        for(int i = 0; i< name_length; i++){
            char current_character = (lowercase_name.charAt(i));
            if(!(current_character == 'a' || current_character == 'e' || current_character == 'i' || current_character == 'o' || current_character == 'u')){
                System.out.println(current_character);
            }
        }
    }
}