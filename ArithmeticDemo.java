public class ArithmeticDemo {
    public static void main(String[] args) {

        // Declare and initialize integer variables
        int num1 = 10;
        int num2 = 5;
        
        // Declare and initialize a double variable
        double num3 = 3.0;

        // Perform addition
        int sum = num1 + num2;

        // Perform subtraction
        int difference = num1 - num2;

        // Perform multiplication
        int product = num1 * num2;

        // Perform integer division
        int quotient = num1 / num2;

        // Perform modulus operation (remainder)
        int remainder = num1 % num2;

        // Demonstrate operator precedence with parentheses to enforce order
        int expressionResult = num1 + num2 * 2 - (num1 / num2);  // Multiplication and division happen before addition and subtraction

        // Output the results with labels
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult);  // Explanation: num1 + num2 * 2 - (num1 / num2)
    }
}
