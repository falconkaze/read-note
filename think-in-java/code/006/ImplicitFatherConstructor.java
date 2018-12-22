
public class ImplicitFatherConstructor {

  public static void main(String[] args) {

  }

}

class Father {
  private Father() {
  //public Father() {
    this.name = "father";
  }

  public static Father getInstance(){
    return new Father();
  }
  
  public String name;
}

class Son extends Father {

  public Son(){
  }

  public String father;

}
