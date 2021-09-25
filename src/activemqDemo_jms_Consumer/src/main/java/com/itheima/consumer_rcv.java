package com.itheima;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class consumer_rcv {
    public static void main1(String[] args) throws JMSException {
    ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://192.168.5.131:61616");
    Connection conn = factory.createConnection();

    conn.start();
    Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);

    Queue queue = session.createQueue("queue01");
    MessageConsumer consumer = session.createConsumer(queue);

        while (true){
        Message message = consumer.receive(); //接收消息，非监听
        if(message == null){
            break;
        }
        if(message instanceof TextMessage){
            TextMessage msg = (TextMessage)message;
            System.out.println("recieved message is : "+msg.getText());
        }
    }
}

}
