public abstract class  Driver <T extends Transport> {
    private final String fullName;
    private final String categoryDriverLicense;
    private final int driverExperience;
    private final T car;

    protected Driver(String fullName,
                     String categoryDriverLicense,
                     int driverExperience,
                     T car) {
        this.fullName = fullName;
        this.categoryDriverLicense = categoryDriverLicense;
        this.driverExperience = driverExperience;
        this.car = car;
    }

    public void startMovement() {
        System.out.printf("Водитель %s завел машину", this.fullName);
        this.car.startMove();
    }

    public void stopMovement() {
        System.out.printf("Водитель %s заглушил машину", this.fullName);
        this.car.stopMove();
    }

    public void refillAuto() {
        System.out.printf("Водитель %s заправляет %s %s", this.fullName, this.car.getBrand(), this.car.getModel());

     }


    public String getFullName() {
        return fullName;
    }

    public String getCategoryDriverLicense() {
        return categoryDriverLicense;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет учавствовать в заезде",this.fullName,this.car.getBrand(),this.car.getModel());
    }
}
