import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {
    private Garage garage;

    @BeforeEach
    void setUpGarageAndVehicleFactory() {
        garage = new Garage();
        VehicleFactory vehicleFactory = new VehicleFactory();
        garage.choose(vehicleFactory);
    }

    @Test
    void shouldBeAbleToPlaceBikeInsideGarage() {
        garage.order(WHEELS.BIKE_WHEELS);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bike = vehicles.get(0);

        assertEquals(WHEELS.BIKE_WHEELS, bike.getWheels());
    }

    @Test
    void shouldBeAbleToPlaceCarInsideGarage() {
        garage.order(WHEELS.CAR_WHEELS);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle car = vehicles.get(0);

        assertEquals(WHEELS.CAR_WHEELS, car.getWheels());
    }

    @Test
    void shouldBeAbleToPlaceBusInsideGarage() {
        garage.order(WHEELS.BUS_WHEELS);
        ArrayList<Vehicle> vehicles = garage.getVehicles();
        Vehicle bus = vehicles.get(0);

        assertEquals(WHEELS.BUS_WHEELS, bus.getWheels());
    }
}
