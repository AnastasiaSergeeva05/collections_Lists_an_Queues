import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competition {
    private final Capacity capacity;
    public Bus(String brand, String model, float engineVolume,Capacity capacity) {

        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    @Override
    public void startMove() {
        System.out.printf("Автобус %s %s начинает двигаться",getBrand(),getModel());
    }

    @Override
    public void stopMove() {
        System.out.printf("Автобус %s %s начинает двигаться",getBrand(), getModel());

    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобус " + getModel() + getBrand() + " не нужно ТО");
    }

    public void infoType(){
        if (this.capacity != null){
            System.out.println(capacity);
        }else {
            System.out.println("нет данных");
        }
}
    @Override
    public void PitStop() {
        System.out.printf("Автобус %s %s в ПитСтопе \n",getBrand(),getModel());
    }

    @Override
    public int getbestTime() {
        return ThreadLocalRandom.current().nextInt(1,1500);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,200);
    }
}
