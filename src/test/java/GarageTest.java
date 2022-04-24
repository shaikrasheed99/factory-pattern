import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    private Garage garage;
    private VehicleFactory vehicleFactory;

    @BeforeEach
    void setUpGarageAndVehicleFactory() {
        garage = new Garage();
        vehicleFactory = new VehicleFactory();
    }

    @Test
    void shouldBeAbleToPlaceBikeInsideGarage() {
        garage.choose(vehicleFactory);
        garage.order(2);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bike = vehicles.get(0);

        assertEquals(2, bike.getWheels());
    }

    @Test
    void shouldBeAbleToPlaceCarInsideGarage() {
        garage.choose(vehicleFactory);
        garage.order(4);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle car = vehicles.get(0);

        assertEquals(4, car.getWheels());
    }

    @Test
    void shouldBeAbleToPlaceBusInsideGarage() {
        garage.choose(vehicleFactory);
        garage.order(6);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bus = vehicles.get(0);

        assertEquals(6, bus.getWheels());
    }
}
