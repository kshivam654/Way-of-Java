# Day 01: Java Fundamentals Learning Notes

## 1. Data Types
### Primitive Data Types
- **int**: Whole numbers (`10`)
- **double**: Decimal numbers (`20.5`)
- **char**: Single characters (`'A'`)
- **boolean**: True/false values (`true`, `false`)

### Non-Primitive Data Types
- **String**: Text sequences (`"Hello, World!"`)
- **Array**: Collection of similar data types (`int[] arr = {1, 2, 3}`)

## 2. Operators
### Basic Operators
- **Arithmetic**: `+`, `-`, `*`, `/`, `%`
- **Relational**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical**: `&&`, `||`, `!`
- **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`

### Advanced Operators
- **Bitwise**: `&`, `|`, `^`, `~`, `<<`, `>>`
- **Unary**: `++`, `--`, `+`, `-`
- **Ternary**: `condition ? value1 : value2`
- **Type Casting**: `(int)doubleValue`

### Modern Java Features
- Pattern Matching (`instanceof`)
- Optional Chaining
- Null Safety

## 3. Input/Output Methods

### Scanner Class
```java
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();    // Read string
int number = scanner.nextInt();       // Read integer
```

### BufferedReader
```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String line = reader.readLine();      // Read string
```

### Output Formatting
1. Simple Output
   - `System.out.println()`: Print with newline
   - `System.out.print()`: Print without newline

2. Formatted Output (`printf`)
   - `%s`: String placeholder
   - `%d`: Integer placeholder
   - `%f`: Float/Double placeholder
   - `%n`: Platform-independent newline
   - Examples:
     ```java
     System.out.printf("Hello, %s! Age: %d%n", name, age);
     System.out.printf("Amount: $%,.2f%n", money);
     ```

## Best Practices Learned
1. Always close Scanner and BufferedReader after use
2. Use proper error handling with try-catch blocks
3. Validate user input before processing
4. Use meaningful variable names
5. Format output for better readability

## Terminal Commands
```bash
# Compile Java file
javac filename.java

# Run Java program
java filename
```

## Practice Exercises
1. Create simple calculator using arithmetic operators
2. Read user input and validate it
3. Format different types of output
4. Work with multiple data types
5. Use different operators in combinations

## Next Steps
- Practice error handling
- Learn about type conversion
- Explore more about String manipulation
- Study control flow statements