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

    public void order(int wheels) {
        Vehicle vehicle = vehicleFactory.create(wheels); //vehicleWithNumberOfWheels
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
