package L02_Inheritance_Polymorphism;

public class Car extends Vehicle {

    private boolean airConditioningOn;

    public Car(String licensePlate, String brand,
               double baseConsumption, boolean airConditioningOn) {
        super(licensePlate, brand, baseConsumption);
        this.airConditioningOn = airConditioningOn;
    }

    // TODO: Override calculateFuelNeeded
}
