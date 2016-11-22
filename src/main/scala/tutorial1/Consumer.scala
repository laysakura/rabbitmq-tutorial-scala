package tutorial1

import com.rabbitmq.client.AMQP.BasicProperties
import com.rabbitmq.client.{ConnectionFactory, DefaultConsumer, Envelope}

object Consumer {
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

    val consumer = new DefaultConsumer(channel) {
      override def handleDelivery(consumerTag: String, envelope: Envelope, properties: BasicProperties, body: Array[Byte]): Unit = {
        val message = new String(body, "UTF-8")
        println(s"[x] Received '$message'")
      }
    }
    channel.basicConsume(
      // queue
      QUEUE_NAME,

      // autoAck
      true,

      // callback
      consumer
    )
  }
}
