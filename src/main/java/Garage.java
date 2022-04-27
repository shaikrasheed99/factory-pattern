import java.util.ArrayList;

public class Garage {
    private final ArrayList<Vehicle> vehicles;
    VehicleFactory vehicleFactory;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void choose(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void orderVehicleWithNUmberOfWheels(WHEELS wheels) {
        Vehicle vehicle = vehicleFactory.createVehicleWithNumberOfWheels(wheels);
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
