public class App {
    public static void main(String[] args) {
        // Object creations
        Car car = new Car("Toyota", "Red", 2021);
        Car tesla = new ElectricCar("Tesla", "Black", 2021, 100);
        SportsCar ferrari = new SportsCar("Ferrari", "Yellow", 2021, 300);

        // Experiment to see in action
        car.startEngine();
        tesla.startEngine();
        ferrari.startEngine();
        System.out.println();

        car.accelerate();
        tesla.accelerate();
        ferrari.accelerate();
        System.out.println();

        car.brake();
        tesla.brake();
        ferrari.brake();
        ferrari.drift();
    }
}
