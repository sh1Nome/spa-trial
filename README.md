# vue-rest-trial
フロントエンドにVue、バックエンドにSpring Boot（RESTAPI）を使ったアプリを作ってみて仕組みを勉強したい

# 作ってみるもの（要件）
## フロントエンド（Vue - SFC）
* hoge画面、fuga画面、piyo画面（Vue Router）
* 各画面を遷移するヘッダー
* 画面が表示されたタイミングでRESTAPIのエンドポイントにリクエストを投げ、レスポンスを画面に表示する
* エンドポイント`piyo`からのレスポンス`greeting`は1度取得したらすべての画面で表示する（Vuex）
* すべての画面にある削除ボタンを押下すると`greeting`が消える（Vuex）
* 簡単なデザイン（Tailwind CSS）

## バックエンド（Spring Boot）
* RESTAPIのエンドポイントを3つ用意する
* Swaggerを使う

|メソッド|エンドポイント|ボディ|レスポンス|
|:-:|:-:|:-:|:-:|
|GET|hoge||`{"name": "hoge画面"}`|
|GET|fuga||`{"name": "fuga画面"}`|
|POST|piyo|`{"greeting": "おはよう"}`|`{"name": "piyo画面", "greeting": "おはよう"}`|

## 基盤技術
* VueとSpring Bootの開発・実行環境はDockerで用意する
