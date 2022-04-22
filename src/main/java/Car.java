public class Car implements Vehicle {
    private final int wheels;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }
}
