
public class StringAppend {
  
  public static void main (String[] args) {
    String mango = "mango";
    String value = "abc" + mango + "def" + "ghi" + 47;
    String value1 = "abc" + 47;
    final String finalMango = "Final Mango";
    String value2 = "abc" + finalMango + "def";
    System.out.println(value);
    System.out.println(value2);
  }

}
