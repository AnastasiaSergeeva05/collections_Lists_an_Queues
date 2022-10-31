import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competition {
    private final TypeBody bodyType;
    public Car(String brand, String model, float engineVolume,TypeBody bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;

        }


    @Override
    public void startMove() {
        System.out.printf("Машина %s %s начинает двигаться",getBrand(),getModel());

    }

    @Override
    public void stopMove() {
        System.out.printf("Машина %s %s заканчивает двигаться",getBrand(),getModel());

    }

    @Override
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()){
            throw new DiagnoistiksRun("Машина " + getBrand() + " " + getModel()+" не прошла диагностику.");
        }
     }



    @Override
    public void PitStop() {
        System.out.printf("Машина %s %s в ПитСтопе \n",getBrand(),getModel());

    }

    public void infoType(){
        if (this.bodyType != null){
            System.out.println(bodyType);
        }else {
            System.out.println("Нет данных");
        }
    }

    @Override
    public int getbestTime() {
        return ThreadLocalRandom.current().nextInt(1,1400);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,500);
    }
}
