import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class io {
    public static void main(String[] args) {
        // Try different methods one by one
        basicScanner();
        // advancedScanner();
        // bufferReader();
        // formatOutput();
    }

    // Basic Scanner usage - Good for beginners
    public static void basicScanner() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Basic Scanner Demo ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.printf("Hello, %s! You are %d years old.%n", name, age);
        scanner.close();
    }

    // Advanced Scanner with error handling
    public static void advancedScanner() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== Advanced Scanner Demo ===");
        int number = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter a number between 1-100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 1 && number <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Number must be between 1-100!");
                }
            } else {
                System.out.println("That's not a valid number!");
                scanner.next(); // Clear invalid input
            }
        }
        
        System.out.println("Valid number entered: " + number);
        scanner.close();
    }

    // BufferedReader example - Better for reading strings
    public static void bufferReader() {
        try {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
            );
            
            System.out.println("\n=== BufferedReader Demo ===");
            System.out.print("Write a sentence: ");
            String sentence = reader.readLine();
            
            System.out.println("Your sentence: " + sentence);
            System.out.println("Character count: " + sentence.length());
            
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    // Different ways to format output
    public static void formatOutput() {
        String name = "John";
        int age = 25;
        double salary = 2500.50;
        
        System.out.println("\n=== Output Formatting Demo ===");
        
        // Simple println
        System.out.println("1. Simple println: " + name + " is " + age + " years old");
        
        // printf with format specifiers
        System.out.printf("2. Printf: %s is %d years old%n", name, age);
        
        // Formatting numbers
        System.out.printf("3. Salary: $%,.2f%n", salary);
        
        // Left-justified text (%-10s)
        System.out.printf("4. |%-10s|%n", name);    // Left aligned
        System.out.printf("5. |%10s|%n", name);     // Right aligned
    }
}
