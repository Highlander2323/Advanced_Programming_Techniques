package lab08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Manages a collection of cart items and applies a swappable PricingStrategy.
 * Gestionează o colecție de produse și aplică o PricingStrategy interschimbabilă.
 */
public class ShoppingCart {

    private List<CartItem> items    = new ArrayList<>();
    private PricingStrategy strategy;

    public ShoppingCart(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    /** Swaps the active pricing strategy at runtime. */
    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    /**
     * TODO: Returns the total cost of the cart by applying the current strategy
     * to every item and summing the results.
     * TODO: Returnează costul total aplicând strategia curentă fiecărui produs.
     * Use .mapToDouble() and .sum().
     * Utilizați .mapToDouble() și .sum().
     */
    public double getTotalCost() {
        // TODO
        return 0;
    }

    /**
     * TODO: Returns an Optional<CartItem> containing the item with the highest base price.
     * TODO: Returnează un Optional<CartItem> cu produsul cel mai scump (basePrice maxim).
     * Use .max() with a Comparator.
     * Utilizați .max() cu un Comparator.
     */
    public Optional<CartItem> getMostExpensiveItem() {
        // TODO
        return Optional.empty();
    }

    /**
     * TODO: Returns a list of items whose base price is strictly above the threshold.
     * TODO: Returnează lista produselor al căror preț de bază depășește strict pragul.
     * Use .filter() and .collect().
     * Utilizați .filter() și .collect().
     */
    public List<CartItem> getItemsAbovePrice(double threshold) {
        // TODO
        return null;
    }

    /**
     * TODO: Returns a single String listing every item name separated by ", ".
     * TODO: Returnează un singur String cu toate numele produselor separate prin ", ".
     * Use .map() and Collectors.joining(", ").
     * Utilizați .map() și Collectors.joining(", ").
     */
    public String getCartSummaryLine() {
        // TODO
        return null;
    }

    /**
     * TODO: Prints every item whose quantity is strictly above minQty.
     * TODO: Afișează fiecare produs a cărui cantitate depășește strict minQty.
     * Use .filter() and .forEach() with a lambda. No .collect() needed.
     * Utilizați .filter() și .forEach() cu un lambda. .collect() nu este necesar.
     */
    public void printItemsWithQuantityAbove(int minQty) {
        // TODO
    }
}
