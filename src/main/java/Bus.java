public class Bus implements Vehicle {
    private final int wheels;

    public Bus(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }
}
