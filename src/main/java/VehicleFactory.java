public class VehicleFactory {
    public Vehicle createVehicleWithNumberOfWheels(WHEELS wheels) {
        if (wheels == WHEELS.BIKE_WHEELS) {
            return new Bike(wheels);
        } else if (wheels == WHEELS.CAR_WHEELS) {
            return new Car(wheels);
        } else if (wheels == WHEELS.BUS_WHEELS) {
            return new Bus(wheels);
        }
        return null;
    }
}
