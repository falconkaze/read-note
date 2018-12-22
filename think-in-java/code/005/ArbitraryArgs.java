
public class ArbitraryArgs {

  public static void main(String[] args) {
    test(1, 'a');
    test('a', 'b');
  }

  private static void test(float f, Character... args) {
    System.out.println("first");
  }

  //private static void test(char i, Character... args) {
  //private static void test(Character... args) {
    System.out.println("second");
  }

}
