
public class ConstructorPolymorphism {

  public static void main(String[] args){
    new Son();
    new Father();
  }
}

class Father {

  private String name = "father";

  public Father() {
    System.out.println("Father" + getName() + "name=" + name);
  }

  public String getName(){
    System.out.println("Father's getName");
    return name;
  }

}

class Son extends Father{
  
  private String name = "son";

  public Son(){
    System.out.println("Son" + getName() + "name=" + name);
  }

  public String getName(){
    System.out.println("Son's getName");
    return name;
  }
}
