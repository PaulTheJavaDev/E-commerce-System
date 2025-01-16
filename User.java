import java.util.HashMap;
import java.util.Scanner;

public class User {
    
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, String> takenUsers = new HashMap<>(); // Key: username, Value: password
    static Account user; // user is first assigned null, changes in the program later, might not change if the user is not assigned
    static boolean userIsLoggedIn = false;
    static boolean userCreated = false;

    public static void createAccount() {
        System.out.println("What would you like your username to be?");
        String usernameAnswer;

        //loops through the taken Usernames and looks if the selected username is taken
        while (true) {
            usernameAnswer = scanner.nextLine();

            if (takenUsers.containsKey(usernameAnswer)) {
                System.out.println("Unavailable Username, please select another one!");
            } else {
                System.out.printf("\nAvailable username, welcome %s!\n", usernameAnswer);
                break;
            }
        }

        System.out.println("What would you like your password to be?");
        String password = scanner.nextLine();

        //stores the username and password in the HashMap + creates an account (helpful for transactions between existing Accounts)
        takenUsers.put(usernameAnswer, password);
        new Account(usernameAnswer, password, 0, false);
        userCreated = true;
    }

    //Login functionality
    public static void login() {

        //checking if user is already logged in
        if (userIsLoggedIn) {
            System.out.println("You are already logged in.");
            return;
        }

        //gets username and password
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Check if the username and password are matching any of the stored users
        if (takenUsers.containsKey(username) && takenUsers.get(username).equals(password)) {
            userIsLoggedIn = true;
            user = new Account(username, password, 0, false);
            System.out.println("Login successful! Welcome " + username);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    //Logout functionality
    public static void logout() {
        if (!userIsLoggedIn) {
            System.out.println("You are not logged in.");
        } else {
            userIsLoggedIn = false;
            user = null;
            System.out.println("You have logged out successfully.");
        }
    }

    //next method here

}
