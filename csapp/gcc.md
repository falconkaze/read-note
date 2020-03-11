# gcc 使用

gcc可以根据不同的C语言标准来编译程序：

  - CNU89 默认，-std=gnu89
  - ANSI, ISO C90 -ansi, -std=c89（C90有时候也叫C89）
  - ISO C99 -std=c99
  - ISO C11 -std=c11

-m32 编译为32位程序
-m64 编译为64位程序

## 选项

-Og     指定优化等级。g 表示生成符合原始 C 代码整体结构的机器代码的优化等级。还有O1，O2，优化等级依次升高。

-o      指定输出文件名字

-S      生成汇编文件

-c      编译并汇编该文件

# 其他软件

objdump，将机器代码转为汇编代码。objdump -d mstore.o
