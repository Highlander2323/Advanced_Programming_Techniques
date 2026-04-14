package lab08;

/**
 * Represents a single product in a shopping cart.
 * Reprezintă un singur produs din coș.
 */
public class CartItem {

    private String name;
    private double basePrice;
    private int    quantity;

    public CartItem(String name, double basePrice, int quantity) {
        this.name      = name;
        this.basePrice = basePrice;
        this.quantity  = quantity;
    }

    public String getName()      { return name; }
    public double getBasePrice() { return basePrice; }
    public int    getQuantity()  { return quantity; }

    @Override
    public String toString() {
        return String.format("CartItem{name='%s', price=%.2f, qty=%d}",
                name, basePrice, quantity);
    }
}
