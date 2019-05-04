import java.util.Timer;
import java.util.TimerTask;

public class TimerException {

    public static void main(String[] args) throws Exception{
        Timer timer = new Timer();
        MyTimerTask timerTask = new MyTimerTask();
        MyTimerTask timerTask1 = new MyTimerTask();
        timer.schedule(timerTask, 1L);
        Thread.sleep(1000);
        timer.schedule(timerTask1, 1L);
        Thread.sleep(5000);
    }

    static class MyTimerTask extends TimerTask {
        
        @Override
        public void run(){
            throw new RuntimeException();
        }
    }

}