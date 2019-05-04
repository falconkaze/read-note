
public class WaitNotify {

    public static void main(String[] args) {
        TestThread testThread = new TestThread("test-thread");
        Thread thread = new Thread(testThread::lock);
        synchronized(testThread){
            try {
                thread.start();
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + ": start testThread");
                testThread.start();
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + ": wait()");
                // 让当前线程进入阻塞状态，并解除所有持有锁。如果不是锁的持有者，会抛出异常IllegalMonitorStateException。
                testThread.wait();
                System.out.println(Thread.currentThread().getName() + ": end main method");
                testThread.wait(1000);
                System.out.println(Thread.currentThread().getName() + ": end main method");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

class TestThread extends Thread{

    private String lock = "lock";

    public TestThread(String name){
        super(name);
    }

    @Override
    public void run(){
        synchronized(this){
            System.out.println(Thread.currentThread().getName() + ": call notify()");
            notify();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void lock(){
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        synchronized(this){
            System.out.println(Thread.currentThread().getName() + ": lock method");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}