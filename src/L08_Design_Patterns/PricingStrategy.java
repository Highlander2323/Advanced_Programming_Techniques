package lab08;

/**
 * A functional interface representing a pricing rule.
 * Implementations decide how a single item's final cost is calculated
 * from its base price and quantity.
 *
 * O interfață funcțională reprezentând modul de aplicare al prețului.
 * Implementările decid cum prețul final al unui produs este calculat
 * bazându-se pe prețul de bază și cantitatea.
 */

public interface PricingStrategy {

    /**
     * Computes the final cost for one cart item.
     * Calculează prețul final al unui produs din coș
     *
     * @param basePrice the unit price of the item / prețul unitar
     * @param quantity  the number of units in the cart / cantitatea de produs din coș
     * @return          the total cost after applying this strategy / costul total după aplicarea "strategiei" alese.
     */
    double apply(double basePrice, int quantity);
}
