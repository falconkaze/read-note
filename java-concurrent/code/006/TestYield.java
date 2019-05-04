import java.util.concurrent.CountDownLatch;

public class TestYield {

    public static void main(String[] args) {
        YieldThread thread1 = new YieldThread("tread-001");
        YieldThread thread2 = new YieldThread("tread-002");
        YieldThread thread3 = new YieldThread("tread-003");
        thread1.start();
        thread2.start();
        thread3.start();
        YieldThread.countDownLatch.countDown();
    }

}

class YieldThread extends Thread {

    public static CountDownLatch countDownLatch = new CountDownLatch(1);

    public YieldThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        try {
            countDownLatch.await();
            for(int i = 0; i < 10; i ++){
                synchronized(YieldThread.class){
                        System.out.println(Thread.currentThread().getName() + "获取到锁!!!");
                        Thread.yield();
                        // 会死锁
                        // YieldThread.class.wait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}