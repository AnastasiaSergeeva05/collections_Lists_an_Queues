import java.util.concurrent.ThreadLocalRandom;

public abstract class Transport {

    private final String brand;

    private final String model;

    private final float engineVolume;

    protected Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void startMove();

    public abstract void stopMove();

     public abstract void passDiagnostics();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
