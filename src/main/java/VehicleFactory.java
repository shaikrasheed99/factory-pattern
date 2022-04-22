public class VehicleFactory {
    public Vehicle order(int wheels) {
        if (wheels == 2) {
            return new Bike(wheels);
        } else if (wheels == 4) {
            return new Car(wheels);
        }
        return null;
    }
}
