# String

1. java编译器在优化String的 + 运算符时，通常有两种方法

  - 如果连续两个操作数均为常量，直接对其进行拼接。例如`final String value = "1"; String result = value + "2" +"3";`，编译器会直接给result赋值"123"。
  - 如果连续两个操作数需要运算后才能相加，使用StringBuilder进行append。例如`String value = "4"; String result = "1" + 2 + "3" + value;`，前三个操作数可以直接拼接，最后一个值是变量，会使用new一个StringBuilder对象来拼接。（java9后对这种情况进行了优化，反编译出的字节码与书中的结果已经不一样了，出现了一个新的名词`InvokeDynamic #0:makeConcatWithConstants`，有时间再做研究？？）

2. 如果有大量需要拼接的字符串，应该考虑使用StringBuilder，而不是依赖编译器对String的拼接来优化。另外，如果知道最终的字符串到该多长，可以实现指定StringBuilder的大小，避免StringBuilder多次扩容，影响效率。

3. 对象与String拼接的时候，会隐式地调用对象的toString方法。如果在对象类的toString方法中将对象和String拼接，会导致循环调用。要提防类似这种的隐式调用。

4. 在java中，所有新的格式化功能都由java.util.Formatter类处理，它能够控制输出位置。

5. 格式化说明符：`%[argument_index$][flags][width][.precision]conversion`

  width 控制最小尺寸，默认通过添加空格来确保达到最小尺寸。默认情况下，数据是右对齐，可以使用“-”标志来改变对齐方向

  precision 表示最大尺寸，对于不同的数据类型有不同的表现形式。用于String时，表示打印String输出字符的最大数量。用于浮点数时，表示小数部分要显示的位数（默认为8位小数）。不能用于整数

6. 类型转换字符

  - d 整数型（十进制）
  - c Unicode字
  - b Boolean值
  - s String
  - f 浮点数（十进制）
  - e 浮点数（科学计算）
  - x 整数（十六进制）
  - h 散列码（十六进制）

  注意：b对应布尔类型，但是匹配到其他类型的数据也不会报错，只要参数不为null，那么转换的结果永远为true（即使是数据0也是这样）。

  ```String
  "%-15s %5s %10.2f"
  ```

6. 
