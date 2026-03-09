package L02_Inheritance_Polymorphism;

public class Vehicle {

    protected String licensePlate;
    protected String brand;
    protected double baseConsumption; // L / 100km

    public Vehicle(String licensePlate, String brand, double baseConsumption) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.baseConsumption = baseConsumption;
    }

    public double calculateFuelNeeded(double distance) {
        return (distance / 100) * baseConsumption;
    }

    public double calculateTripCost(double distance, double fuelPrice) {
        return calculateFuelNeeded(distance) * fuelPrice;
    }

    public String getDetails() {
        return "Plate: " + licensePlate + ", Brand: " + brand;
    }

    // TODO: Override toString
}