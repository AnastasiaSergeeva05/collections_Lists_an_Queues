import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competition {
    private final TypeCapacity typeCapacity;

    public Truck(String brand, String model, float engineVolume, TypeCapacity typeCapacity) {
        super(brand, model, engineVolume);
        this.typeCapacity = typeCapacity;
    }

    @Override
    public void startMove() {
        System.out.printf("Грузовик %s %s начинает двигаться", getBrand(), getModel());

    }

    @Override
    public void stopMove() {
        System.out.printf("Грузовик %s %s заканчивает двигаться", getBrand(), getModel());

    }

    @Override
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()){
            throw  new DiagnoistiksRun("Грузовик " +getBrand() + " " +getModel()+" не прошел ТО" );
        }
     }

    @Override
    public void PitStop() {
        System.out.printf("Грузовики %s %s в ПитСтопе\n", getBrand(), getModel());

    }

    public void infoType(){
        if (this.typeCapacity != null){
            System.out.println(this.typeCapacity);
        }else {
            System.out.println(" нет данных");
        }
    }
    @Override

    public int getbestTime() {
        return ThreadLocalRandom.current().nextInt(1, 1500);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 190);
    }
}
