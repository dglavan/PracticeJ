import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ScannerExample {
    public static void main(String[] args) {
        int a;
        float b;
        String s;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        s = scanner.nextLine();
        System.out.println("You entered following string: " + s);

        System.out.println("Enter a integer: ");
        a = scanner.nextInt();
        System.out.println("You entered following Int: " + a);

        System.out.println("Enter a float: ");
        b = scanner.nextFloat();
        System.out.println("You entered following float: " + b);
    }
}