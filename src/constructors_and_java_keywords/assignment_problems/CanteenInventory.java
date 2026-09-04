package constructors_and_java_keywords.assignment_problems;

public class CanteenInventory {

    String itemName;
    int quantity;

    public CanteenInventory(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void restock(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void printDetails() {
        System.out.println(itemName + " | Quantity: " + quantity);
    }

    public static void main(String[] args) {

        CanteenInventory[] items = {
                new CanteenInventory("Rice", 50),
                new CanteenInventory("Juice", 30),
                new CanteenInventory("Biscuits", 40),
                new CanteenInventory("Sandwich", 25)
        };

        for (CanteenInventory item : items) {
            item.restock(20);
        }

        for (CanteenInventory item : items) {
            item.printDetails();
        }
    }
}