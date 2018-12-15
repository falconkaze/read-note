
public class ConstructBlock {

  public static void main(String[] args) {
    new Son();
  }

}

class Father{

  {
    System.out.println("Father construct block is running.");
  }

  public Father(){
    System.out.println("Father construct is running.");
  }

}

class Son extends Father{

  {
    System.out.println("Son construct block is running.");
  }

  public Son(){
    System.out.println("Son construct is running.");
  }

}
