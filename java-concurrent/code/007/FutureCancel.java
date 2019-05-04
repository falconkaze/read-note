import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureCancel {

    private static ExecutorService executorService =Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws Throwable{
        Future<String> future = executorService.submit(FutureCancel::run);
        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            System.out.println("time out!!!");
        }catch (ExecutionException e) {
            throw e.getCause();
        }finally {
            System.out.println("finally!!!");
            future.cancel(false);
            // future.cancel(true);
        }
        executorService.shutdown();
        System.out.println("end!!!");
    }

    private static String run(){
        try {
            Thread.currentThread().sleep(2000);
        }catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("task end!");
        return "success";
    }


}