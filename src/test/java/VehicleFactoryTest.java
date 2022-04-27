import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleFactoryTest {
    @Test
    void shouldBeAbleToCreateBikeWithTwoWheels() {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle bike = vehicleFactory.createVehicleWithNumberOfWheels(WHEELS.BIKE_WHEELS);

        assertEquals(WHEELS.BIKE_WHEELS, bike.getWheels());
    }
}
