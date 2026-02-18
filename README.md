# theme-learning-program-unittest
このリポジトリはプログラム作成・単体テストの学習を目的としたプロジェクトです。
---

## 📌 概要
- 目的：コーディング基礎スキル向上
- 対象：プログラミングと単体テストの初学者・未経験
- 特徴：JavaとPythonで同じ内容の学習が可能
- ルール：
  - AIチャットでコードを生成するのはNG、文法を調べるなどはOK
  - 不明点はすぐに質問、作成後はレビュー依頼をすること
---

## 🛠 使用技術
- Language：Java / Python
- Framework：なし
- DB：なし
- UnitTest：Junit / Pytest
- Tool：Git, GitHub
---

## 📂 ディレクトリ構成
```text
theme-learning-program-unittest
│
├─ java_project/src/main/java/com/example/grade
│  ├─ AbstractGradeReport.java (成績表抽象クラス)
│  └─ GradeReport.java (成績表クラス)
├─ java_project/src/main/java/com/example
│  └─ Main.java (実行クラス)
├─ java_project/src/test/java/com/example/grade
│  └─ GradeReportTest.java (テストクラス)
│
├─ python_project/src/grade/
│  ├─ abstract_grade_report.py (成績表抽象クラス)
│  └─ grade_report.py (成績表クラス)
├─ python_project/src
│  └─ main.py (実行クラス)
└─ python_project/tests/grade
   └─ test_grade_report.py (テストクラス)
```
---

## 📘 学習内容
### 概要
成績表抽象クラスを継承した成績表クラスを作成する。  
評価判定、入力値チェック、試験順位の表示、の3機能を実装する。  
実行クラスでインプット情報を定義、成績判定を呼び出し、順位表の中身をコンソールに出力する。  
実装した機能に対する単体テストケースを作成、テストを実施する。

### 1. 事前準備
※やり方が分からない方はご相談ください
- Eclipse / VSCodeのエディタを用意
- Java(推奨:17) / Python(推奨:3以上)をインストール
  - https://www.oracle.com/jp/java/technologies/downloads/
  - 「Windows」をクリック > 「x64 Installer」のURLをクリック > インストーラ起動
  - java -version を実行してバージョン表示されること
  - https://www.python.org/downloads/
  - 「Download Python install manager」をクリック > インストーラ起動
  - python -v を実行してバージョン表示されること
- Gitをインストール
  - https://git-scm.com/install/windows
  - 「Windows」の「Click here to download」をクリック > インストーラ起動
  - git -v を実行してバージョン表示されること
- プロジェクト作成 
  - GitHubからプロジェクトをクローン
  - 「feature/{name}」ブランチを作成
- Mavenをインストール（Javaの場合は必要）
  - https://maven.apache.org/download.cgi
  - apache-maven-3.9.12-bin.zip をクリック > インストール実行
  - C:ドライブ配下に移動
  - ユーザー環境変数のPath変数の値に{Maven配置パス}/binを設定
  - mvn -v を実行してバージョン表示されること

### 2. プログラム作成
- 評価判定
  - 入力値チェックを行う
    - NG：Nullを返却
    - OK：成績の作成を行い成績を返却
  - 評価を判定、判定基準は生徒の試験点数(100点満点)と出席回数
    - A：試験点数が80点以上かつ出席回数が10割
    - B：試験点数が60点以上かつ出席回数が8割以上
    - C：試験点数が40点以上かつ出席回数が6割以上
    - D：C判定を満たしていない
  - 成績を成績表へ追加する、項目は以下
    - 生徒名,出席回数,試験点数,評価
  - 評価を返却
- 入力値チェック(単項目)
  - 生徒名と試験点数と出席回数をチェックする 
    - ※チェック内容の検討から実施する
- 試験順位の表示
  - 成績表の中身を試験点数順でコンソール表示する
  - 例）順位:1, 生徒名=山田太郎, 試験点数=80
#### 実行コマンド
```bash
＃Javaの場合
cd /{プロジェクト配置場所}/theme-learning-program-unittest\java_project
mvn compile
mvn --% exec:java -Dexec.mainClass=com.example.grade.Main

＃Pythonの場合
cd /{プロジェクト配置場所}/theme-learning-program-unittest\python_project
.venv\Scripts\Activate.ps1
python ./src/main.py
```

### 3. 単体テスト
- 3機能に対してテストケースを作成する
- カバレッジを100％を目指す（ケースによっては要相談）
#### 実行コマンド
```bash
＃Javaの場合
cd /{プロジェクト配置場所}/theme-learning-program-unittest\java_project
mvn test -Dtest=GradeReportTest

＃Pythonの場合
cd /{プロジェクト配置場所}/theme-learning-program-unittest\python_project
.venv\Scripts\Activate.ps1
python -m pytest -v ./tests/grade/test_grade_report.py
```
---
