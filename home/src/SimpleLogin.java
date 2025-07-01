import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args){

        String login = "admin";
        String password = "password";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println(("Enter password: "));
        String pass = scanner.nextLine();

        if(login.equals(username) && password.equals(pass)){
            System.out.println("Login successful!");
        }
        else{
            System.out.println("Login failed!");
        }
    }
}
