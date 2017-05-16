# gradle_antlr_test
gradleのantlrプラグインを利用し，構文解析器を生成してJavaプロジェクトに組み込むためのビルドスクリプト

## 概要
antlrで生成した構文解析器を使うために，以下の作業が必要である．

* antlrのダウンロード
* 文法ファイルの生成(今回はダウンロード)
* antlrを利用し文法ファイルから構文解析器を生成
* プロジェクトに配置

一連の作業に手間がかかるので，ビルドスクリプトを作成した．

本プロジェクトは特定(C++)の文法ファイルを使うためのシステムであるが，
ダウンロード先等を変更することで他の文法ファイルにも適用可能である．

## 必要環境

* gradle

https://gradle.org/install


## ビルドコマンド

### parser作成
```
gradle buildParser clean
```

1. C++のgrammarファイルをgitからダウンロード
2. grammarファイルからlexer等生成
3. package宣言を追加し，しかるべき場所に配置
4. ついでにテスト用C++ファイルもセット

### eclipseプロジェクトに変換
```
gradle eclipse
```

## ビルド後のsrc構成
```
src
├─ main
│  ├─ antlr
│  │     CPP14.g4
│  │
│  └─ java
│     │  Lexer.java
│     │
│     └─ cpp
│           CPP14.tokens
│           CPP14BaseListener.java
│           CPP14Lexer.java
│           CPP14Lexer.tokens
│           CPP14Listener.java
│           CPP14Parser.java
│
└─ test
   ├─ java
   │     LexerTest.java
   │
   └─ resources
         test.cpp
```
