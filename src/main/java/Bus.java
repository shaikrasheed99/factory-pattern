public class Bus implements Vehicle {
    private final WHEELS wheels;

    public Bus(WHEELS wheels) {
        this.wheels = wheels;
    }

    @Override
    public WHEELS getWheels() {
        return wheels;
    }
}
