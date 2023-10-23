package arithmetic;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        // Get the operation input from the user
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.next();
        ArithmeticOperation operation = ArithmeticOperation.valueOf(operationInput.toUpperCase());

        double result = r.calculate(m, n, operation);
        System.out.println("Result: " + result);
    }
}

enum ArithmeticOperation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}
