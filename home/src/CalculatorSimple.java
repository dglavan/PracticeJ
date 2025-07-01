import java.util.Scanner;

public class CalculatorSimple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operation(+,-,*,/): ");
        char operation = scanner.next().charAt(0);
        double result=0d;
        switch (operation){
            case '+': result = num1 + num2;break;
            case '-': result = num1 - num2;break;
            case '*': result = num1 * num2;break;
            case '/':
                if(num2!=0){
                    result = num1 / num2;break;
                }
                else {
                    System.out.println("Cannot divide by 0!");break;
                }
            default:throw new IllegalArgumentException("Invalid operation!");
        }
        System.out.println("Result: " + result);
    }
}
