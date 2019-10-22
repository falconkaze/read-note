# 第二章 1-1

1. TODO

2. 插入排序非升序，将内循环的比较大小的判断换个方向就行了。

    ```pseudocode
    insertSortDesc(A)
        for i = 1 to A.length - 1
            value = A[i]
            j = i - 1
            while j >= 0 and value > A[j]
                A[j + 1] = A[j]
                j--
            A[j + 1] = value
    ```

3. 线性查找

    ```pseudocode
    linearFind(A, value)
        for i = 0 to A.length - 1
            if value = A[i]
                return i
        return NULL
    ```

    循环不变式：i 左侧的子数组不存在指定的值 v。

4. 两个 n 位整数相加

    形式化描述：逆序轮询两个数组，相加，如果有进位，进位与下一轮两数相加。

    ```pseudocode
    add(A, B)
        min_size = min(A.length, B.length)
        max_size = max(A.length, B.length)
        carry = 0
        for i = 0 to min_size
            sum = A[A.length - i] + B[B.length] - i] + carry
            carry = sum / 10
            if carry > 0
                C[max_size - i] = sum - 10
            else
                C[max_size - i] = sum
        return C
    ```

TODO(测试)
