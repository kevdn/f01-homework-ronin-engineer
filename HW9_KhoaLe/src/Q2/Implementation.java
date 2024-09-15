package Q2;
interface vehicle {
    void start();
    void stop();
}

class Car implements vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Implementation {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
