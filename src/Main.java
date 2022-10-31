public class Main {
    public static void main(String[] args) {


        Car car = new Car("BMW", "Z8", 1.5F, TypeBody.SEDAN);
        DriverB driverB = new DriverB("Иван", 7, car);


        Truck truck = new Truck("КАМАЗ", "Avante", 3.4F, TypeCapacity.N2);
        DriverC driverC = new DriverC("Андрей", 7, truck);

        Bus bus = new Bus("ВОЛЖАНИН", "К-67", 3.5F, Capacity.MEDIUM);

        Bus buses = new Bus("Ауди", "A8 50 L TDI quattro", 2.5F, Capacity.SMALL);
        DriverD driverD = new DriverD("Алексей", 6, bus);
        try {
             car.passDiagnostics();


        } catch (DiagnoistiksRun e) {
            System.out.println("т.с " + e.getMessage() + " не прошло т.о ");
        }
        try {
            bus.passDiagnostics();
        } catch (DiagnoistiksRun e) {
            System.out.println("т.с " + e.getMessage() + " не прошло т.о ");
        }

        try {
            truck.passDiagnostics();
        } catch (DiagnoistiksRun e) {
            System.out.println("т.с " + e.getMessage() + " не прошло т.о ");
        }


        car.PitStop();
        bus.PitStop();
        truck.PitStop();

        car.infoType();
        bus.infoType();
        truck.infoType();


        infoCar(car);
        infoBuses(buses);
        infoTruck(truck);
        infoBus(bus);

        System.out.println(driverB + " и максимальная скорость: " + car.getMaxSpeed() + ". Время круга(сек): " + car.getbestTime());
        System.out.println(driverC + " и максимальная скорость: " + truck.getMaxSpeed() + ". Время круга(сек): " + truck.getbestTime());
        System.out.println(driverD + " и максимальная скорость: " + bus.getMaxSpeed() + ". Время круга(сек): " + bus.getbestTime());


    }

    public static void infoCar(Car car) {
        System.out.println(car);
    }

    public static void infoBus(Bus bus) {
        System.out.println(bus);
    }

    public static void infoBuses(Bus buses) {
        System.out.println(buses);
    }

    public static void infoTruck(Truck truck) {
        System.out.println(truck);

    }


}
