
public class ConstructorSort {

  public static void main(String[] args) {
    new Son();
  }

}

class Father {

  private Member fatherMem = new Member("father");

  public Father() {
    System.out.println("Father");
  }

}

class Son extends Father {

  private Member sonMem = new Member("son");

  public Son() {
    System.out.println("Son");
  }

}

class Member {

  public Member(String name) {
    System.out.println("Member" + name);
  }

}
