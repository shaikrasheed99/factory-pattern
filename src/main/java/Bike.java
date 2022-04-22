public class Bike implements Vehicle {
    private final int wheels;

    public Bike(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }
}
