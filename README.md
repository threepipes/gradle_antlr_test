# gradle_antlr_test
antlrをgradleから使うテスト


## parser作成
```
gradle buildParser clean
```

1. C++のgrammarファイルをgitからダウンロード
2. grammarファイルからlexer等生成
3. package宣言を追加し，しかるべき場所に配置
4. ついでにテスト用C++ファイルもセット

## eclipseプロジェクトに変換
```
gradle eclipse
```
