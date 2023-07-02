# 知りたいこと

- java.util

# source

[docs](https://gihyo.jp/article/2022/07/java2022-0701)

# 技術

配列全体を出力したいとき、Arrays.toString()で処理
```
System.out.println(Arrays.toString(array));
```

String->int はInteger.parseInt()

C言語とは異なり、配列のサイズを変数で指定できる。


二次元配列。2x3は以下のように。
```
int[][] num = new int[2][];
num[0] = new int[3];
num[1] = new int[3];
```

```
List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
```

String.splitメソッドの空文字列の扱い。配列の末尾に空文字が入ることを避けるが、第2引数-1でこれを回避できる。
```
str.split("\"",-1);
```