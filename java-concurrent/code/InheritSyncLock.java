import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class InheritSyncLock {

  private static ExecutorService executorService = Executors.newFixedThreadPool(2);

  public static void main(String[] args) throws Exception{
    Son son = new Son();
    executorService.execute(son::lockFather);
    Thread.sleep(1000);
    executorService.execute(son::lockMethod);
  }

}

class Father {

  public synchronized void lockMethod(){
    try{
      System.out.println("Get father lock: " + Thread.currentThread().getName() + System.currentTimeMillis());
      Thread.sleep(5000);
      System.out.println("Release father lock: " + Thread.currentThread().getName() + System.currentTimeMillis());
    }catch (InterruptedException e){
      e.printStackTrace();
    }
  }

}

class Son extends Father{

  public synchronized void lockMethod() {
    try{
      System.out.println("lockMethod: " + Thread.currentThread().getName() + System.currentTimeMillis());
      super.lockMethod();
      Thread.sleep(10000);
      System.out.println("lockMethod: " + Thread.currentThread().getName() + System.currentTimeMillis());
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void lockFather() {
    try{
      System.out.println("lockFather: " + Thread.currentThread().getName() + System.currentTimeMillis());
      super.lockMethod();
      Thread.sleep(10000);
      System.out.println("lockFather: " + Thread.currentThread().getName() + System.currentTimeMillis());
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
