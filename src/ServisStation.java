import java.util.LinkedList;
import java.util.Queue;

public class ServisStation {
    private final Queue<Transport> serviceQueue = new LinkedList<>();
    public void  addQueue(Transport transport){


    }

    public void addToQueue(Car car){
        serviceQueue.add(car);
    }
    public void addtoQueue(Truck truck){
        serviceQueue.add(truck);
    }

    public void service(){
        Transport next = serviceQueue.poll();
        if (next != null ){
            System.out.println("Сервис" + next.getModel() + " " + next.getBrand());
        }
    }
}
