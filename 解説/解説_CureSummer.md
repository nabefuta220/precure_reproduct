
# 技術情報

```
c:\XXXX>javac -version
javac 14.0.2

c:\XXXX>java --version
java 14.0.2 2020-07-14
Java(TM) SE Runtime Environment (build 14.0.2+12-46)
Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)
```

# プログラムの全体図



![](..\out\docu\uml\CureSummer.png)

## package cure

### class Summer

このクラスはpackage tropical_rouge_precure_rootのclass:tropical_roue_precure から継承(もとになるクラスの内、privateではないフィールド・メソッドを引き継ぐ)しています。

#### Summer()

public(外部からでも参照可能)なコンストラクタです。　引数はありません。

## package precure_root

### class Precure

技などをまとめているクラスです。

#### tropical_change(identer:String):tropical_rouge_precure

publicでstatic(クラスの初期化に影響されない)なメソッドです。引数として、`String`型のidenterを受け取り、
identerが`CureSummer`ならば、packae cureのclass:Summerが返ります。

それ以外の場合は例外を投げます。

#### Precure()

publicなコンストラクタです。引数はありません。

#### otento_summer_strike(summer:tropical_rouge_precure):void

publicなメソッドです。引数として`tropical_rouge_precure`のsummerを受け取り、返り値はありません。

summerの識別子がCureSummerのものでなければ、例外を投げます。

## package tropical_rouge_precure_root

### class tropical_rouge_precure

トロピカルージュプリキュアの基幹となるクラスです。package precure_base_rootのclass:Precure_baseから継承しています。

#### heart_rouge_rod :Heart_rouge_rod

publicなフィールドです。

#### tropical_rouge_pecure()

pulicなコンストラクタです。　引数はありません。

## package tools

プリキュアが扱う道具をまとめています。

### class Heart_rouge_rod

プリキュアが浄化技を使うときにつかうclassです。

#### id:int

privateなフィールドです。

#### Heart_rouge_rod()

publicなコンストラクタです。　引数はありません。

#### set(key:int)void
#### getId():int

idのaccesserです。

### Heartcle_pact

プリキュアが変身するのに必要な道具です。

#### key:Heartcle_ring

privateなフィールドです。

#### Heartcle_pact(key:Heartcle_ring)
#### Heartcle_pact()

publicなコンストラクタです。引数有り版は、代入も兼ねています。

#### setKey(key:Heartcle_ring):tropical_rouge_precure
#### setKey():tropical_rouge_precure

keyのsetterです。しかし、その後にkeyの値によって、tropical_rouge_precureの変身が行われます。


### enum Heart_cle_ring

Heartcle_pactにはめることができるHeart_cle_ringをまとめた列挙型です。

#### CureSummer_key
#### None

この列挙型の値です。

#### id:int


privateなフィールドです。

#### Heartcle_ring(id:int)


privteなコンストラクタです。そのため、内部的に値が保存されます。

#### checkId(key:Hearcle_ring):boolean

publicなメソッドです。このクラスに格納されている物がkeyであるかを判断し、同じならば`true`を、そうでなければ`false`を返します。

#### getId():int

publicなメソッドです。このクラスのidの値を返します。

## package precure_base_root


### class Prcure_base

プリキュアの基幹となるclassです。

#### color:int

protected(このクラスもしくは、このクラスを継承しているクラスからしかアクセスできないもの)なフィールドです。色を格納します。

#### id:int

protectedなフィールドです。

#### state:Statment

protectedなフィールドです。

#### Precure_base()

publicなコンストラクタです。引数はありません。

#### setId(id:int):void
#### getId():int

idのAccesserです。

#### showColor():void

publicなメソッドです。このクラスのcolorを出力します。

### enum Statment

状態を管理する列挙型です。

#### NA
#### inter_fransformation
#### ready


この列挙型の値です。

#### id:int

privateなフィールドです。

#### Statement(id:int)

privateなコンストラクタです。

#### cheak_statement(state:Statement):boolean

publicなメソッドです。この列挙型に格納されている物がstateであるかを判断し、同じならば`true`を、そうでなければ`false`を返します。

# 使い方

## 変身時

次の3通りの方法でできます。


1. 直接コンストラクタを呼び出す

```java
cure.Summer summer = new cure.Summer();
```

2. class:Precureの メソッド:tropical_changeで呼び出す

```java
import precure_root.*;
import tropical_rouge_precure_root.*;
...
Precure precure = new Precure();
tropical_rouge_precure summer = Precure.tropical_change("CureSummer");
```
(呼び出すときにPrecureの型を作っておくこととsummerの型が`tropical_rouge_precure`であることに注意)

3. class:Heartcle_pactのメソッド:setから呼び出す

```java
import tools.*;
import tropical_rouge_precure_root.*;
...
	Heartcle_pact pact = new Heartcle_pact();
		tropical_rouge_precure summer = pact.setKey(Heartcle_ring.CureSummer_key);

```

## 技の繰り出し方

どのような変身でも、次のような方法でできます。

```
precure.otento_summer_strike(summer);
```

## 実行例
(ソースコード:src/Main.java)
```
import precure_root.*;
import tools.*;
import tropical_rouge_precure_root.*;

public class Main {
	public static void main(String[] args) {
		Precure precure = new Precure();
		// transfromation
		// cure.Summer summer = new cure.Summer();// (a)

		// tropical_rouge_precure summer = Precure.tropical_change("CureSummer");// (b);

		Heartcle_pact pact = new Heartcle_pact();
		tropical_rouge_precure summer = pact.setKey(Heartcle_ring.CureSummer_key);// (c)

		// cure
		precure.otento_summer_strike(summer);

	}
}
```

(ターミナルの出力)
```
C:\XXXX\precure_reproduct>javac -classpath src -d bin src/Main.java

C:XXXX\precure_reproduct>java -classpath bin Main
key :CureSummer_key
precure tropical change!
Let's make catch!
cheek!
eyes!
hair!
dress!
Exciting everlasting summer! Cure Summer!
heart rouge rod!
precure! otento summer strike!
```