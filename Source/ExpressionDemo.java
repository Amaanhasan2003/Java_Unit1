
public class ExpressionDemo {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        // Expression without parentheses
        // Multiplication (*) has higher precedence than addition (+)
        int result1 = a + b * c; // 10 + (5 * 2) = 10 + 10 = 20

        // Expression with parentheses
        int result2 = (a + b) * c; // (10 + 5) * 2 = 15 * 2 = 30

        // Expression mixing multiple operators
        // * and / are evaluated before + and -, and left-to-right for same precedence
        int result3 = a + b * c - 4 / 2; // 10 + (5 * 2) - (4 / 2) = 10 + 10 - 2 = 18

        System.out.println("Expression: a + b * c");
        System.out.println("Result (a + b * c) = " + result1);

        System.out.println("\nExpression: (a + b) * c");
        System.out.println("Result ((a + b) * c) = " + result2);

        System.out.println("\nExpression: a + b * c - 4 / 2");
        System.out.println("Result (a + b * c - 4 / 2) = " + result3);

        // Example with mixed data types (implicit type conversion via cast)
        double result4 = a + b / (double) c; // (double)(b/c) or b/(double)c; division first, then added to a
        // b / (double)c = 5 / 2.0 = 2.5;  a + 2.5 = 12.5
        System.out.println("\nExpression: a + b / (double)c");
        System.out.println("Result (a + b / (double)c) = " + result4);
    }
}
