import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    @Test
    void shouldBeAbleToAddBikeToGarage() {
        Garage garage = new Garage();
        VehicleFactory vehicleFactory = new VehicleFactory();

        garage.choose(vehicleFactory);
        garage.buy(2);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bike = vehicles.get(0);

        assertEquals(2, bike.getWheels());
    }

    @Test
    void shouldBeAbleToAddCarInsideGarage() {
        Garage garage = new Garage();
        VehicleFactory vehicleFactory = new VehicleFactory();

        garage.choose(vehicleFactory);
        garage.buy(4);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle car = vehicles.get(0);

        assertEquals(4, car.getWheels());
    }
}
