package L03_Polymorphism_Interfaces;

abstract class SmartDevice implements EnergyConsumable {
    protected String deviceId;
    protected boolean isOn;
    protected int hoursRunning;

    public SmartDevice(String id, int hoursRunning) {
        this.deviceId = id;
        this.isOn = false;
        this.hoursRunning = hoursRunning;
    }

    // Concrete method: Every device shares this logic
    public void togglePower() {
        this.isOn = !this.isOn;
        System.out.println("Device " + deviceId + " is now " + (isOn ? "ON" : "OFF"));
    }

    // Abstract method: Every device calculates consumption differently
    public abstract double calculateKWh();


}
