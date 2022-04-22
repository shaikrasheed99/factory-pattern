public class VehicleFactory {
    public Vehicle order(int wheels) {
        if (wheels == 2) {
            return new Bike(wheels);
        } else if (wheels == 4) {
            return new Car(wheels);
        } else if (wheels == 6) {
            return new Bus(6);
        }
        return null;
    }
}
