# 知りたいこと

- java.util

# source

[docs](https://gihyo.jp/article/2022/07/java2022-0701)
[icpc past questions](https://www.cse.kyoto-su.ac.jp/~hiraishi/ICPC/)
[oracle java api document](https://docs.oracle.com/en/java/javase/20/docs/api/index.html)

# 考え方

あるパラメータに対して最適が求められないかを考える(練習日、休日問題)
- 最適な分割方法がわからなくとも、休日をk回に分割すると決めたなら均等な分割が最小だとわかっている。この時点でkを走査するだけで良いのだ。

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

絶対値はjava.lang.Math.abs()

無限大は、Float.POSITIVE_INFINITYと、FLOAT.NEGATIVE_INFINITY;

拡張for
```
for(要素の型 cmp: コレクション){}
```

集合の最大: java.util.Collections.max
```
Collections.max(set)
```
# 印刷するもの

- このノート
- 授業ノート
