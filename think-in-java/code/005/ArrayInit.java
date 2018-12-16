import java.util.Arrays;

public class ArrayInit {

  public static void main(String[] args){
    String[] array1 = {"1", "2", "3", };
    String[] array2 = new String[] {"1",
      "2",
      new String("3"),
    };
    printArray(array1);
    printArray(array2);
    printArray(new String[] {"1", "2"});
  }

  static void printArray(String[] args) {
    System.out.println(Arrays.toString(args));
  }

}
