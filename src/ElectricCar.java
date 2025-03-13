public class ElectricCar extends Car {
    // Attributes
    int batteryCapacity;

    // Constructor
	public ElectricCar(String brand, String color, int year, int batteryCapacity) {
        super(brand, color, year);
        this.batteryCapacity = batteryCapacity;
	}

    // Methods
    @Override
    void startEngine() {
        System.out.println(brand + " powered On with battery capacity: " + batteryCapacity);
    }

    void lowBattery() {
        System.out.println(brand + " Electric Car has low battery");
    }
}
