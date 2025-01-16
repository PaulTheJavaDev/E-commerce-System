import java.util.HashMap;

public class Account {

    private final String username;
    private final String password;
    private int balance;
    private boolean isAdmin;

    public Account(String username, String password, int balance, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.isAdmin = isAdmin;
    }

}
