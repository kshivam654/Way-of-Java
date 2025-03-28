import java.util.Optional;

public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Bitwise Operators
        int p = 5; // 0101
        int q = 3; // 0011
        System.out.println("Bitwise AND: " + (p & q)); // 0001
        System.out.println("Bitwise OR: " + (p | q)); // 0111
        System.out.println("Bitwise XOR: " + (p ^ q)); // 0110
        System.out.println("Bitwise Complement: " + (~p)); // 1010
        System.out.println("Left Shift: " + (p << 1)); // 1010
        System.out.println("Right Shift: " + (p >> 1)); // 0010

        // Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Assignment (+=): " + c);
        c -= 3; // c = c - 3
        System.out.println("Assignment (-=): " + c);
        c *= 2; // c = c * 2
        System.out.println("Assignment (*=): " + c);
        c /= 4; // c = c / 4
        System.out.println("Assignment (/=): " + c);
        c %= 3; // c = c % 3
        System.out.println("Assignment (%=): " + c);

        // Unary Operators
        int d = 5;
        System.out.println("Unary Plus: " + (+d));
        System.out.println("Unary Minus: " + (-d));
        System.out.println("Increment: " + (++d)); // Pre-increment
        System.out.println("Decrement: " + (--d)); // Pre-decrement
        System.out.println("Post Increment: " + (d++)); // Post-increment
        System.out.println("Post Decrement: " + (d--)); // Post-decrement
        System.out.println("Final Value: " + d); // Final value after post-decrement

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator (Max): " + max);

        // Instanceof Operator
        String str = "Hello";
        boolean result = str instanceof String;
        System.out.println("Instanceof Operator: " + result);

        // Type Casting
        double e = 10.5;
        int f = (int) e; // Explicit casting
        System.out.println("Type Casting (double to int): " + f);

        // String Concatenation
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // Concatenation
        System.out.println("String Concatenation: " + str3);

        // Ternary Operator
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Ternary Operator (Eligibility): " + eligibility);

        // Null Coalescing Operator (Java 14+)
        String name = null;
        String defaultName = "Default Name";
        String finalName = (name != null) ? name : defaultName;
        System.out.println("Null Coalescing Operator: " + finalName);

        // Null Safe Operator (Java 14+)
        String nullableString = null;
        String safeString = (nullableString != null) ? nullableString : "Safe Value";
        System.out.println("Null Safe Operator: " + safeString);

        // Optional Chaining (Java 8+)
        Optional<String> optionalString = Optional.ofNullable(nullableString);
        String chainedString = optionalString.orElse("Chained Value");
        System.out.println("Optional Chaining: " + chainedString);

        // Pattern Matching for instanceof (Java 16+)
        Object obj = "Hello";
        if (obj instanceof String strObj) {
            System.out.println("Pattern Matching for instanceof: " + strObj);
        } else {
            System.out.println("Not a String");
        }
    }
}
