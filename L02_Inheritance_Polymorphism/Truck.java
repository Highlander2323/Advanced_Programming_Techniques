package L02_Inheritance_Polymorphism;

public class Truck extends Vehicle {

    private double cargoWeight; // in tons

    public Truck(String licensePlate, String brand,
                 double baseConsumption, double cargoWeight) {
        super(licensePlate, brand, baseConsumption);
        this.cargoWeight = cargoWeight;
    }

    // TODO: Override calculateFuelNeeded

    // TODO: Override toString
}
