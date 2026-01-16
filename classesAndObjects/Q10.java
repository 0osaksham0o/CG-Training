package classesAndObjects;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}



public class Q10 {
    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 2500);
        cart.addItem(2);
        cart.removeItem(1);
        cart.displayTotalCost();
    }

}
