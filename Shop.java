import java.util.Scanner;

public class Shop {

    static Scanner scanner = new Scanner(System.in);

    public static void addItemToShop() { //not Cart, very important!

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        //add the item to the shop here
        new Product(name, description, price, stock, category);
    }

    public static void deleteItemFromShop() {
        //check if the user is an admin
    }



}
