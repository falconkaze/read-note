
public class OuterClass {

  private InnerClass variable = new InnerClass("Member variable.");
  private InnerClass constructorBlock;

  {
    this.constructorBlock = new InnerClass("Constructor block.");
  }

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    InnerClass innerClass = outerClass.getInnerClass();
    OuterClass.InnerClass newClass = outerClass.new InnerClass("OutClass new.");
    // InnerClass innerClass = new InnerClass();
    System.out.println(innerClass.getName());
    System.out.println(outerClass.constructorBlock.getName());
    System.out.println(outerClass.variable.getName());
    System.out.println(newClass.getName());
  }

  public InnerClass getInnerClass() {
    return new InnerClass("Not static method.");
  }

  class InnerClass {

    private String name;

    public InnerClass(String name){
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public OuterClass getOuterClass(){
      return OuterClass.this;
    }

    // 非static内部类不能有static域。
    //public static void staicGetOuterClass(){
    //}

  }

}
