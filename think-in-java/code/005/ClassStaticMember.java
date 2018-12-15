public class ClassStaticMember {

  public static void main(String[] args) {
    Table table1;
    System.out.println("Table1 not init");
    table1 = new Table(1); // 2
    Table.f1(1);           // 1
  }

}

class Table {
  Bowl bowl2 = new Bowl(2);
  static Bowl bowl1 = new Bowl(1);

  Table(int marker){
    bowl1 = new Bowl(3);
    System.out.println("Table: " + marker);
  }

  static void f1 (int marker) {
    System.out.println("f1: " + marker);
  }

}

class Bowl {

  Bowl(int marker) {
    System.out.println("Bowl: " + marker);
  }

}
