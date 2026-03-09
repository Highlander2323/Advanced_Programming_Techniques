package L03_Polymorphism_Interfaces;

public interface EnergyConsumable {
    double getMonthlyBill(double pricePerKWh);
    void togglePower();
}
