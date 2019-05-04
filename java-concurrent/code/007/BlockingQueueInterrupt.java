import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueInterrupt {

    private static BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        blockingQueue.add("001");
        blockingQueue.add("002");
        blockingQueue.add("003");
        blockingQueue.add("004");
        blockingQueue.add("005");
        Thread.currentThread().interrupt();
        try{
            while(true){
                System.out.println(blockingQueue.take());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}