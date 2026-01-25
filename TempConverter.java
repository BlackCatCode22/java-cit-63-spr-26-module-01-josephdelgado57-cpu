// https://www.w3schools.com/java/java_operators.asp
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}

