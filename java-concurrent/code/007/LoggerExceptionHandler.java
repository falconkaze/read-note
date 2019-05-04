import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExceptionHandler implements Thread.UncaughtExceptionHandler{

  public static void main(String[] args) {
    LoggerExceptionHandler handler = new LoggerExceptionHandler();
    new Thread(handler::run).start();
  }

  @Override
  public void uncaughtException(Thread t, Throwable e){
    Logger logger = Logger.getAnonymousLogger();
    logger.info("my handler is running");
    logger.log(Level.WARNING, t.getName(), e);
  }

  private void run() {
    throw new RuntimeException("my test exception");
  }

}