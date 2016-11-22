package tutorial1

import com.rabbitmq.client.ConnectionFactory

object Producer {
  val QUEUE_NAME = "hello"

  def main(args: Array[String]): Unit = {
    val factory = new ConnectionFactory
    factory.setHost("localhost")
    val connection = factory.newConnection
    val channel = connection.createChannel

    channel.queueDeclare(
      // queue
      QUEUE_NAME,

      // durable
      true,

      // exclusive: 本connectionからの接続のみを受け付ける
      false,

      // autoDelete
      false,

      // arguments
      null
    )
    val message = "hello, world!"
    channel.basicPublish(
      // exchange
      "",

      // routingKey
      QUEUE_NAME,

      // props
      null,  // TODO なにこれ？

      // body
      message.getBytes
    )
    println(s"[x] Sent '$message'")

    channel.close()
    connection.close()
  }
}
