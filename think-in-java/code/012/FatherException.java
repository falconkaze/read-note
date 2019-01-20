import java.io.IOException;

public class FatherException {

  public FatherException() throws IOException{

  }

}

class SonException extends FatherException {

  public SonException() throws Exception {
    try{
      //super();
    }catch (Exception e) {
    }
  }

  
}
