
public abstract class AnonymityClass {

  protected String name;

  public AnonymityClass() {
    this.name = "Default name";
  }

  public AnonymityClass(String name) {
    this.name = name;
  }

  public abstract String getName();

  public static void main(String[] args) {
    System.out.println(new AnonymityClass(){
      @Override
      public String getName(){
        return this.name;
      }
    }.getName());

    System.out.println(new AnonymityClass("User set name."){
      @Override
      public String getName(){
        return this.name;
      }
    }.getName());
  }

}
