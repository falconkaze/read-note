
public class SynchronizedBlock {

    public static void main(String[] args) {
        SynchronizedBlock block = new SynchronizedBlock();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++){
            block.block();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++){
            block.method();
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }

    private void block() {
        synchronized(this){
        }
    }

    private synchronized void method(){
    }

}