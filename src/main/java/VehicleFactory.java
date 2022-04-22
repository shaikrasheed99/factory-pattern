public class VehicleFactory {
    public Bike order(int wheels) {
        if (wheels == 2) {
            return new Bike(wheels);
        }
        return null;
    }
}
