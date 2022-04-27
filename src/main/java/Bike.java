public class Bike implements Vehicle {
    private final WHEELS wheels;

    public Bike(WHEELS wheels) {
        this.wheels = wheels;
    }

    @Override
    public WHEELS getWheels() {
        return wheels;
    }
}
