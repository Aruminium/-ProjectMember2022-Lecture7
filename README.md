【Java総合問題】○ケモンのバトルシステムの簡易版

[ProjectMember2022](https://github.com/fujiitomoko/ProjectMember2022Document)の最終問題です

目的：継承やinterface、enum, VO等を用いて実装する。
※クラス図の構成が(システム的に)正しいとは限りないので、自由に実装してみてください

![Exercise7](https://user-images.githubusercontent.com/73931800/198674135-fa6aac32-c2e8-43d5-a044-47364ea81147.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/207304742-97708735-ece0-4928-91f5-39f870b32dab.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/207304891-674cb2bd-b435-406e-93ab-f98a312fa118.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/207305059-53f92553-8292-41e0-b2e6-56b70c83876d.png)

モンスターリスト①

|Turtle|Monkey|Penguin|
|:--:|:--:|:--:|
|HP:55|HP:44|HP:53|
|attack:17|attack:14|attack:12|
|defense:16|defense:11|defense:13|
|speed:15|speed:31|speed:20|

技リスト

|name|power|
|:--:|:--:|
|tackle(たいあたり)|10|
|scratch(ひっかく)|10|
|Peck(つつく)|15|
|razorLeaf(はっぱカッター)|12|
|ember(ひのこ)|10|
|bubble(あわ)|10|

モンスターリスト②

|Turtle|Monkey|Penguin|
|:--:|:--:|:--:|
|tackle|scratch|Peck|
|razorLeaf|tackle|tackle|
|ember	|bubble||

- Exercise7クラスを作成し、mainメソッドを作成しなさい。
- クラス図で分からない部分があればここを参照し、各自調べなさい。
- Turtle、Monkey、Penguinの中から気に入った1匹を選択しインスタンス化しなさい。
- name(名前),hitpoint(体力),attack(攻撃力),defense(防御力),speed(素早さ)は引数付きコンストラクタにて初期化しなさい。
- Monsterのコンストラクタに入れる値は下記のモンスターリスト①を参照しなさい。
- skillsには下記の技リストを参照しname,powerの要素を持つ技を追加しなさい。
- 各モンスターが持つ技はモンスターリスト②を参照しなさい。
- どのモンスターをインスタンス化したのかを分かるように表示させなさい。
- 野生のモンスターを新たにインスタンス化しなさい。
- 野生のモンスターは3つの技の中からランダムに1つを選択する。
- バトルを行う際には、speedが高いモンスターから行動を開始しなさい。
- ダメージが発生するごとに残りHPを表示させなさい。
- ここでは、attack+power-block=ダメージとする。

## 補足
- MonsterCretorはファクトリーパターン(デザインパターンの1つ)

## チェックポイント

- [ ] 標準入力での例外処理はできているか
- [ ] 残りHPより多いダメージを受けた時、HP=0となっているか
- [ ] アクセス修飾子を活用できているか。(例：HPクラスはプライベートパッケージ)
- [ ] interfaceをうまく活用して、異なる処理を1つメソッドで実装できているか
- [ ] デザインパターンや設計を意識して実装できたか

## 実行例

```shell
1 -> MONKEY
2 -> PENGUIN
3 -> TURTLE
オー○ド博士「ここに三匹のMonsterがおるじゃろ？好きなのを一匹選ぶんじゃ」 > a

1 -> MONKEY
2 -> PENGUIN
3 -> TURTLE
オー○ド博士「ここに三匹のMonsterがおるじゃろ？好きなのを一匹選ぶんじゃ」 > 9
オー○ド博士「他にMonsterはいないぞ？」

1 -> MONKEY
2 -> PENGUIN
3 -> TURTLE
オー○ド博士「ここに三匹のMonsterがおるじゃろ？好きなのを一匹選ぶんじゃ」 > 2

あ! 野生の Penguin が飛び出してきた！
ゆけっ！ Penguin！

-------------
プレイヤーの Penguin のHP: 53
野生の Penguin のHP: 53

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > 9
0 ~ 2 の範囲で入力してください

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > a

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > 1

プレイヤーの Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 53 -> 44)

野生の Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 53 -> 44)

-------------
プレイヤーの Penguin のHP: 44
野生の Penguin のHP: 44

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > 1

プレイヤーの Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 44 -> 35)

野生の Penguin の攻撃！
Penguin は bubble を繰り出した
Penguin に 9 のダメージ！ (HP 44 -> 35)

-------------
プレイヤーの Penguin のHP: 35
野生の Penguin のHP: 35

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > 1

プレイヤーの Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 35 -> 26)

野生の Penguin の攻撃！
Penguin は peck を繰り出した
Penguin に 14 のダメージ！ (HP 35 -> 21)

-------------
プレイヤーの Penguin のHP: 21
野生の Penguin のHP: 26

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > 1

プレイヤーの Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 26 -> 17)

野生の Penguin の攻撃！
Penguin は peck を繰り出した
Penguin に 14 のダメージ！ (HP 21 -> 7)

-------------
プレイヤーの Penguin のHP: 7
野生の Penguin のHP: 17

0 -> peck (power: 15)
1 -> tackle (power: 10)
2 -> bubble (power: 10)
技を選べ > 1

プレイヤーの Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 17 -> 8)

野生の Penguin の攻撃！
Penguin は tackle を繰り出した
Penguin に 9 のダメージ！ (HP 7 -> 0)

プレイヤーの Penguin は倒れた！
野生の Penguin の勝ち！
```

このリポジトリ内にソースコードあるのでよかったら参考にしてください
