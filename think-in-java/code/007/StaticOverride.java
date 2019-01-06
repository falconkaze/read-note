
public class StaticOverride {

  public static void main (String[] args) {
    Father father = new Father();
    Father.printName();
    father.printName();
    Son son = new Son();
    Son.printName();
    son.printName();
    Father son2 = new Son();
    son2.printName();
    System.out.println(father.name + son.name + son2.name);
  }

}

class Father {

  static String name = "father";

  static void printName() {
    System.out.println("Father" + ": " + name);
  }

}

class Son extends Father {

  static String name = "son";

  static void printName() {
    System.out.println("Son" + ": " + name);
  }
}
