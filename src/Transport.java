//import java.sql.Driver;
import java.util.List;

public abstract class Transport {

    private final String brand;

    private final String model;

    private final float engineVolume;

    private final Driver driver;

    private final List<Mehanik>mehaniks;

    private final List<Sponsor>sponsors;

    public List<Mehanik> getMehaniks() {
        return mehaniks;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    protected Transport(String brand, String model, float engineVolume, Driver driver, List<Mehanik> mehaniks, List<Sponsor> sponsors) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mehaniks = mehaniks;

        this.sponsors = sponsors;
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
    public void infoPerson(){
        System.out.println(" " + driver.getFullName());
        for (Sponsor sponsor: sponsors){
            System.out.println(sponsor);
            for (Mehanik mehanik:mehaniks){
                System.out.println(mehanik);
            }
        }
    }

    public Driver getDriver() {
        return driver;
    }
}
