public class Car implements Vehicle {
    private final WHEELS wheels;

    public Car(WHEELS wheels) {
        this.wheels = wheels;
    }

    @Override
    public WHEELS getWheels() {
        return wheels;
    }
}
