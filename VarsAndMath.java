// https://www.w3schools.com/java/java_variables.asp
public class VarsAndMath {
    public static void main(String[] args) {
        
        int apples = 10;
        int oranges = 5;
        double pricePerFruit = 0.50;

        int totalFruit = apples +oranges;
        double totalCost = totalFruit * pricePerFruit;

        System.out.println("Total number of fruit: " + totalFruit);
        System.out.println("The total cost is: $" + totalCost);
    }
}

