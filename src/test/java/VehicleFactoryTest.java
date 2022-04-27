import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleFactoryTest {
    private VehicleFactory vehicleFactory;

    @BeforeEach
    void setUpVehicleFactory() {
        vehicleFactory = new VehicleFactory();
    }

    @Test
    void shouldBeAbleToCreateBikeWithTwoWheels() {
        Vehicle bike = vehicleFactory.createVehicleWithNumberOfWheels(WHEELS.BIKE_WHEELS);

        assertEquals(WHEELS.BIKE_WHEELS, bike.getWheels());
    }

    @Test
    void shouldBeAbleToCreateCarWithFourWheels() {
        Vehicle car = vehicleFactory.createVehicleWithNumberOfWheels(WHEELS.CAR_WHEELS);

        assertEquals(WHEELS.CAR_WHEELS, car.getWheels());
    }
}
