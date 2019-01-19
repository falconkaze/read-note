
public class InheritInner extends OuterClass.InnerClass {

//  public InheritInner() {
//  }

  public InheritInner(OuterClass outerClass) {
    outerClass.super();
  }

  public InheritInner(OuterClass outerClass, String name) {
    outerClass.super();
    System.out.println(name);
  }

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    InheritInner inherit1 = new InheritInner(outerClass);
    InheritInner inherit2 = new InheritInner(outerClass, "Contructor method 2.");
  }

}

class OuterClass {
  class InnerClass{
  }
}
