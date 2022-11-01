【Java総合問題】○ケモンのバトルシステムの簡易版

[ProjectMember2022](https://github.com/fujiitomoko/ProjectMember2022Document)の最終問題です

目的：継承やinterface、enum, VO等を用いて実装する。
※クラス図の構成が(システム的に)正しいとは限りないので、自由に実装してみてください

![Exercise7](https://user-images.githubusercontent.com/73931800/198674135-fa6aac32-c2e8-43d5-a044-47364ea81147.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/198861634-ea0426ed-cebb-4a23-8a25-b66e4c8d00df.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/198674207-d70985fa-759a-4a8e-8faf-c75846d7760e.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/198674228-e7885e6e-73be-4285-b5cd-852945ba3b65.png)

## 補足
- MonsterCretorはファクトリーパターン(デザインパターンの1つ)

## チェックポイント

- [ ] 標準入力での例外処理はできているか
- [ ] 残りHPより多いダメージを受けた時、HP=0となっているか
- [ ] アクセス修飾子を活用できているか。(例：HPクラスはプライベートパッケージ)
- [ ] interfaceをうまく活用して、異なる処理を1つメソッドで実装できているか

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
