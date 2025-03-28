public class datatypes {
    public static void main(String[] args){
        // Primitive Data Types
        int a = 10; // Integer
        double b = 20.5; // Double
        char c = 'A'; // Character
        boolean d = true; // Boolean

        // Non-Primitive Data Types
        String str = "Hello, World!"; // String
        int[] arr = {1, 2, 3, 4, 5}; // Array

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}