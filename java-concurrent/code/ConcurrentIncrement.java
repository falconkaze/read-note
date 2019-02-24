import java.util.function.Supplier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentIncrement {

  private static int excutorNum = 10;
  private static ExecutorService executorService = Executors.newFixedThreadPool(excutorNum);
  private static int num;
  private static AtomicInteger atomicInteger = new AtomicInteger();

  public static void main(String[] args) {
    concurrentExecution();
    System.out.println("Program end!");
  }

  private static void concurrentExecution(){
    for(int i = 0; i < excutorNum; i ++){
      //executorService.submit(ConcurrentIncrement::syncIncrement);
      executorService.submit(ConcurrentIncrement::atomicIncrement);
    }
  }

  /**
   * 线程不安全的自增.
   */
  private static void unsafeIncrement(){
    num++;
    System.out.println(num);
  }

  /**
   * 使用synchronized关键字同步.
   */
  private static synchronized void syncIncrement(){
    num++;
    System.out.println(num);
  }

  /**
   * 使用AtomicInteger来保证线程anquan.
   */
  private static void atomicIncrement(){
    System.out.println(atomicInteger.addAndGet(1));
  }

}
