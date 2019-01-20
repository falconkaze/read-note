import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Java编程思想（第四版，中文）P221，在调用Arrays.asList()的时候不需要指定产生List的实际类型，编译器会自动根据赋值变量的List参数类型来确定。
 * 但是如果结果不用赋值给某一个变量，那么asList()默认会返回参数数组元素的公有父类的List，也可以使用<>来指定容器中元素的类型。
 */
public class ArraysAsList {

  public static void main (String[] args) {
    List<Snow> onlySubSnowList = Arrays.asList(
        new Powder(), new Touch()
        );
    List<Snow> onlyGrandSubSnowList = Arrays.asList(new Light(), new Hard());
    List<Snow> subSnowList = Arrays.asList(new Light(), new Heavy());
    System.out.println(onlySubSnowList.size());
    System.out.println(onlyGrandSubSnowList.size());
    System.out.println(subSnowList.size());
    Arrays.<Snow>asList(new Light(), new Heavy()).set(0, new Hard());
    //Arrays.asList(new Light(), new Heavy()).set(0, new Hard());
  }

}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Touch extends Snow {
}

class Hard extends Touch {
}

class Soft extends Touch {
}
