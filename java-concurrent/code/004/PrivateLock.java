import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class PrivateLock {

  private Object lock = new Object();
  private int value = 0;

  void method(){
    synchronized(lock){
      System.out.println(++value);
    }
  }

}

class Main {

  private static ExecutorService executorService = Executors.newFixedThreadPool(10);

  public static void main(String[] args){
    PrivateLock privateLock = new PrivateLock();
    for(int i = 0; i < 10; i ++){
      executorService.execute(privateLock::method);
    }
  }
}
