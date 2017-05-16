# gradle_antlr_test
antlrをgradleから使うテスト

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

## src構成
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
