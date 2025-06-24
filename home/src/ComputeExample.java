import java.util.HashMap;
import java.util.Map;

public class ComputeExample {
    public static void main(String[] args) {
        // Create a HashMap of userId to messages
        Map<Integer, String> userMessages = new HashMap<>();

        // Existing message for user 1
        userMessages.put(1, "Welcome");
//        userMessages.compute(1, (k, v) -> null); // remove existing value at key 1
//        userMessages.put(2, null);

        // Append a new message for user 1
        String newMsg = ", your order has been shipped!";//Ternary Operator: (condition) ? trueResult : falseResult
        userMessages.compute(1, (key, value) -> (value == null) ? newMsg : value.concat(newMsg));

        // Add a message for a new user (user 2)
        String welcomeMsg = "Hello, new user!";
        userMessages.compute(2, (key, value) -> (value == null) ? welcomeMsg : value.concat(welcomeMsg));

        // Print the map
        System.out.println(userMessages);
    }
}
