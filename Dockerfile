# ベースイメージ（Java21）
FROM openjdk:21-jdk

# 作業ディレクトリ作成
WORKDIR /app

# jarファイルをコンテナ内にコピー
COPY target/patinko_financial_statement-0.0.1-SNAPSHOT.jar app.jar

# ポート開放（Spring Bootデフォルト8080）
EXPOSE 8080

# アプリ起動
ENTRYPOINT ["java", "-jar", "app.jar"]