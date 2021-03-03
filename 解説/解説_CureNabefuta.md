
# 技術情報

```
c:\XXXX\precure_reproduct\src>javac -version
javac 14.0.2

c:\XXXX\precure_reproduct\src>java --version
java 14.0.2 2020-07-14
Java(TM) SE Runtime Environment (build 14.0.2+12-46)
Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)
```

# プログラムの全体図



![](..\out\docu\uml\CureNabefuta.png)

### class cure.Nabefuta

#### flag

他からは参照できない、`int`型のフィールド(変数)です。

#### Nabefuta(num:int)

他からも参照できる、コンストラクタです。変数として、`int`型の引数:numを受け取ります。

#### getFlag():int

他からも参照できる、メソッド(関数)です。返り値として、`int`型を返します。

### class action

技:actionのクラスです。

#### action(a:cure.Nabefuta):void

引数として、`cure.Nabefuta`型の引数:aを受け取ります。返り値はありません。

#### action():void

引数はありません。返り値もありません。

(プログラムの解説)

### src\cure\Nabefuta.java

- 1行目: `package (名前){ ... }`

ここでは、中に書かれた関数などについて、前書きのような物を追加しています。

(例えば、自由の女神、とだけ言うと、ニューヨークにある物か、フランスにある物か区別がつきませんが、
ニューヨークの自由の女神というと、どんな物かがはっきり決まります。この場合、ニューヨークのというところがnamespaceの部分に当たります。)

namespaceの中にある関数などを使うときは、同じnamespaceの中で使うときは、いつも通り使えますが、外で使う時は、
`(名前).(クラスなど)`というようにして使う必要か、ファイルの最初で`import (名前).(クラスなど);`と宣言する必要があります。


- 3~14行目:`public class Nabefuta`

ここからがメインのクラス部分です。

クラスとは、複数のメソッドやフィールドをまとめた扱える物です。

また、`public class`と書くことで、どこでもこのクラスにアクセスできるようになります。

(ただし、1つのファイルにつき、1つしか使えません)

- 4行目:`private int flag`

`private`は、特別な場合を除いて、同じクラスのなかでしか扱えないようににする修飾子です。

ここでは、`int`型のフィールド:flagが該当します。

- 6,10行目:`public ...`
`public`は、は、どこからでも呼び出すことができます。

ここでは、コンストラクタと、`int`型を返すメソッド:getFlag(引数はなし)が該当します。

- 6~8行目:`Nabefuta(int num){...}`

これは引数があるため、一見、メソッドにみえますが、返り値の型がなく、最初に呼びだされる関数であるコンストラクタです。

また、7行目にある`this`は、クラスそのものを表し、`this.(何か)`とすることで、このクラスにある(何か)にアクセスできます。

- 10~12行目:`int getFlag(){..,}`

メソッドです。
しかし、メソッドを使うことで、外からでもprivateなフィールドの値を読み取ったり、書き込むことができるため、
それぞれ、`getter`、`setter`(これらをまとめて`accessor`)と呼ばれます。

### src\precure\action.java

- 1行目: `package (名前){ ... }`

先ほど述べたのと同じく、パッケージ宣言です。

- 3~12行目: `public class action{ ... }`

クラス部分です。


- 5~7行目: `public action(){ ... }`

コンストラクタです。引数はありません。

- 6行目: ` System.out.println("NA");`

出力関数です。`System.out`は標準出力につながっています。

また、引数は`"a" + "b"`のように、連結することができます。


- 9~11行目:`pulic action(Cure.Nabefuta& a){ ... }`

これもコンストラクタです。

引数は前のと違って、`Cure.Nabefuta` のaとなっています。

これらの関数は名前は同じなので、エラーが出るのでは？と言う人もいますが、Javaの場合、引数が違えば、関数名が同じでも
区別することがでるため、呼び出すことができます。(これを`overload`:オーバーロードと呼びます。)


`src\Main.java`をコンパイルして、実行すると、次のように出力します。


(ターミナルの出力)
```
c:\XXXX\precure_reproduct>javac -classpath src -d bin src/Main.java

c:\XXXX\precure_reproduct>java -classpath bin Main
action :5
NA
```
最初の`javac ...`では`Main`メソッドがあるファイルとそのファイルが使われるファイルをコンパイル(コンピュータが読める文字に変換する)し、`(ファイル名).class`というファイルを作ります。

`-classpath`というのは、クラスが書かれたファイルの場所を追加する物です。

また、`-d`を使うと、`(ファイル名).class`が作られる場所を指定することができ、今回はここのファイルにある`bin`に`.class`が作られます。


次の`java ...`では、実行をおこないます。

同様に、`-classpath`を使うことで、`(ファイル名).class`があるファイルを指定することができます。

ただし、実行したいファイルの指定はファイルの名前のみです(`(名前).class`や`bin/(名前)`とするとエラーが出ます。)

