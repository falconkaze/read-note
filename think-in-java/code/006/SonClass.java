
public class SonClass {

  public static void main(String[] args) {
    Father father = new Father();
    father.printName();
    Son son = new Son();
    son.printName();
    Father son2 = new Son();
    son2.printName();
    System.out.println("--------------------------------");
    System.out.println(father.getClass() + ": " + father.name);
    System.out.println(son.getClass() + ": " + son.name);
    System.out.println(son2.getClass() + ": " + son2.name);
  }

}

class Father {

  String name = "father";

  public void printName() {
    System.out.println(this.getClass() + ": " + this.name);
    System.out.println(getClass() + ": " + name);
  }

}

class Son extends Father {

  String name = "son";
  //int name = 1;

  public void printName() {
    System.out.println(this.getClass() + ": " + this.name);
    System.out.println(getClass() + ": " + name);
    System.out.println(super.name + this.name + name);
  }

}
