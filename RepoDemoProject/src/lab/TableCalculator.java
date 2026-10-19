package lab;

public class TableCalculator {

    public static void main(String[] args) {
        int number = 5; // You can change this number to print any table
        
        System.out.println("=== Multiplication Table of " + number + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}