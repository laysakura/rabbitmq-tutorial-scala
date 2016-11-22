# rabbitmq-tutorial-scala

https://www.rabbitmq.com/tutorials/tutorial-one-java.html から始まるTutorialをScalaでこなす。

## 事前準備

### RabbitMQの導入

```bash
brew install rabbitmq

rabbitmq-server
```

## メール送信

**そのまま実行すると中谷のメールアドレスにテストメール届くので、 `snakatan@` の箇所は置換してください！！！！**

```bash
$ sbt run

[info] Loading project definition from /Users/snakatani/.ghq/src/gitlab.dev.folio-sec.com/snakatani/Amazon-SES-example/project
[info] Set current project to Amazon-SES-example (in build file:/Users/snakatani/.ghq/src/gitlab.dev.folio-sec.com/snakatani/Amazon-SES-example/)
[info] Updating {file:/Users/snakatani/.ghq/src/gitlab.dev.folio-sec.com/snakatani/Amazon-SES-example/}root...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/snakatani/.ghq/src/gitlab.dev.folio-sec.com/snakatani/Amazon-SES-example/target/scala-2.11/classes...
[info] Running AmazonSESExample
Attempting to send an email through Amazon SES by using the AWS SDK for Java...
Email sent!
[success] Total time: 6 s, completed 2016/11/18 19:03:53
```
