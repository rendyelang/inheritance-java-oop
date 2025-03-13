public class SportsCar extends Car {
    // Attributes
    int maxSpeed;

    // Constructor
    public SportsCar(String brand, String color, int year, int maxSpeed) {
        super(brand, color, year);
        this.maxSpeed = maxSpeed;
    }

    // Methods
    void drift() {
        System.out.println(brand + " Sports Car is drifting at max speed: " + maxSpeed + " km/h");
    }
}
