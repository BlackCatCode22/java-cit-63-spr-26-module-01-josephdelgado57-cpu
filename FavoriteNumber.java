//https://www.w3school.com/java/java_user_input.asp
import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favorite whole number: ");

        int favnumber = input.nextInt();

        System.out.println("Wow, " + favnumber + "  is a great number!");

        System.out.println("If you double it, you get " + (favnumber * 2) + "!");
    }
}

