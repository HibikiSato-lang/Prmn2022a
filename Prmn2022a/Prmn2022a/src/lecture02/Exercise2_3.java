package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {

        Tire[] tires = {
                new Tire(65), new Tire(65), new Tire(65), new Tire(65)
        };

        Engine engine = new Engine(400);
        Car car = new Car(tires, engine);
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }
}
