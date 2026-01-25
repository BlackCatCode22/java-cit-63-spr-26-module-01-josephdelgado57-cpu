// https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome to CIT-63.");
    }
}

