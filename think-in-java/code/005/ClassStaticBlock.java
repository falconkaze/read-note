
public class ClassStaticBlock {

  static {
    //System.out.println("static block, a=" + a + ", b=" + b);
    b = f1(2);
    //System.out.println("static block, b=" + b);
  }
  static int a = f1(1);
  static int b;

  public static void main(String[] args){
    System.out.println("Main funcion is running.");
    System.out.println("a: " + a + " b: "+ b);
  }

  static int f1(int value){
    System.out.println("f1: " + value);
    return value;
  }

}
