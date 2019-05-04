
public class ThreadPriority {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() 
            + "(" + Thread.currentThread().getPriority() + ")");
        Thread thread1 = new MyThread("thread-001");
        Thread thread2 = new MyThread("thread-002");
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread2.start();
        thread1.start();
    }

}

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()
                + "(" + Thread.currentThread().getPriority() + ")"
                + ", loop: " + i);
        }
    }
}