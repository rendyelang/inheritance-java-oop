public class Car {
    // Atributes
    protected String brand;
    protected String color;
    protected int year;

    // Constructor
    Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }
    
    // Methods
    void startEngine() {
        System.out.println(brand + " Car engine is starting");
    }
    void accelerate() {
        System.out.println(brand + "Car is accelerating");
    }
    void brake() {
        System.out.println(brand + " Car is breaking");
    }
}
