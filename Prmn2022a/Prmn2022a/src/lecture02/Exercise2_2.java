package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Tire[] tires = {};
        Engine engine = new Engine(0);
        Car car =new Car(tires, engine);
        GasStation gs = new GasStation();

        car.run();
        gs.refuel(car);
        car.run();
    }
}
